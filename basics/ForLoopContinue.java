/** When a continue statement is executed, it
		causes the flow of control to the next iteration
		of the loop.
*/

class ForLoopContinue
{
		public static void main(String args[])
		{
				for(int i = 0; i<10; i++)
				{
						if(i==2)
							continue;

						System.out.println("i Value is ...	:	" + i);
				}

				System.out.println("");
				System.out.println("End of for loop...");
		}
}