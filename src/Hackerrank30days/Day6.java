package Hackerrank30days;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Day6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        //String[] input = new String[n];
        for(int i = 0; i < n; i++){
            String str = bufferedReader.readLine().trim();
            String even = "", odd = "";
            for(int j = 0; j < str.length(); j++){
                if(j%2 == 0)
                    even += str.charAt(j);
                else
                    odd += str.charAt(j);
            }
            System.out.println(even + " " + odd);
        }
        bufferedReader.close();
        
        
    }
}
