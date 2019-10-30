const mongoose = require('mongoose');
const express = require('express');
const genres = require('./router/genres');
const customers = require('./router/customers');
const app = express();

mongoose.connect('mongodb://localhost/vidly',{useUnifiedTopology: true,useNewUrlParser: true })
  .then(() => console.log('Connected to MongoDB...'))
  .catch(err => console.error('Could not connect to MongoDB...'));

app.use(express.json());
app.use('/api/genres', genres);
app.use('/api/customers', customers);

const port = process.env.PORT || 3000;
app.listen(port, () => console.log(`Listening on port ${port}...`));