class WhileLoopBreak
{
		public static void main(String args[])
		{
				int i = 0;

				while(i<10)
				{
						if(i==7)
								break;

						System.out.println("i Value is ... :	" + i);
						i++;
				}

				System.out.println("");
				System.out.println("End of the while loop...");
		}
}