/** You can have nested for loops. ie, you can
		have a for loop nested inside another for loop.
*/

class ForLoopNested
{
		public static void main(String args[])
		{
				for(int i = 1; i<=3; i++)
				{
						System.out.println();

						for(int j = 1; j<=3; j++)
						{
								System.out.print("(" + i + ", " + j +")");
						}
						System.out.println();
				}
				System.out.println("");
				System.out.println("End of for loop...");
		}
}