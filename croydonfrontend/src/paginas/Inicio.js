import React from "react";
import Card from "../componentes/Card";
import Menu from "../componentes/Menu";
import '../estilos/Inicio.css';

function Inicio(){
    return(
        <div className="contenedor">
            <Menu />
            <div className="contenedor-cards">
            <div>
                <Card
                url="Arianna"
                alt="foto"
                nombre="Queen Arianna"
                titulo="Background information"
                informacion="Princesa" />
            </div>
            <div>
                <Card
                url="Arianna"
                alt="foto"
                nombre="Queen Arianna"
                titulo="Background information"
                informacion="Princesa" />
            </div>
            <div>
                <Card
                url="Arianna"
                alt="foto"
                nombre="Queen Arianna"
                titulo="Background information"
                informacion="Princesa" />
            </div>
            <div>
                <Card
                url="Arianna"
                alt="foto"
                nombre="Queen Arianna"
                titulo="Background information"
                informacion="Princesa" />
            </div>
            </div>
        </div>
    );
}

export default Inicio;