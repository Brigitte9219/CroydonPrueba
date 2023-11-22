import React from "react";
import { Link } from "react-router-dom";

function Boton(props){
    return(
        <div className="">
            <Link to={props.link} className="" >{ props.texto }</Link>
        </div>
    );
}

export default Boton;
