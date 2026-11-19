class Solution {
    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();

        String combine = s + "#" + rev;
        int n = combine.length();
        int[] lps = new int[n];

        for (int i = 1; i < n; i++){

            int j = lps[i - 1];

            while ( j > 0 && combine.charAt(i) != combine.charAt(j)){
                
                j = lps[j - 1];
            }

            if (combine.charAt(i) == combine.charAt(j)){
                j++;
            }
            lps[i] = j;
        }

        int prefix = lps[n - 1];

        String rem = s.substring(prefix);

        return new StringBuilder(rem).reverse().toString() + s;
    }
}