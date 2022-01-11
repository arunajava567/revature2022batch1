public class matchstr{
		public static void main(String args[]){
		String str1 = new String("Java is a wonderful language");
		String str2 = new String("It is object-oriented language");
		boolean result = str1.regionMatches(20, str2, 25, 6);   
		System.out.println(result);
		}
	}