import { useState } from "react";
export default function ToDoList(){
    let [todos,setTodos]=useState(["Sample Task"]);
    let [newtodo,setNewtodo]=useState("");

    let addnewTask=()=>{
        setTodos([...todos,newtodo]);
        setNewtodo("");
    };

    let updateTodoValue=(event)=>{
        setNewtodo(event.target.value);
    };

    return(
        <>
            <div>
                <input placeholder="task todo" value={newtodo} onChange={updateTodoValue}></input>
                <br></br>
                <br></br>
                <button onClick={addnewTask}>Add Task</button>
                <br></br>
                <br></br>
                <br></br>
                <hr></hr>
                <h4>To Do List</h4>
                <ul>
                    {
                        todos.map((todo)=>(
                            <li>{todo}</li>
                        ))
                    }
                </ul>
            </div>
        </>
    );
};