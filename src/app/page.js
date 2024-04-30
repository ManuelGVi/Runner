'use client';
import React, { useState } from "react";
import { analizar } from './module/generator.js';
import { translateC } from './module/cgenerator.js'; // Importa la función translateC desde el módulo translator.js
import "./RunnerCompilator.css"; // Asegúrate de que este archivo exista y tenga los estilos correctos.

const RunnerCompilator = () => {
  const [input1, setInput1] = useState("");
  const [input2, setInput2] = useState("");
  const [output, setOutput] = useState("");
  const [errors, setErrors] = useState([]); // Ahora, 'errors' almacena un arreglo de mensajes de error.

  const handleCompile = () => {
    try {
      const { result, errors: compilationErrors } = analizar(input1);
      if (result !== undefined) {
        setOutput(result);
      }
      
      // Aquí asumimos que `compilationErrors` ya incluye ambos tipos de errores
      // Asegúrate de que el formato de los errores sea consistente antes de actualizar el estado
      const formattedErrors = compilationErrors.map(error => {
        // Asumiendo que todos los errores tienen un formato consistente
        return `Error en línea ${error.line}, columna ${error.column}: ${error.msg}`;
      });
  
      setErrors(formattedErrors);
    } catch (error) {
      // Este bloque catch capturará errores no previstos
      setErrors([error.message]);
    }
  };

  const handleTranslate = () => {
    // Verifica si el segundo textarea tiene texto
    if (input2.trim() !== "") {
      // Llama a la función translateC con el texto del segundo textarea y establece el resultado en el primer textarea
      setInput1(translateC(input2));
    }
  };

  const handleInputChange1 = (e) => {
    setInput1(e.target.value);
    // Actualizar el número de líneas de error cuando se cambie el código
    setErrors([]);
  };

  const handleInputChange2 = (e) => {
    setInput2(e.target.value);
    // Actualizar el número de líneas de error cuando se cambie el código
    setErrors([]);
  };
  const handleLoadRunnerFile = (event) => {
    const file = event.target.files[0];
    const reader = new FileReader();

    reader.onload = (event) => {
      setInput1(event.target.result);
    };

    reader.readAsText(file);
  };

  const handleLoadCFile = (event) => {
    const file = event.target.files[0];
    const reader = new FileReader();

    reader.onload = (event) => {
      setInput2(event.target.result);
    };

    reader.readAsText(file);
  };
  

  // Función para generar números de línea
  const generateLineNumbers = (input) => {
    return input.split('\n').map((line, index) => (
      <div key={index} className="line-number">{index + 1}</div>
    ));
  };

  return (
    <div className="runner-container">
      <div className="input-container">
        <div className="code-input">
          <div className="line-numbers">
            {generateLineNumbers(input1)}
          </div>
          <textarea
            value={input1}
            onChange={handleInputChange1}
            placeholder="Escribe tu código aquí..."
          />
        </div>
        <div className="code-input">
          <div className="line-numbers">
            {generateLineNumbers(input2)}
          </div>
          <textarea
            value={input2}
            onChange={handleInputChange2}
            placeholder="Segundo textarea..."
          />
        </div>
      </div>
      <div className="output-container">
        <div className="button-container">
          <button className="compile-button" onClick={handleCompile}>Compile</button>
          <button className="translate-button" onClick={handleTranslate}>Traducir</button>
          <input type="file" accept=".txt" onChange={handleLoadRunnerFile} />
          <input type="file" accept=".txt" onChange={handleLoadCFile} />
        </div>
        <div className="output-area">{errors.length > 0 ? "Consola" : "Output"}: {errors.length > 0 ? errors.map((error, index) => (
          <div key={index}>{error}</div>
        )) : output}</div>
      </div>
    </div>
  );
};

export default RunnerCompilator;
