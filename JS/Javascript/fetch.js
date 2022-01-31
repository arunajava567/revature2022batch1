const fetch = require('node-fetch');


fetch('h'ttps://api.github.com/orgs/nodejs)
.then(response => response.json())
.then(data => {
  console.log(data) // Prints result from `response.json()` in getRequest
})
.catch(error => console.error(error))