package booking_test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




public class SolutionQ1 {
    
    public class Solution {

public static List<String> autoCorrectSuggestions(String input, List<String> destinations) {
    List<String> result = new ArrayList<>();
    HashMap<String, Integer> differencesMap = new HashMap<>();
    
    int minDiff = input.length() + 1;
    for (String destination : destinations) {
        if(destination.length() != input.length()) continue;
        int difference = 0;
        for (int i = 0; i < destination.length(); i++) {
            if(destination.charAt(i) != input.charAt(i)) 
                difference++;
        }
        if(minDiff > difference) 
            minDiff = difference;
        differencesMap.put(destination, difference);
    }
    for (String destination : destinations) {
        if(! differencesMap.containsKey(destination)) continue;
        int difference = differencesMap.get(destination);
        if(difference == minDiff)
            result.add(destination);
        
    }
    return result;
}
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    
            String input = bufferedReader.readLine();
    
            int destinationsCount = Integer.parseInt(bufferedReader.readLine().trim());
    
            List<String> destinations = IntStream.range(0, destinationsCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                .collect(toList());
    
            List<String> result = Solution.autoCorrectSuggestions(input, destinations);
    
            bufferedWriter.write(
                result.stream()
                    .collect(joining("\n"))
                + "\n"
            );
    
            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}

