/** When a break statement is executed, it
		causes the flow of control to pass out of
		the for loop.
*/

class ForLoopBreak
{
		public static void main(String args[])
		{
				for(int i = 0; i<10; i++)
				{
						if(i==2)
							break;

						System.out.println("i Value is ...	:	" + i);
				}

				System.out.println("");
				System.out.println("End of for loop...");
		}
}