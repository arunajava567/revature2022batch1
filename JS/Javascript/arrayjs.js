const person = { name: "Johnson" , age: "23", gender: "male"};

// change a property
person.age = "21";

console.log(person); // prints " {name: "Johnson", age: "21", gender: "male"} " in the console.

//reassigning const object
//person = { name: "Mercy" , age: "23", gender: "female"}; //error

const x=20;
//x=40
console.log(x);

function sayHello(){
    return "Hello World!!!"
}
var x1 = 10;  
var y1 = 20;  
console.log(`${sayHello()}, The product of the variables ${x1} and ${y1} are
 ${x1*y1}`);  