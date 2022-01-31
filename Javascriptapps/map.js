var map = new Map();  
    map.set('John', 'author');  
    map.set('arry', 'publisher');  
    map.set('Mary', 'subscriber');  
    map.set('James', 'Distributor');  
    
console.log(map.size);  

//can have delete(), set() and has() methods

let wp = new WeakMap();   
let obj = {};   
console.log(wp.set(obj,"Welcome to javaTpoint"));    
console.log(wp.has(obj));  


var colors = new Map([   
    ['1', 'Red'],   
    ['2', 'Green'],   
    ['3', 'Yellow'],  
    ['4', 'Violet']   
 ]);  
   
 for (let col of colors.values()) {  
     console.log(col);  
 }  
   
 console.log(" ")  
   
 for(let col of colors.entries())   
 console.log(`${col[0]}: ${col[1]}`);  


 var colors = new Map([   
    ['1', 'Red'],   
    ['2', 'Green'],   
    ['3', 'Yellow'],  
    ['4', 'Violet']   
 ]);  
   
 var itr = colors.values();  
 console.log(itr.next());  
 console.log(itr.next());  
 console.log(itr.next());  