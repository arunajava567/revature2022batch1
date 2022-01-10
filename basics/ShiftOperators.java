class ShiftOperators 
{
	public static void main(String[] args) 
	{
		int x = 12, y = -13;

		System.out.println("\n Out put : applying shift operators...");

		System.out.println("-------------------------------------------------------");

		System.out.println("");

		System.out.println("x value is = " + x );

		System.out.println("y value is = " + y );

		System.out.println("-------------------------------------------------------");

		System.out.println("");

		System.out.println("...Left Shift Operator...");
		
		System.out.println("");

		/*	Left Shift Operator

		x << 2 : Left shifts individual bits two times. 
					  The vaccum created at the right is
					  filled with zeros
		*/
		System.out.println("x<<2 = " + (x<<2) );

		System.out.println("y<<2 = " + (y<<2) );

		System.out.println("-------------------------------------------------------");

		System.out.println("");

		System.out.println("...Right Shift Operator...");
		
		System.out.println("");

		/*	Right Shift Operator

		x >> 2 : Right shifts individual bits two times. 
					  The vaccum created at the left is
					  filled with zeros. For negative integer,
					  the vaccum created at the left side is
					  filled with 1.
		*/
		System.out.println("x>>2 = " + (x>>2) );

		System.out.println("y>>2 = " + (y>>2) );

		System.out.println("-------------------------------------------------------");

		System.out.println("");

		System.out.println("...Zero-fill Right Shift Operator...");

		System.out.println("");

		/*	Zero-fill Right Shift Operator
		
		x >>> 2 : Right shifts individual bits two times. 
						 The vaccum created at the left is
						 filled with zeros.
		*/
		System.out.println("x>>>2 = " + (x>>>2) );

		System.out.println("y>>>2 = " + (y>>>2) );
	}
}