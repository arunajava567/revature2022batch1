
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

class AbstractDemo
{
	public static void main(String[] args)
	{
		Car c = new Car();
		
		c.drive();		// Calls drive() of Car

		Bus b = new Bus();
		
		b.drive();		//Calls drive() of Bus
	}
}