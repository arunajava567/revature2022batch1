import java.io.*;
import java.util.*;

public class StackImplement{
	Stack<Integer> stack;
	String str;
	int num, n;
	public static void main(String[] args){
		StackImplement q = new StackImplement();
	}
	public StackImplement(){
		try{
		stack = new Stack<Integer>();
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(ir);
		System.out.print("Enter number of elements : ");
		str = bf.readLine();
		num = Integer.parseInt(str);
		for(int i = 1; i <= num; i++){
			System.out.print("Enter elements : ");
			str = bf.readLine();
			n = Integer.parseInt(str);
			stack.push(n);
		}
		}
		catch(IOException e){}
		System.out.print("Retrieved elements from the stack : ");
		while (!stack.empty()){
			System.out.print(stack.pop()+"  ");
		}
	}
}