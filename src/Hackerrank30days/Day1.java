package Hackerrank30days;
import java.util.*;

public class Day1 {
    
    public static void main(String[] args) {
        int i = 4; double d = 4.0; String s = "HackerRank ";
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int mInt; double mDouble; String mString;
        
        Scanner input = new Scanner(System.in);
        if (input.hasNext()) {
            mInt = Integer.parseInt(input.nextLine());
            System.out.println(i+mInt);
        }
        if (input.hasNext()) {
            mDouble = Double.parseDouble(input.nextLine());
            System.out.println(d+mDouble);
        }
        if (input.hasNext()) {
            mString = input.nextLine();
            System.out.println(s+mString);
        }
        input.close();
    }
}
