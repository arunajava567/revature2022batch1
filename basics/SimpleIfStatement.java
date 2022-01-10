public class SimpleIfStatement
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
						System.out.println("Implementing If Statement");
				}

				System.out.println("After If Statement. Last Statement...");
		}
}