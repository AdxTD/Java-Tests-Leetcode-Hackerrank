package Hackerrank30days;
import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        if(input.hasNext()){
            n = Integer.parseInt(input.nextLine());
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(input.hasNext()){
                String str = input.nextLine();
                map.put(str.split(" ")[0], Integer.parseInt(str.split(" ")[1]));
            }
        }
        while(input.hasNext()){
            String name = input.nextLine();
            if(map.containsKey(name))
                System.out.println(name+"="+map.get(name));
            else
                System.out.println("Not found");
        }

        input.close();
    }
}
