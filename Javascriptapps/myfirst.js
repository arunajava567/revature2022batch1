var message="Welcome to JS using node";
{
let age=80;
console.log(age);
const pi=3.152;
console.log(pi);
console.log(message);
message="new message";
console.log(message);
age=99;
console.log(age);
//pi=3.254;
console.log(pi);
}
//console.log(age);
//object
//object 

var person = 
{firstName:"John", 
lastName:"Doe", 
age:50, 
eyeColor:"blue",
// ananymous function
fullName : function() {   
    return "Using function "+this.firstName + " " + this.lastName;
  }


};
console.log(person.age+"  "+person.firstName);
console.log(person.fullName());
//console.log(person.fullDetails());

var cars = ["Saab", "Volvo", "BMW"];

var carstring=cars.toString();
if(carstring.length<5)
  console.log("within the range");
  else
  console.log("out of  the range");
console.log(carstring);
for(var i=0;i<cars.length;i++) {
    console.log(cars[i]);
}

function myFunction(p1, p2) {
    return p1 * p2;
  }

  console.log(myFunction(3,4));

  hello = () => {    return "Hello World!";  }

  sum=(a,b) => a+b;   // ->    =>
  console.log(hello());
  console.log(sum(4,5));