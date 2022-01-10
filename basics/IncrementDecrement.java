class IncrementDecrement
{
	public static void main(String args[])
	{
		int x = 10, y = 20;

		System.out.println("\n Out put...");

		System.out.println("		x = " + x );

		System.out.println("		y = " + y );

		System.out.println("		++x = " + (++x) );

		System.out.println("		y++ = " + (y++) );

		System.out.println("		x = " + x );

		System.out.println("		y = " + y );

		System.out.println("		--x = " + (--x) );

		System.out.println("		y-- = " + (y--) );

		System.out.println("		x = " + x );

		System.out.println("		y = " + y );

		// Negation Operation
		System.out.println("	\n\n Negation Operation ");

		System.out.println("		x = " + x );

		y = -x;

		System.out.println("		-x = " + y );

		// Bitwise Complement Operation
		System.out.println("	\n\n Bitwise Complement Operation ");

		System.out.println("		x = " + x );

		y = ~x;

		System.out.println("		~x = " + y );
	}
}