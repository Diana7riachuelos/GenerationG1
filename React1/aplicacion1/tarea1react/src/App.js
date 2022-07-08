import React from 'react';

const App = () =>{
    return(
        <div className="container mt-4">
            <div className='row'>
                <div className='col-8'>
                    <h1>Lista de Animales</h1>
                    <div>
                    <ol>
        <li>Perro</li>
        <li>Gato</li>
        <li>Gorrión</li>
        <li>Elefante</li>
        <li>León</li>
        <li>Ballena</li>
        <li>Tortuga</li>
            </ol>
            </div>
                </div>
                <div className='col-4'>
                    <h1>Formulario</h1>
                </div>
            </div>
        </div>

    );
};

export default App;