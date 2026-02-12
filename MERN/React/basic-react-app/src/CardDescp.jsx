import "./CardDescp.css";
import Price from "./Price";
function CardDescp({title,desc,idx}){
     let oldPrices=["12,495","11,900","1,599","599"];
     let newPrices=["8,999","9,199","899","278"];
        return(
            <div className="CardDescp">
                <h3><b>{title}</b></h3>
                <p>{desc}</p>
                <Price oldPrice={oldPrices[idx]} newPrice={newPrices[idx]}/>
            </div>
        );
}

export default CardDescp;