import java.util.*;
import java.io.*;
import java.lang.String;

public class SortWords{
	public static void main(String args[]){
		String str = "This is my new string";
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		String sorted = new String(content);
		System.out.println(content);
	}
}