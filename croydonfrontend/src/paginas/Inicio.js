import React from "react";
import Card from "../componentes/Card";
import Menu from "../componentes/Menu";

function Inicio(){
    return(
        <div>
            <Menu />
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
    );
}

export default Inicio;