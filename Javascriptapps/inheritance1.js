class Foo{
    constructor(){
        console.log('Constructing Foo');
    }
    getRandomNumber(){
        return Math.random();
    }
}
class Baz extends Foo{
    constructor(){
        super(); // Mandatory since constructor defined
        console.log('Constructing Baz');
    }
    getRandomNumber(){
        //Access parent class members
        return "Generated Random Number : "+ super.getRandomNumber();
    }
}
let baz = new Baz();
console.log(baz.getRandomNumber());