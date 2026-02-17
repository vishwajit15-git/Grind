import { useState ,useEffect} from "react";
export default function Counter(){
    let [count,setCount]=useState(0);

    let incCount=()=>{
        // setCount(count+1);
        // setCount(count+1);  // this will not do +2 as we have ran two updaters 

        setCount((currCount) => currCount + 1);

        //  setCount((currCount)=>{
        //     currCount+1;
        // });                         //now this will uodate count by +2 as we have use calllback in updater fxn
    }

    useEffect(function printsomething(){
        console.log("this is useEffect");
    })

    return(
        <div>
            <h3>Count = {count}</h3>
            <button onClick={incCount}>Click </button>
        </div>
    );
}