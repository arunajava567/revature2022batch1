import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class ListShuffling{
    public static void main(String args[]) {
        // create an array of employee names of string type.
        String employee[] = {"Mahendra", "Anu", "Sandeep", "Girish", "Komal"};
        // create list for the specified array of employee.
        List list1 = Arrays.asList(employee);
        // create object of Random class to generate number randomly.
        Random num = new Random();
        // shuffle and print the list according to the generated random number.
        Collections.shuffle(list1, num);
        System.out.println(list1);
    }
}