public class ReplaceFirstDemo {
	public static void main(String[] args) {
		String str = "Her name is Tamana and Tamana is a good girl.";
		String strreplace = "Sonia";
		String result = str.replaceFirst("Tamana", strreplace);
		System.out.println(result);
    }
}
