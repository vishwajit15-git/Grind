import { useState } from "react";

export default function Form() {
    let [formData,setFormData]=useState({
        fullName:"",
        userName:""
    });

    // let handleNameChange = (event) => {
    //     setFullName(event.target.value);
    // };

    // let handleuserNameChange = (event) => {
    //     setUserName(event.target.value);
    // };

    let handleInputChange=(event)=>{
        let fieldName=event.target.name;
        let newVal=event.target.value;

        setFormData((currData)=>{
            currData[fieldName]=newVal;
            return{...currData};
        })
    }

    let handelSubmit=(event)=>{
        event.preventDefault();

        setFormData({
        fullName:"",
        userName:""
        });

    }

    return (
        <form onSubmit={handelSubmit}>
            <label htmlFor="fullName">Full Name</label>
            <input
                placeholder="enter full name"
                type="text"
                value={formData.fullName}
                onChange={handleInputChange}
                id="fullName"
                name="fullName"
            />
            <br></br>
            <label htmlFor="username">User Name</label>
            <input
                placeholder="enter User name"
                type="text"
                value={formData.userName}
                onChange={handleInputChange}
                id="username"
                name="userName"
            />
            <button>Submit</button>
        </form>
    );
}
