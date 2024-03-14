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
  
  
      // Visit a parse tree produced by DictioParser#siono.
      visitSiono(ctx) {
         // Evaluar las dos expresiones.
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
        default:
            throw new Error("Operador desconocido: " + operator);
    }
      }
  
  
      // Visit a parse tree produced by DictioParser#deotro.
      visitDeotro(ctx) {
        return this.visit(ctx.content());
      }

	visitImprime(ctx) {
        const texto = this.visit(ctx.textobteiner());
        const containsSemicolon = ctx.SC() !== null;

    if (!containsSemicolon) {
        throw new Error("Falta el punto y coma al final de la instrucción de impresión");
    }
        let resultado = texto;
        if (ctx.expr()) {
            const id = this.visit(ctx.expr()).getText;
                resultado += this.visit(ctx.expr());
            } else {
                // Manejar el caso en que el identificador no está definido
                throw new Error(`La variable ${id} no está definida`);
            }
        
       /* if (ctx.ID()) {
            const id = ctx.ID().getText();
            if (this.memoria.has(id)) {
                resultado += this.memoria.get(id);
            } else {
                // Manejar el caso en que el identificador no está definido
                throw new Error(`La variable ${id} no está definida`);
            }
        }*/
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
