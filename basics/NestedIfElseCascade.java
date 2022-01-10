import java.io.*;

public class NestedIfElseCascade
{
		public static void main(String args[])
		{
				int i=0;

				String s;
				
				System.out.println("Enter a NUMBER : ");

				try
				{
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

						s = br.readLine();

						i = Integer.parseInt(s);
				}
				catch(Exception e)
				{}

				if(i!=0)
				{
						if(i<10)
						{
								System.out.println("Inside the nested IF");
								System.out.println("The Value entered is less than 10");
						}
						else
						  {
								System.out.println("Inside the nested IF-ELSE");
								System.out.println("The Value entered is greater than 10");
						  }
				}

				System.out.println("");
				System.out.println("i Value is ...	:	" + i);
		}
}