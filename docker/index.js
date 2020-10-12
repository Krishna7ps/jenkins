const express = require('express');
const app = express();

app.get('/', (req, res) => { res.send('Hello world!');
});

app.get('/renuka',(req,res)=>{
    res.send("Don't disturb renuka, she is learning GCP")
})


app.listen(8090, '0.0.0.0', () => {
console.log('Hello world app is listening on port 8090.');
});


