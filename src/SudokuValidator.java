import java.util.HashMap;

public class SudokuValidator{

    public static boolean isValidSudoku(char[][] board) {
        int len = 9;
        // validating lines
        for (int i = 0; i < len; i++) {
            HashMap<Integer, Integer> mMap = new HashMap<>();
            for (int j = 0; j < len; j++) {
                char c = board[i][j];
                if(c == '.') continue;
                if( mMap.get(Integer.parseInt(""+c)) != null ) {
                    System.out.println("broken case is: " + c);
                    return false;
                }
                mMap.put(Integer.parseInt(""+c), 1);
            }
        }

        // validating columns
        for (int i = 0; i < len; i++) {
            HashMap<Integer, Integer> mMap = new HashMap<>();
            for (int j = 0; j < len; j++) {
                char c = board[j][i];
                if(c == '.') continue;
                if(mMap.get(Integer.parseInt(""+c)) != null ) {
                    System.out.println("broken case is: " + c);
                    return false;
                }
                mMap.put(Integer.parseInt(""+c), 1);
            }
        }

        // validating 9 boxes
        for (int box = 0; box < len; box++) {
            HashMap<Integer, Integer> mMap = new HashMap<>();
            int iLimit = 9, iInit = 6;
            if(box < 6) {iLimit =  6; iInit = 3;}
            if(box < 3) {iLimit = 3; iInit = 0;}
            for (int i = iInit; i < iLimit; i++) {
                for (int j = (box%3) * 3; j < 3 * (box%3) + 3; j++) {
                    char c = board[i][j];
                    if(c == '.') continue;
                    if(mMap.get(Integer.parseInt(""+c)) != null )  {
                        // System.out.println("broken case from boxes is: " + c + ", and box= "+box+", and i = "+i+", and j = " + j );
                        return false;
                    }
                    // if( box == 3) System.out.println("Add value: " + c);
                    mMap.put(Integer.parseInt(""+c), 1);
                }
            }
        }

        return true;
    }
}