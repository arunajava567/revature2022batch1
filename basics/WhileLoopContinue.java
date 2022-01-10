class WhileLoopContinue
{
		public static void main(String args[])
		{
				int i = 0;

				while(i<5)
				{
						if(i==2)
						{
								i++;
								continue;
						}
						System.out.println("i Value is ... :	" + i);
						i++;
				}

				System.out.println("");
				System.out.println("End of the while loop...");
		}
}