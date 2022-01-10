public class SimpleIfElseStatement
{
		public static void main(String args[])
		{
				char ch=' ';
				
				System.out.println("Enter an alphabet : ");

				try
				{
						ch = (char) System.in.read();
				}
				catch(Exception e)
				{}

				if(ch=='x')
				{
						System.out.println("Inside - ' If ' - Block");
				}
				else
				   {
							System.out.println("Inside - 'Else' - Block");
				   }

				System.out.println("After If Else Statement. Last Statement...");
		}
}