const express = require('express')
require('./db/mongoose')
const User=require('./routes/user');
const Task=require('./routes/task');
const morgan=require('morgan');
const app = express()
const port = process.env.PORT || 3000

app.use(express.json())
app.use('/users',User); //middleware
app.use('/tasks',Task);
app.use(morgan('tiny'));
app.listen(port, () => {
    console.log('Server is up on port ' + port)
})