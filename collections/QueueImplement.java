import java.io.*;
import java.util.*;

public class QueueImplement{
	LinkedList<Integer> list;
	String str;
	int num;
	public static void main(String[] args){
		QueueImplement q = new QueueImplement();
	}
	public QueueImplement(){
		try{
			list = new LinkedList<Integer>();
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader bf = new BufferedReader(ir);
			System.out.println("Enter number of elements : ");
			str = bf.readLine();
			if((num = Integer.parseInt(str)) == 0){
				System.out.println("You have entered either zero/null.");
				System.exit(0);
			}
			else{
				System.out.println("Enter elements : ");
				for(int i = 0; i < num; i++){
					str = bf.readLine();
					int n = Integer.parseInt(str);
					list.add(n);
				}
			}
			System.out.println("First element :" + list.removeFirst());
			System.out.println("Last element :" + list.removeLast());
			System.out.println("Rest elements in the list :");
			while(!list.isEmpty()){
				System.out.print(list.remove() + "\t");
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage() + " is not a legal entry.");
			System.exit(0);
		}
	}
}
