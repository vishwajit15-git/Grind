import { useState } from "react"
export default function LudoBoard(){
    let [moves,setmoves]=useState({blue:0,yellow:0,green:0,red:0});

    let updateBlue=()=>{
        setmoves((prevmoves)=>{
            return {...prevmoves, blue : prevmoves.blue+1 }
        });//we spread the object because we we simply pass setmoves(moves) there is no change detected in ui because we are only changing value of key not whole object/array ,to change whole we have to spread it ...
    }

     let updateYellow=()=>{
        setmoves((prevmoves)=>{
            return {...prevmoves, yellow : prevmoves.yellow+1 }
        });//we spread the object because we we simply pass setmoves(moves) there is no change detected in ui because we are only changing value of key not whole object/array ,to change whole we have to spread it ...
    }

     let updateGreen=()=>{
        setmoves((prevmoves)=>{
            return {...prevmoves, green : prevmoves.green+1 }
        });//we spread the object because we we simply pass setmoves(moves) there is no change detected in ui because we are only changing value of key not whole object/array ,to change whole we have to spread it ...
    }

     let updateRed=()=>{
        setmoves((prevmoves)=>{
            return {...prevmoves, red : prevmoves.red+1 }
        });//we spread the object because we we simply pass setmoves(moves) there is no change detected in ui because we are only changing value of key not whole object/array ,to change whole we have to spread it ...
    }
    return(
        <>
            <div>
                <p>Game Begins</p>
                <div>
                    <p>Blue Moves={moves.blue}</p>
                    <button onClick={updateBlue} style={{backgroundColor:"blue",color:"black"}}>+1</button>


                    <p>Yellow Moves={moves.yellow}</p>
                    <button onClick={updateYellow} style={{backgroundColor:"yellow",color:"black"}}>+1</button>


                    <p>Green Moves={moves.green}</p>
                    <button onClick={updateGreen} style={{backgroundColor:"green",color:"black"}}>+1</button>


                    <p>Red Moves={moves.red}</p>
                    <button onClick={updateRed} style={{backgroundColor:"red",color:"black"}}>+1</button>


                </div>
            </div>
        </>
    )
}