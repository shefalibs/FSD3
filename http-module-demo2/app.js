const courses=require('./routes/courses');
const genres=require('./routes/genres');
const Joi=require('joi');
const morgan=require('morgan');
const express = require('express');
const app = express();
app.use(express.json()); //middleware
app.use('/api/courses',courses); //middleware
app.use('/api/genres',genres);
app.use(morgan('tiny'));

//set the port dynamically
let port=process.env.PORT||3000
app.listen(port,()=>{
    console.log("server started and listining on port",port);
})