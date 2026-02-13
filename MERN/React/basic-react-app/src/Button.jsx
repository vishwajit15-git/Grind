function handleClick(event){
    console.log("Click fxn triggered");
    console.log(event);
}

function handleMouseOver(){
    console.log("Mouse over fxn triggered")
}

export default function Button(){
    return(
        <div>
            <button onClick={handleClick}>Click me!</button>
            <p onMouseOver={handleMouseOver}>Hover over me</p>
        </div>
    );
};