const fetch = require('node-fetch');
async function fetchText() {
    let response = await fetch('https://api.github.com/orgs/nodejs');

    console.log(response.status); // 200
    console.log(response.statusText); // OK

    if (response.status === 200) {
        let data = await response.text();
        // handle data
    }
}

fetchText();