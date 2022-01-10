class WhileLoopNested
{
		public static void main(String args[])
		{
				int i = 1, j =1;

				while(i<=3)
				{
						System.out.println();

						while(j<=3)
						{
								System.out.print("(" + i + ", " + j +")");
								j++;
						}
						System.out.println();
						j=1;
						i++;
				}

				System.out.println("");
				System.out.println("End of the while loop...");
		}
}