//Varible Scope Demo
public class VariableScopeDemo
{
    public static void main(String[] args)
    {
		int var1 = 10;
		
		System.out.println("Var1:"+var1);
	
		fun1(var1);
		
		System.out.println("Var1:"+var1);
	}

	static void fun1(int var1)
	{
		var1 = 20;
		System.out.println("Var1:"+var1);
    }
}