import React from "react";
import { Link } from "react-router-dom";
import '../estilos/Menu.css';

function Menu(){
    return(
        <div className="contenedor-menu">
            <div className="rectangulo">
            <Link   to={'/'} >Inicio</Link>
            <Link to={'/modulos'} >Módulos</Link>
            </div>
        </div>
    );
}

export default Menu;