'use client';
import React, { useState } from "react";
import { analizar } from './module/generator.js';
import "./RunnerCompilator.css"; // Asegúrate de que este archivo exista y tenga los estilos correctos.

const RunnerCompilator = () => {
  const [input, setInput] = useState("");
  const [output, setOutput] = useState("");
  const [errors, setErrors] = useState([]); // Ahora, 'errors' almacena un arreglo de mensajes de error.

  const handleCompile = () => {
    try {
      const { result, errors: compilationErrors } = analizar(input);
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

  const handleInputChange = (e) => {
    setInput(e.target.value);
    // Actualizar el número de líneas de error cuando se cambie el código
    setErrors([]);
  };

  // Función para generar números de línea
  const generateLineNumbers = () => {
    return input.split('\n').map((line, index) => (
      <div key={index} className="line-number">{index + 1}</div>
    ));
  };

  return (
    <div className="runner-container">
      <div className="input-container">
        <div className="code-input">
          <div className="line-numbers">
            {generateLineNumbers()}
          </div>
          <textarea
            value={input}
            onChange={handleInputChange}
            placeholder="Escribe tu código aquí..."
          />
        </div>
      </div>
      <div className="output-container">
        <button className="compile-button" onClick={handleCompile}>Compile</button>
        <div className="output-area">{errors.length > 0 ? "Consola" : "Output"}: {errors.length > 0 ? errors.map((error, index) => (
          <div key={index}>{error}</div>
        )) : output}</div>
      </div>
    </div>
  );
};

export default RunnerCompilator;
