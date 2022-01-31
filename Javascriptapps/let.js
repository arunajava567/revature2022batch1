var cname="capgemini";

cname="Cg Technologies";
console.log(cname);
let demoVariable = 5;
var x=10;
const y=99;
			{
				let demoVariable = 10; //accessible only inside this block 
				//let demoVariable = 9; // throws error
                console.log(demoVariable);
                var x=20;
				x=23;
				
                console.log(x);
                console.log(y);
			}
x=30
//y=100;
console.log(x);
			console.log(demoVariable);