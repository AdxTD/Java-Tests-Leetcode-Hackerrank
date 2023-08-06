import java.math.BigInteger;
import java.util.*;  

public class App {

    /// Imagination Test, Q2, find shortest unique substring length 
    public static int solutionQ2(String str){
        int len = str.length();
        int i = 1; // will represent length of a substring by adding 1 to it 
        while( i < len){
            int count = 0;
            Map<String, Integer> mMap = new HashMap<String, Integer>();
            for (int j = 0; j+i <= len; j++) {
                String s = str.substring(j, j+i);
                int prevOccurence = mMap.getOrDefault(s, 0);
                System.out.println(s + prevOccurence);
                if( prevOccurence == 0){
                    mMap.put(s, 1);
                } else{
                    if(prevOccurence == 1) count++; // counting the ones that have been repeated more than once
                    mMap.put(s, prevOccurence + 1); // storing that it has repeated more than once, the real value is not really important
                }
            }
            if(count < mMap.size()) // means there"s an element which has appeared just once
                return i; // returing the length of that element, which would be the shortest one indeed

            i++;
        }
        return len;
    }

    public static String markDownSample = "# Sample Markdown\n"+
    "## Second Heading\n"+
    "_italic_somthing\n"+
    "**bold**\n\n"+
    
    "Bullet list:\n\n"+
    
    "  * apples\n"+
    "  * oranges\n"+
    "  * pears\n\n"+
    
    "This is some basic, sample markdown.\n\n"+
    
    "## Second Heading\n\n";

    public static void main(String[] args) throws Exception {
        boolean stop = true;
        int i = 0; System.out.println("i=" + i++);
        BigInteger sum = new BigInteger("2");
        System.out.println("sum = " + sum);
        sum.add(new BigInteger("5"));
        System.out.println("sum2 = " + sum); if(stop) return;
        System.out.println(markDownSample + "\nAfter converting to html:\n" + 
        MarkDown2HTML.markDown2Html(markDownSample)); boolean testOnce = true; if(testOnce) return;
        //System.out.println("Hello, World!, Solution for Q2: " + solutionQ2("r"));
        int count = HoursPermutations.coutHoursPermutations(new int[] {5,5,5,5});
        System.out.println("Hello, World!, Solution for Hours: " + count);
        System.out.println("Hello, World!, Solution Palindrom Int " + PalindromeInt.isPalindrome(102332201));
        System.out.println("Hello, World!, Solution Palindrom String " + PalindromeSubstring.longestPalindromeCenters("abasba"));
        char[][] board = new char[][]{
            {'5','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}};
        
        System.out.println("Hello, World!, Solution for Sudoko: " + SudokuValidator.isValidSudoku(board));
    }
}
