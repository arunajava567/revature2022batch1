//var message = "Hello World" 
//console.log(message)
//node app1.js

var name = "Tom" 
console.log("The value in the variable is: "+name)

/*
var num = 10 
function test() { 
   var num = 100 
   console.log("value of num in test() "+num) 
} 
console.log("value of num outside test() "+num) 
test()

*/

/*
"use strict"

function test() { 
   var num = 100 
   console.log("value of num in test() "+num) 
     { 
      console.log("Inner Block begins") 
      let num = 200 
      console.log("value of num : "+num)  
   } 
} 
test()

===============

var num = 12;
if (num % 2 == 0) {
   console.log("Even");
} else {
   console.log("Odd");
}

outerloop: // This is the label name
for (var i = 0; i < 5; i++) {
   console.log("Outerloop: " + i);
   innerloop:
   for (var j = 0; j < 5; j++){
      if (j > 3 ) break ; // Quit the innermost loop
      if (i == 2) break innerloop; // Do the same thing
      if (i == 4) break outerloop; // Quit the outer loop
      console.log("Innerloop: " + j);
   }
}

*/