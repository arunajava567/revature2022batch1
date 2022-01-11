public class StrCopyValueOf{
    public static void main(String[] args){
		char[] arr = new char[] { '6', '8', '5', '3' };
		String str = String.copyValueOf(arr, 0, 1);
		System.out.println("The new String contains \"" + str + "\"");
    }
}