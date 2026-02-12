import "./Price.css";
function Price({oldPrice,newPrice}){
        return(
            <div className="Price">
                <span id="oldPrice">{oldPrice}</span>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <span id="newPrice">{newPrice}</span>
            </div>
        );
};

export default Price;