
//Interface Demo
interface Drivable
{
  void accelerate();
  void decelerate();
  void steer();
}

class Boat implements Drivable
{
  public void accelerate()
  {
    System.out.println("Boat Accelerate");
  }
  public void decelerate()
  {
    System.out.println("Boat Decelerate");
  }
  public void steer()
  {
    System.out.println("Boat Steer");
  }
}
class Car implements Drivable
{
  public void accelerate()
  {
    System.out.println("Car Accelerate");
  }
  public void decelerate()
  {
    System.out.println("Car Decelerate");
  }
  public void steer()
  {
    System.out.println("Car Steer");
  }
}

public class InterfaceDemo
{
  public static void main(String[] args)
  {
    Boat b = new Boat();
    b.accelerate();
    b.decelerate();
    b.steer();
    Car c = new Car();
    c.accelerate();
    c.decelerate();
    c.steer();
  }
}