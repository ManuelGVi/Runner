import antlr4 from "antlr4";
import DictioLexer from "../../grammar/DictioLexer.js";
import DictioParser from "../../grammar/DictioParser.js";
import CustomVisitor from "../helper/CustomVisitor.js";

export const analizar = (input) => {
  console.log("intrada:", input);
  const chars = new antlr4.InputStream(input);
  const lexer = new DictioLexer(chars);
  const tokens = new antlr4.CommonTokenStream(lexer);
  const parser = new DictioParser(tokens);
  
  const errorListener = {
    syntaxErrors:[],
    syntaxError(recognizer, offendingSymbol, line, column, msg, e){
      const error_msg =  `Error de sintaxis en línea ${line}, columna ${column}: ${msg}`;
      this.syntaxErrors.push({ line, column, msg });
    },
  };
  lexer.removeErrorListeners();
  lexer.addErrorListener(errorListener);
  parser.removeErrorListeners();
  parser.addErrorListener(errorListener);
  
  parser.buildParseTrees = true;
  const tree = parser.main();
  const customVisitor = new CustomVisitor();
  let result = customVisitor.visitMain(tree);
  console.log("Resultado del análisis:", result);
  return {result, errors: errorListener.syntaxErrors};
};
