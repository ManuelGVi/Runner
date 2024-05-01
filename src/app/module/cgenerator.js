import antlr4 from "antlr4";
import CDictioLexer from "../../graccar/CDictioLexer.js";
import CDictioParser from "../../graccar/CDictioParser.js";
import CVisitor from "../helper/CVisitor.js";
import {output} from "../helper/CVisitor.js";

export const translateC = (input) => {
    console.log("Entrada:", input);
    const chars = new antlr4.InputStream(input);
    const lexer = new CDictioLexer(chars);
    const tokens = new antlr4.CommonTokenStream(lexer);
    const parser = new CDictioParser(tokens);
    parser.buildParseTrees = true;
    const tree = parser.main(); 
    const cVisitor = new CVisitor();
    cVisitor.visit(tree); 
    let runnerCode = output;
    console.log("output:",output);
    const runner2 =runnerCode;
    runnerCode='';
    return runner2;

};

