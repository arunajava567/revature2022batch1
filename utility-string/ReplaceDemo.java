public class ReplaceDemo {
	public static void main(String[] args) {
        String str = "Her name is Tamana and Tamana is a good girl.";
		String strreplace = "Sonia";
		String result = str.replaceAll("Tamana", strreplace);
		System.out.println(result);
    }
}
