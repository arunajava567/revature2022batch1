//Creating and Retriving elements of an array

public class ArrayDeclarationSample
{
    public static void main(String[] args)
    {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		int intArray = new intArray[5];

		System.out.println("Enter 5 values");
		
		for(int i=0;i<intArray.length;i++)
		{
			intArray[i] = in.nextInt();
		}
		
		System.out.println("Array Elements are");
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
    }
}