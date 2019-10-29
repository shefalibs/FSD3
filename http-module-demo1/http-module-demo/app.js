const Joi=require('joi');
const morgan=require('morgan');
const express = require('express');
const app = express();
app.use(express.json());
app.use(morgan('tiny'));
const courses=[
{
    id:1,
    name:'Course-1'
},
{

    id:2,
    name:'Course-2'
},
{
    id:3,
    name:'Course-3'
}

];


    app.get("/",(req,res)=>{

        res.send("welcome to my first angular app.!");
    });
    
    app.get("/api/courses",(req,res)=>{
    
    res.status(200).send(courses);
    });
    

app.get("/api/courses/:id",(req,res)=>{

    const course=courses.find(c=>c.id==parseInt(req.params.id))
    if(!course)
    {
        res.send('no course found with the given id.');
        return;
    }
    res.send(course);
});

    
app.post("/api/courses",(req,res)=>{
   
const { error} =validateCourse(req.body);   
if(error)
{
    res.status(400).send(error.details[0].message);
    return;
} 

const course={
    id:courses.length +1,
    name: req.body.name
};
courses.push(course);
res.send(course);

});

app.put("/api/courses/:id",(req,res)=>{
    const course=courses.find(c=>c.id==parseInt(req.params.id));
    
    if(!course)
    {
       res.status(404).send('the course with the given id was not found');
       return;
    }
    const { error} =validateCourse(req.body);   
    if(error)
    {
        res.status(400).send(error.details[0].message);
        return;
    } 
    
    course.name=req.body.name;
    res.send(course);
});

app.delete("/api/courses/:id",(req,res)=>{
    const course=courses.find(c=>c.id==parseInt(req.params.id));
    if(!course)
    {
       res.status(404).send('the course with the given id was not found');
       return;
    }
    let index=courses.indexOf(course);
    courses.splice(index,1);
    res.send(course);


})
{

}



function validateCourse(course)
{
    const schema={
        name: Joi.string().min(3).required()
    };
    return Joi.validate(course,schema);
}


let port=process.env.PORT||3000
app.listen(port,()=>{
    console.log("server started and listining on port",port);
})





















