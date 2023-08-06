

public class PalindromeSubstring{

    public static String longestPalindrome(String s) {
        int len = s.length();
        while(len > 0){
            for (int i = 0; i + len <= s.length(); i++) {
                String sub = s.substring(i, i+len-1);
                int j = sub.length(), k = 0;
                boolean isPal = true;
                while(k < j){
                    if(sub.charAt(k) != sub.charAt(j)){
                        isPal = false;
                        break;
                    }
                    k++; j--;
                }
                if(isPal) return sub;
            }
            len--;
        }
        return "";
    }

    public static String longestPalindromeDP(String s){
        int len = s.length(); if(len == 1) return s;
        boolean[][] dp = new boolean[len][len];
        int longest = 0;
        String ans = "";
        for (int g = 0; g < len; g++) {
            for (int i = 0, j = g; j < len; i++,j++) {
                if( g==0) dp[i][i] = true;
                else if (g == 1){
                    if(s.charAt(i) == s.charAt(j)) dp[i][j] = true;
                    else dp[i][j] = false;
                }
                else {
                    if(dp[i+1][j-1] && s.charAt(i) == s.charAt(j)) dp[i][j] = true;
                    else dp[i][j] = false;
                }

                if(dp[i][j]){
                    if(j-i+1 > longest){
                        longest = j-i+1;
                        ans = s.substring(i, j+1);
                    }
                }
            }
        }
        return ans;
    }

    public static String longestPalindromeCenters(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}