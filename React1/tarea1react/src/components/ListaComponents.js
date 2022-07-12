import React from "react";

const ListaComponents = ({animal}) => {
    return(<div className = "card">
    <div className = "card-body">
    <h3 className="card-title"> <div><ol><li>{animales.animal}</li></ol></div></h3>
    <hr/>
    <div className="d-flex justify-content-end">
        <button className="btn btn-sm btn-outline-primary me-2">Editar</button>
        <button className="btn btn-sm btn-outline-danger">Eliminar</button>
    </div>
    </div>
    </div>);
}
export default ListaComponents;
