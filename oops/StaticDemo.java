
//static keyword demo
class StaticDemo
{
  int instance_variable;
  static int static_variable;
  
  void instanceMethod()
  {
    instance_variable = 10;
    static_variable = 20;
  }
 static void staticMethod()
  {
    static_variable = 30;
  }
  void display()
  {
    System.out.println("instance variable:"+instance_variable);
    System.out.println("static variable:"+static_variable);
  }
  
  public static void main(String[] args)
  {
    StaticDemo sd1 = new StaticDemo();
    sd1.instanceMethod();
    sd1.display();
    StaticDemo sd2 = new StaticDemo();
    sd2.instanceMethod();
    sd2.staticMethod();
    sd2.display();
    sd1.display();
    StaticDemo.staticMethod();
    sd1.display();
    sd2.display();
  }
}