var a=10;
console.log("welcome to Serverside js");
console.log(a);
var x=1;
while(x<=a)
{ console.log(x);
  x++;
}
{let y=20; //block level
    console.log(y);
}
const pi=3.142;
console.log(pi);
//pi+=10;
//console.log(y);
//y=30;
//console.log(y);
let person =[ {
    name: 'Bob1',
    age: 25,
    marks:50
  },
  {
    name: 'Bob2',
    age: 25,
    marks:50
  },
  {
    name: 'Bob3',
    age: 25,
    marks:50
  }
]
  console.log(person.age+"  "+person.name+"  "+person.marks);
  for (let prop in person) {
    console.log(person[prop]); // prints 'Bob' and then 25
  }
var city="Hyderabad";
console.log(city.toUpperCase());
var p=null;
console.log(p);
let course={
    id: "101",
    name:"Javafsd"
}

console.log(course.id+"  "+course.name);
console.log(course["id"]+"  "+course["name"]);

var today=new Date();
console.log(today);
console.log(typeof "city")


function hello() {
    console.log("Hello");
}
function sum(a,b)
{
    return a+b;
}
hello();
var x=sum(6,7);
console.log(x);


function func1(){
    var animal1 = "Lion";   //exist in Lexical scope

    function func2(){    //Inner Function

        var animal2 = "Tiger"; //exist in function scope
        console.log(animal1);
        console.log(animal2);

    }
    func2();
   // console.log(animal2); // results error - due to it exist in function scope
}

func1();

function example() {
    // var a declaration hoisted here
    a = 4;
    var a;
    a++;
    console.log(a); // prints 5
  }
  // anotherExample declaration hoisted to here
  anotherExample(); // no error thrown!
  
  function anotherExample() {
    console.log('it works!');
  }


  var person1 = {
    fullName: function() {
      return this.firstName + " " + this.lastName;
    }
  }
  var person2 = {
    firstName:"John",
    lastName: "Wilson",
  }
  console.log("Hello, "+ person1.fullName.call(person2));


const person12 = {
    firstName: 'John',
    lastName: 'Doe'
}
function greet() {
    return "welcome "+"  "+this.firstName+ this.lastName;
}
let result = greet.apply(person12);

console.log(result);
console.log(5=='5')  //value
console.log(5==='5') //value n type 
console.log('5'+6);
console.log(false)
console.log(false.toString()+" message")


function msg() {
    console.log("Welcome");
}

function msg1() {
    return "Welcome";
}
function msg(a,b) {
   return a*a+b*b;
}
msg();
console.log(msg1());
console.log(msg(5,6));

//funciton ref
let sum23=function(a,b) {
    return a+b;

}
console.log(sum23(6,7));