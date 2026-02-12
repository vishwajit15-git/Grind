import "./Product.css";

function Product({title,description="your description",features,price}) {
    let styles={backgroundColor:price>30000?"blue": null} ;
    return (
        <div className="Product" style={styles}>
            <h3>{title}</h3>
            <h5>{description}</h5>
            <h5>Price:{price}</h5>
            {price>30000?<p>Discount of 5%</p>:null}
        </div> 
    )
}

export default Product;