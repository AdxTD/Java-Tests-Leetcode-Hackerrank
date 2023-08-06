package Hackerrank30days;
import java.io.*;
import java.math.*;


class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
        double tip = BigDecimal.valueOf(tip_percent * meal_cost / 100).setScale(2, RoundingMode.HALF_UP)
        .doubleValue();
        double tax = BigDecimal.valueOf(tax_percent * meal_cost / 100).setScale(2, RoundingMode.HALF_UP)
        .doubleValue();
        double totalCost = meal_cost + tip  + tax;
        System.out.println(Math.round (totalCost));    
    }

}

public class Day2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
    
}
