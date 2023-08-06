package Hackerrank30days;
import java.io.*;
import java.math.*;
public class Day10 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        int power = 31;
        int max = 0;
        int count = 0;
        while(power >= 0 && n > 0){
            if(n >= Math.pow(2.0, Double.valueOf(power))){
                count++;
                n -= Math.pow(2.0, Double.valueOf(power));
            }
            else{
                if(max < count) max = count;
                count = 0;
            }
            power--;
        }
        if(max < count) max = count;
        System.out.println(max);
    }
}
