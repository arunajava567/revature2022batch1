import java.util.*;
import java.io.*;
import java.lang.String;

public class StringCount{
	public static void main(String args[]){
		String searchFor = "is";
		String base = "This is the method";
		int len = searchFor.length();
		int result = 0;
		if (len > 0) {  
		int start = base.indexOf(searchFor);
		while (start != -1) {
				result++;
				start = base.indexOf(searchFor, start+len);
			}
		}
    System.out.println(result);
	}
} 