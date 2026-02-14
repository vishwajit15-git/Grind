import { useState } from "react";
import { v4 as uuidv4 } from 'uuid';
export default function ToDoList(){
    let [todos,setTodos]=useState([{task:"sample task",id:uuidv4(), done:false}]);
    let [newtodo,setNewtodo]=useState("");

    let addnewTask=()=>{
        setTodos((prevTodos)=>{
            return [...prevTodos,{task:newtodo,id:uuidv4(), done:false}]
        });
        setNewtodo("");
    };

    let updateTodoValue=(event)=>{
        setNewtodo(event.target.value);
    };

    let deleteTodoValue=(id)=>{
         setTodos((prevTodos)=>prevTodos.filter((todo)=>todo.id !== id));
    }

    let upperCaseAll=()=>{
        setTodos((prevTodos)=>(
            prevTodos.map((todo)=>{
                return {
                    ...todo,
                    task: todo.task.toUpperCase()
                };
            })
         ) );
    };

    let upperCaseOne=(id)=>{
        setTodos((prevTodos)=>(
            prevTodos.map((todo)=>{
                if(todo.id == id){
                    return {
                    ...todo,
                    task: todo.task.toUpperCase()
                }
                }else{
                    return todo;
                }
            })
         ) );
    }

    let markAsDoneAll=()=>{
         setTodos((prevTodos)=>(
            prevTodos.map((todo)=>({
                ...todo,
                done: true
            }))
         ) );
    }

    let markAsDoneOne=(id)=>{
        setTodos((prevTodos)=>(
            prevTodos.map((todo)=>{
                if(todo.id === id){
                    return {...todo, done: !todo.done};
                }
                return todo;
            })
        ));
    }


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
                            <li key={todo.id}>
                                <span style={{textDecoration: todo.done ? 'line-through' : 'none'}}>
                                    {todo.task}
                                </span>
                                <button onClick={()=>deleteTodoValue(todo.id)}>Delete</button>
                                <button onClick={()=>upperCaseOne(todo.id)}>UpperCase</button>
                                <button onClick={()=>markAsDoneOne(todo.id)}>{todo.done ? 'Undo' : 'Mark as Done'}</button>
                            </li>
                        )) 
                    }
                </ul>
                <button onClick={upperCaseAll}>UpperCase All</button>
                <button onClick={markAsDoneAll}>Mark as Done All</button>
            </div>
        </>
    );
};