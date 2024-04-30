import DictioVisitor from '../../grammar/DictioVisitor.js';
import DictioLexer from '../../grammar/DictioLexer.js';
import DictioParser from '../../grammar/DictioParser.js';
import antlr4 from 'antlr4';

export default class CustomVisitor extends DictioVisitor {
    constructor(){
        super();
        this.memoria = new Map();
    }

	visitMain(ctx) {
	  return this.visitChildren(ctx);
	}


	visitContent(ctx) {
	  return this.visitChildren(ctx);
	}

    // Visit a parse tree produced by DictioParser#condif.
	visitCondif(ctx) {
        const conditionResult = this.visit(ctx.siono());

        // Si la condición es verdadera, ejecuta el bloque de contenido dentro del 'if'.
        if (conditionResult) {
            return this.visit(ctx.content());
        }
        // Si hay un bloque 'else' y la condición es falsa, ejecuta el bloque 'else'.
        else if (ctx.deotro()) {
            return this.visit(ctx.deotro());
        }
      }
      visitMientras(ctx) {
        let conditionResult = this.visit(ctx.siono());
        let visitas = []; // Array para almacenar los resultados de la visita
    
        while (conditionResult) {
            console.log("visita content");
            const resultadoVisita = this.visit(ctx.content()); // Obtener el resultado de la visita
            visitas.push(resultadoVisita); // Almacenar el resultado en el array visitas
             if (ctx.cambio()) {
            this.visit(ctx.cambio());
        }
            conditionResult = this.visit(ctx.siono());

        }
    
        return visitas; // Retornar el array con todos los resultados de las visitas
    }
    
  // Visit a parse tree produced by DictioParser#verdaderofalso.
	visitVerdaderofalso(ctx) {
        if (ctx.VERDAD()){
            return true;
         }
         if (ctx.FALSO()){
            return false;
         }
      }
  
  
      // Visit a parse tree produced by DictioParser#andor.
      visitAndor(ctx) {
        const left = this.visit(ctx.siono(0));
        const right = this.visit(ctx.siono(1));

        switch (ctx.op.type) {
            case DictioParser.AND:
                return left && right;
            case DictioParser.OR:
                return left || right;
            default:
                throw new Error("Operador lógico desconocido: " + ctx.op.text);
    }
      }
  
  
      // Visit a parse tree produced by DictioParser#comparaciones.
      visitComparaciones(ctx) {
        const left = this.visit(ctx.expr(0));
        const right = this.visit(ctx.expr(1));
        let leftValue;
        let rightValue;

        if (isNaN(left)){
            leftValue = this.memoria.get(left);
        }else{
            leftValue = left;
        }
        if (isNaN(right)){
            rightValue = this.memoria.get(right);
        }else{
            rightValue = right;
        }
   // Obtener el operador.
   const operator = ctx.op.type;


   // Realizar la comparación basada en el operador.
   switch (operator) {
       case DictioParser.MAYORQUE:
           return left > right;
       case DictioParser.MENORQUE:
           return left < right;
       case DictioParser.IGUAL:
           return left === right;
       case DictioParser.DIFERENTE:
           return left !== right;
       case DictioParser.MAYORIGUAL:
           return left >= right;
       case DictioParser.MENORIGUAL:
           return left <= right;

       default:
           throw new Error("Operador desconocido: " + operator);
   }
      }
      // Visit a parse tree produced by DictioParser#condiparens.
	visitCondiparens(ctx) {
        if (ctx.siono()) {
            return this.visit(ctx.siono());
        } else {
            throw new Error("Expresión esperada dentro de los paréntesis en línea " + ctx.start.line);
        }
      }
  
  
  
