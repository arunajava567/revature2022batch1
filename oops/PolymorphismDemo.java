
//Polymorphism Demo
abstract class Vehicle
{
  abstract void drive();
}

class Car extends Vehicle
{
  void drive()
  {
    System.out.println("Driving a Car");
  }
}

class Bus extends Vehicle
{
  void drive()
  {
    System.out.println("Driving a Bus");
  }
}

class PolymorphismDemo
{
  public static void main(String[] args)
  {
    Vehicle v1 = new Car();
    v1.drive();// Polymorphic call - Calls drive() of Car
  //  Vehicle v2  = new Bus();
    v1= new Bus();
    v1.drive();//Polymorphic call - Calls drive() of Bus
  }
}