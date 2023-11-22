import React from "react";
import Boton from "../componentes/Boton";
import Card from "../componentes/Card";

function Inicio(){
    return(
        <div>
            <div className="menu-navegacion">
                <Boton
                link={"/"}
                texto="Inicio" />
                <Boton
                link={"/modulos"}
                texto="Modulos" />
            </div>
            <div>
                <Card
                url="https://static.wikia.nocookie.net/disney/images/1/15/Arianna_Tangled.jpg/revision/latest?cb=20160715191802"
                alt="foto"
                nombre="Queen Arianna"
                titulo="Background information"
                informacion="...." />
            </div>
        </div>
    );
}

export default Inicio;