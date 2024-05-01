import CDictioVisitor from '../../graccar/CDictioVisitor.js';
import CDictioLexer from '../../graccar/CDictioLexer.js';
import CDictioParser from '../../graccar/CDictioParser.js';
import antlr4 from 'antlr4';
export let output = '';

export default class CVisitor extends CDictioVisitor {
    // Visit the 'main' method of the parse tree
    visitMain(ctx) {
        output += 'lets run {\n';
        if (ctx.contenido()) {
            this.visitContenido(ctx.contenido());
        }
        output += '}\n';
    }

    // Visit 'contenido' node
    visitContenido(ctx) {
        return this.visitChildren(ctx);
    }

// Visit 'conditionalif' node
visitConditionalif(ctx) {
    output += 'si (';
    this.visit(ctx.condition());
    output += ') {\n';
    if (ctx.contenido()) {
        this.visit(ctx.contenido());
    }
    output += '}\n';
    if (ctx.elseif()) {
        this.visit(ctx.elseif());
    }
    if(ctx.elsesimple()){
        this.visit(ctx.elsesimple());
    }
}
    visitCiclowhile(ctx){
        output += 'mientras ( ';
        this.visit(ctx.condition());
        output += ' ) { \n';
        this.visit(ctx.contenido());
        if (ctx.change()) {
            this.visit(ctx.change());
        }
        output += ' } \n'
    }

// Visit 'else' node for elseif
visitElseif(ctx) {
    output += 'sino si (';
    this.visit(ctx.condition());
    output += ') {\n';
    if (ctx.contenido()) {
        this.visit(ctx.contenido());
    }
    output += '}\n';
    if (ctx.elseif()) {
        this.visit(ctx.elseif());
    }
    if(ctx.elsesimple()){
        this.visit(ctx.elsesimple());
    }
}

// Visit 'else' node for simple else
visitElsesimple(ctx) {
    output += 'sino {\n';
    if (ctx.contenido()) {
        this.visit(ctx.contenido());
    }
    output += '}\n';
}


    // Visit 'condition' node
    visitCondition(ctx) {
        return this.visitChildren(ctx);
    }

    // Visit 'truefalse' node
    visitTruefalse(ctx) {
        output += ctx.TRUE() ? 'true' : 'false';
    }

    // Visit conditions with parentheses
    visitConditionparens(ctx) {
        output += '(';
        this.visit(ctx.condition());
        output += ')';
    }

    // Visit logical operations ('yo' node)
    visitYo(ctx) {
        //let expr1;
        //let expr2;
        this.visit(ctx.condition(0));
        output += ' '+ctx.op.text+' ';
        this.visit(ctx.condition(1));
    }

    // Visit 'comparisson' node
    visitComparisson(ctx) {
        let expr1;
        let expr2;
        expr1=this.visit(ctx.expr(0));
        output += expr1;
        output += ctx.op.text;
        expr2 =this.visit(ctx.expr(1));
        output += expr2
    }

    visitPrint(ctx) {
        output += 'imp ( ';
        if (ctx.expr()) {
            const exprValue = this.visit(ctx.expr());
                output += exprValue;
        }
        if (ctx.textobteiner()) {
            output += '"';
            output+= this.visit(ctx.textobteiner());
            output += '"';
        }// Obtener el texto sin las comillas
        output += ' );\n';
    }

    // Visit 'declaration' node
    visitDeclaration(ctx) {
        output += `comp ${ctx.IDS().getText()}` + (ctx.expr() ? ` = ${this.visit(ctx.expr())}` : '') + ';\n';
    }

    // Visit 'asignation' node
    visitAsignation(ctx) {
        output += `${ctx.IDS().getText()} = ${this.visit(ctx.expr())};\n`;
    }
    visitChange(ctx) {
        const id = ctx.IDS().getText(); // Obtener el identificador de la variable
    
        // Verificar si la operación es de incremento (++), decremento (--), o ninguna de las anteriores
        if (ctx.INCREMENT()) {
            output += `${id}++;`;
        } else if (ctx.DECREMENT()) {
            output += `${id}--;`;
        } else {
            throw new Error(`Operación de cambio desconocida en línea ${ctx.start.line}`);
        }
    }

    // Visit 'expr' nodes for operations
    visitTimesdiv(ctx) {
        const result = `${this.visit(ctx.expr(0))} ${ctx.operation.text} ${this.visit(ctx.expr(1))}`;
        output += result + '\n';
        return result;
    }

    visitSumaresta(ctx) {
        const result = `${this.visit(ctx.expr(0))} ${ctx.operation.text} ${this.visit(ctx.expr(1))}`;
        output += result + '\n';
        return result;
    }

    visitExprparens(ctx) {
        const result = ` (${this.visit(ctx.expr())}) `;
        output += result + '\n';
        return result;
    }

    // Visit numerical and identifier expressions
    visitInt(ctx) {
        if(ctx.SUB()){
            output += " - ";
        }
        return ctx.NUM().getText();
    }
    visitResidual(ctx){
        output += this.visit(ctx.expr(0));
        output += ' % ';
        output += this.visit(ctx.expr(1));
    }

    visitIds(ctx) {
        return ctx.IDS().getText();
    }
    visitTextobteiner(ctx) {
        if (!ctx) {
            throw new Error("El contexto de texto está vacío");
          }
        return ctx.getText().slice(1,-1);
      }
}