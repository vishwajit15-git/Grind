import "./Product.css";

function Product({title,description="your description",features}) {
    const list=features.map((feature)=><li>{feature}</li>); 
    return (
        <div className="Product">
            <h3>{title}</h3>
            <h5>{description}</h5>
            <p>{list}</p>
        </div> 
    )
}

export default Product;