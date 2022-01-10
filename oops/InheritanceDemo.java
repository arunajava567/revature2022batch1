
class Base
{
  int i;
  int j;
  
  void inputIJ(int i,int j)
  {
    this.i=i;
    this.j=j;
  }
  void dispIJ()
  {
    System.out.println("i="+i);
    System.out.println("j="+j);
  }
}
class Derived extends Base
{
  int k;
  
  void inputK(int k)
  {
    this.k=k;
  }
  void dispK()
  {
    System.out.println("k="+k);
  }
}

public class InheritanceDemo
{
  public static void main(String[] args)
  {
    Base b = new Base();
    b.inputIJ(10,20);
    b.dispIJ();
    Derived d = new Derived();
    d.inputIJ(30,40);
    d.dispIJ();
    d.inputK(50);
    d.dispK();
  }
}