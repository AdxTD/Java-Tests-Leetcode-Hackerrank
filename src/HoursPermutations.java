import java.util.*;

public class HoursPermutations
{
    public static int coutHoursPermutations(int[] A){
        int len = A.length; if(len < 4) return 0; 
        HashSet<Integer> possibleHours = new HashSet<Integer>();
        for(int i = 0; i < len; i++){

            if( A[i] > 2) continue;

            for (int j = 0; j < len; j++) {
            
                if( j == i) continue;
                if(A[i]== 2 && A[j] > 3) continue;

                for (int k = 0; k < len; k++) {

                    if( k == i || k == j) continue;
                    if( A[k] > 5) continue;

                    for (int l = 0; l < len; l++) {

                        if( l == i || l == j || l == k) continue;
                        int possibility = A[i] + A[j]*10 + A[k]*100 + A[l]*1000;
                        possibleHours.add(possibility);
                        
                    }
                }
            }
        }
        return possibleHours.size();
    }

}