  // Visit a parse tree produced by DictioParser#deotroif.
	visitDeotroif(ctx) {
        const conditionResult = this.visit(ctx.siono());

        // Si la condición es verdadera, ejecuta el bloque de contenido dentro del 'if'.
        if (conditionResult) {
            return this.visit(ctx.content());
        }
        // Si hay un bloque 'else' y la condición es falsa, ejecuta el bloque 'else'.
        else if (ctx.deotro()) {
            return this.visit(ctx.deotro());
        }
      }
      visitCambio(ctx) {
        const id = ctx.ID().getText(); // Obtener el identificador de la variable
        let value = this.memoria.get(id); // Obtener el valor actual de la variable
    
        // Verificar si la variable existe en la memoria
        if (value === undefined) {
            throw new Error(`La variable '${id}' no ha sido declarada.`);
        }
    
        // Verificar si se trata de un incremento
        if (ctx.INCREMENTO()) {
            value++; // Incrementar el valor de la variable
        } else if (ctx.DECREMENTO()) { // Verificar si se trata de un decremento
            value--; // Decrementar el valor de la variable
        }
    
        // Actualizar el valor de la variable en la memoria
        this.memoria.set(id, value);
    }
    
  
  
      // Visit a parse tree produced by DictioParser#deotrosimple.
      visitDeotrosimple(ctx) {
        return this.visit(ctx.content());
      }

	visitImprime(ctx) {
        let resultado = '';

        if (ctx.textobteiner()) {
            resultado += this.visit(ctx.textobteiner());
        }
    
        if (ctx.expr()) {
            const exprValue = this.visit(ctx.expr());
    
            // Verificar si la expresión es un identificador y si está en la memoria
            if (typeof exprValue === 'string' && this.memoria.has(exprValue)) {
                resultado += this.memoria.get(exprValue);
            } else {
                resultado += exprValue;
            }
        }
        return resultado;
	}

	visitDeclara(ctx) {
        const id = ctx.ID().getText();
        let value = 0;
        if (ctx.EQU()){
            value = this.visit(ctx.expr());
        }
        this.memoria.set(id, value);
	}

	visitAsigna(ctx) {
        const id = ctx.ID().getText();
        if (!this.memoria.has(id)) {
            throw new Error(`La variable '${id}' no ha sido declarada. Línea ${ctx.start.line}.`);
        }
        const value = this.visit(ctx.expr());
        this.memoria.set(id, value);
	}

	visitParens(ctx) {
	    if (ctx.getChildCount() === 4) {
			const left = this.visit(ctx.expr(0));
			const right = this.visit(ctx.expr(1));
			return left * right;
		} else {
			return this.visit(ctx.expr(0));
		}
	}

	visitAddsub(ctx) {
        const left = this.visit(ctx.expr(0));
        const right = this.visit(ctx.expr(1));
        let leftValue;
        let rightValue;

        if (isNaN(left)){
            leftValue = this.memoria.get(left);
        }else{
            leftValue = left;
        }
        if (isNaN(right)){
            rightValue = this.memoria.get(right);
        }else{
            rightValue = right;
        }
        if (ctx.operation.type === DictioParser.SUM){
            const value = leftValue + rightValue;
            return value;
        }else if (ctx.operation.type === DictioParser.RES){
            const value = leftValue - rightValue;
            return value;
        }
	}

	visitMulDiv(ctx) {
        const left = this.visit(ctx.expr(0));
        const right = this.visit(ctx.expr(1));
        let leftValue;
        let rightValue;

        if (isNaN(left)){
            leftValue = this.memoria.get(left);
        }else{
            leftValue = left;
        }
        if (isNaN(right)){
            rightValue = this.memoria.get(right);
        }else{
            rightValue = right;
        }
        if (ctx.operation.type === DictioParser.ASTE){
            const value = leftValue * rightValue;
            return value;
        }else if (ctx.operation.type === DictioParser.DIA){
            const value = leftValue / rightValue;
            return value;
        }
	}

	visitId(ctx) {
	  const id = ctx.getText();
      if (!this.memoria.has(id)){
        throw new Error(`El identificador '${id}' no está definido en línea ${ctx.start.line}`) 
      }
      return this.memoria.get(id);
	}

	visitInt(ctx) {
	  return parseInt(ctx.getText());
	}
    visitTextobteiner(ctx) {
        if (!ctx) {
            throw new Error("El contexto de texto está vacío");
          }
        return ctx.getText().slice(1,-1);
      }

}