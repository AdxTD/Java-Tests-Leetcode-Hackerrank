import java.util.*;

public class PalindromeInt{

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while(x != 0){
            nums.add(x%10);
            x /= 10;
        }
        int i = 0, j = nums.size() - 1;
        while(i < j){
            if(nums.get(i) != nums.get(j)) return false;
            i++; j--;
        }
        return true;
    }
}