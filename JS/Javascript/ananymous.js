
//arrow function -> lambda   ... ES6 version 
var diff = (a,b) => a-b;


let show = function () {
    console.log('Anonymous function');
};
//function without name -> ananymous function , reference to a function 

var sum= function(a,b) {
   return a+b;
}
//named function

function product(a,b ) {
  return a*b;
}
show();
console.log(sum(50,60));//function invocation
console.log(product(8,9));  //function invocation
console.log(diff(50,30));//function invocation