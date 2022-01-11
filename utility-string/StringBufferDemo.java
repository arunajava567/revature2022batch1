class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Hello");

		System.out.println("Buffer : " + sb1);
		System.out.println("Buffer Length: " + sb1.length());
		System.out.println("Buffer Capacity: " + sb1.capacity());

		System.out.println("------------------------------------------------------------");
		System.out.println("---		ensureCapacity() method		----");

		StringBuffer sb2 = sb1;
		sb2.ensureCapacity(40);

		System.out.println("Buffer : " + sb2);
		System.out.println("Buffer Length: " + sb2.length());
		System.out.println("Buffer Capacity: " + sb2.capacity());

		String s1 = "String Buffer is a peer class of String that provides";

		sb2 = new StringBuffer(s1);

		System.out.println("Buffer : " + sb2);
		System.out.println("Buffer Length: " + sb2.length());
		System.out.println("Buffer Capacity: " + sb2.capacity());

		System.out.println("------------------------------------------------------------");
		System.out.println("---		setLength(), charAt() and setCharAt() method		----");

		System.out.println("Buffer before : " + sb1);
		System.out.println("charAt(1) before : " + sb1.charAt(1));

		sb1.setCharAt(1, 'i');
		sb1.setLength(2);
		
		System.out.println("Buffer After : " + sb1);
		System.out.println("charAt(1) After : " + sb1.charAt(1));
		
		System.out.println("------------------------------------------------------------");
		System.out.println("---		append() method		----");

		String s2;
		int a = 42;

		StringBuffer sb3 = new StringBuffer(40);

		s2 = sb3.append("a = ").append(a).append("!").toString();

		System.out.println("String after append : " + s2);

		System.out.println("------------------------------------------------------------");
		System.out.println("---		insert() method		----");

		StringBuffer sb4 = new StringBuffer("I Java!");

		System.out.println("StringBuffer before insert : " + sb4);

		sb4.insert(2, "like ");

		System.out.println("StringBuffer after insert : " + sb4);

		System.out.println("------------------------------------------------------------");
		System.out.println("---		reverse() method		----");

		StringBuffer sb5 = new StringBuffer("abcdef");

		sb5.reverse();

		System.out.println("StringBuffer after reverse : " + sb5);

		System.out.println("------------------------------------------------------------");
		System.out.println("---		delete() and deleteCharAt() method		----");

		// StringBuffer delete(int startIndex, int endIndex)
		// StringBuffer deleteChatAt(int loc)

		StringBuffer sb6 = new StringBuffer("This is a test");

		System.out.println("Original String : This is a test");

		sb6.delete(4, 7);

		System.out.println("StringBuffer after Delete : " + sb6);

		sb6.deleteCharAt(0);

		System.out.println("StringBuffer after deleteCharAt : " + sb6);

		System.out.println("------------------------------------------------------------");
		System.out.println("---		replace() method		----");
		// StringBuffer replace(int startIndex, int endIndex, String str)

		StringBuffer sb7 = new StringBuffer("This is a test");

		sb7.replace(5, 7, "was");

		System.out.println("StringBuffer after replace() : " + sb7);

		System.out.println("------------------------------------------------------------");
		System.out.println("---		substring() method		----");
		// StringBuffer substring(int startIndex)
		// StringBuffer substring(int startIndex, int endIndex)

		System.out.println("StringBuffer sb2's substring : " + sb2.substring(5, 10));
	}
}