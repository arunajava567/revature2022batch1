//Multi Dimesional Arrays Demo
public class MultiDimensionalArraySample
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

		int multiArray[][] = new int[3][3];
        
		System.out.println("Enter 9 values");
        
		for(int i=0;i<multiArray.length;i++)
        {
        	for(int j=0;j<multiArray[i].length;j++)
        	{
				multiArray[i][j] = in.nextInt();
			}
        }

		System.out.println("Multi Array Elements");
        
		for(int i=0;i<multiArray.length;i++)
        {
        	for(int j=0;j<multiArray[i].length;j++)
        	{
				System.out.print(multiArray[i][j]+" ");
			}
			System.out.println();
        }
    }
}