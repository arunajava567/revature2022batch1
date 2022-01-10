//Switch Demo
public class SwitchDemo
{
     public static void main(String[] args)
     {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int result;
		
		System.out.println("Enter Number 1");
		int n1 = in.nextInt();
		
		System.out.println("Enter Number 2");
		int n2 = in.nextInt();
		
		System.out.println("1. Add Numbers");
		System.out.println("2. Subtract Numbers");
		System.out.println("3. Multiply Numbers");
		System.out.println("4. Divide Numbers");
		System.out.println("Enter your Choice");
		
		int choice = in.nextInt();
		
		switch(choice)
		{
			case 1 : result = n1 + n2;break;
			case 2 : result = n1 - n2;break;
			case 3 : result = n1 * n2;break;
			case 4 : result = n1 / n2;break;
			default: System.out.println("Invalid Choice");System.exit(1);
		}
		System.out.println("Result:"+result);
     }
}