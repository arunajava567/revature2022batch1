import java.util.*;
public class VectorAdd{
  public static void main(String argv[]){
  Vector v = new Vector();
  v.add(0,new Integer(10));
  v.add(1,new Integer(20));
  v.add(2,new Integer(30));
  v.add(3,new Integer(40));
    v.add(4,new Integer(50));
  v.add(5,new Integer(60));
  for(int i=0; i < v.size();i ++){
  Integer iw =(Integer) v.get(i);
  System.out.println(iw);
  }
  }
}