import React from "react";
import FormularioComponent from "./FormularioComponents";
import ListaComponents from "./ListaComponents";

const animales = [
    {
        key: 0,
        animal: 'Perro',
    },
    {
        key: 1,
        Gato
    },
    {
        key: 2,
        Gorrión
    },
    {
        key: 3,
        Elefante
    },
    {
        key: 4,
        León
    },
    {
        key: 5,
        Ballena,
    },
    {
        key: 6,
        Tortuga
    }
] 
const RecopilacionComponent = () => {
    return( <div className="container mt-4">
    <div className='row'>
        <div className='col-8'>
            <h1>Lista Animales</h1>
            {animales.map(a => <ListaComponents key={a.key} animales={a}/>)}
        
            {/*comentario*/}
        </div>
        <div className='col-4'>
            <h1>Formulario</h1>
            <FormularioComponent/>
        </div>
    </div>
</div>);
}

export default RecopilacionComponent;
