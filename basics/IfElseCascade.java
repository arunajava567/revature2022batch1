public class IfElseCascade
{
		public static void main(String args[])
		{
				int i=0;

				char ch=' ';
				
				System.out.println("Enter an alphabet : ");

				try
				{
						ch = (char) System.in.read();
				}
				catch(Exception e)
				{}

				if(ch=='a')
				{
						i = 10;
				}
				else if(ch=='b')
				   {
							i = 20;
				   }
				else if(ch=='c')
				   {
							i = 30;
				   }
				else if(ch=='d')
				   {
							i = 40;
				   }

				System.out.println("i Value is ...	:	" + i);
		}
}