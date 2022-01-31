(function(){ console.log("Look at me, I'm running");
}
)

();

function funcTwo(y, callback) {
    callback(y);	
  //  callback(y);	
}

funcTwo(10, function(x) 
            { console.log("x = " + x); 
            }

)
//closure
// names function, annaymous function ,callback, closure, arrow, promises
function greeting() {
    var message = 'Hi';

    function sayHi() {   //closure function is fuction which is embedded in other outre funciton
        console.log(message);  // closue can access members of outer funciton
    }

    sayHi();

}
 greeting();
