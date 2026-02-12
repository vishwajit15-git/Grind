import Product from "./Product";
import "./ProductTab.css";
function ProductTab(){
    let options=["hi-tech","durble","fast"];
    return(
    <div className="ProductTab">
        <Product title="Phone" description="HandHeld Device" features={options}/>
        {/* <Product title="Laptop" description="Desk Device"/>
        <Product title="SuperComputer"/> */}
    </div>
    )
}

export default ProductTab;