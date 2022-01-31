
var data = {"name" : "Matt",
            "age":"20"
            };//JSON

var xmlhttp = new XMLHttpRequest();

xmlhttp.open("POST", "/demo", true);
//Use stringify() method to get string

xmlhttp.send( JSON.stringify( data ) );




xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        //Use parse() method to convert JSON string to JSON object
        var responseJsonObj = JSON.parse(this.responseText);

        console.log( responseJsonObj.name );
        console.log( responseJsonObj.age );
    }
};

xmlhttp.open("GET", "/demo", true);

xmlhttp.send();