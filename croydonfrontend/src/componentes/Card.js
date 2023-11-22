import React from "react";

function Card (props){
    return(
        <div className="contenedor-imagen-personaje">
            <img
            className="imagen-personaje"
            src={ (props.url) }
            alt={props.alt} />
            <div className='contenedor-nombre-personaje'>
            <p className='nombre-personaje'>
                <strong>{props.nombre}</strong></p>
            </div>
            <div className="contenedor-informacion-personaje">
            <p className='titulo-informacion-personaje'>
                <strong>{props.titulo}</strong></p>
            <p className='informacion-personaje'>"{props.informacion}"</p>
            </div>
            <div className="contenedor-botones">
                <button>Editar</button>
                <button>Eliminar</button>
            </div>
        </div>
    );
}

export default Card;