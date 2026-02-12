import Product from "./Product";
import "./ProductTab.css";
function ProductTab(){
    return(
    <div className="ProductTab">
        <Product title="Phone" description="HandHeld Device" price={20000}/>
        <Product title="Laptop" description="Desk Device" price={50000}/>
        <Product title="SuperComputer" price={60000}/>
    </div>
    )
}

export default ProductTab;