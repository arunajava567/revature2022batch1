class DoWhileLoopContinue
{
		public static void main(String args[])
		{
				int i = 0;

				do
				{
						if(i==2)
						{
								i++;
								continue;
						}
						System.out.println("i Value is ... :	" + i);
						i++;
				}while(i<5);

				System.out.println("");
				System.out.println("End of the do-while loop...");
		}
}