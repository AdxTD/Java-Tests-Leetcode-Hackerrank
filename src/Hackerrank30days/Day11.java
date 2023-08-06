package Hackerrank30days;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
public class Day11 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int maxSum = -63;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int sum = 0;
                sum += arr.get(i).get(j);
                sum += arr.get(i).get(j+1);
                sum += arr.get(i).get(j+2);
                sum += arr.get(i+1).get(j+1);
                sum += arr.get(i+2).get(j);
                sum += arr.get(i+2).get(j+1);
                sum += arr.get(i+2).get(j+2);
                if(maxSum < sum) maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
