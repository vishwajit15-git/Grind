import CardDescp from "./CardDescp";
import "./AmazonCard.css";

function AmazonCard(){
    return(
        <div className="AmazonCard">
            <CardDescp title="Logitec MX Master" desc="5 programmable buttons" idx={0}/>
            <CardDescp title="Apple Pencil (2nd Gen)" desc="Designed for iPad pro+" idx={1}/>
            <CardDescp title="Zebronics" desc="touch intuitive" idx={2}/>
            <CardDescp title="Petronics Toad" desc="Optical Orientation" idx={3}/>
        </div>
    );
};

export default AmazonCard;