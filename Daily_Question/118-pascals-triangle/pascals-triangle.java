class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
       
        int dp[][] = new int[numRows][numRows];

        for(int i=0;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();

            for(int j=0;j<=i;j++){
                
                if(j==0 || i==j ){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
                temp.add(dp[i][j]);
            }
        result.add(temp);
        }
        return result;

    }
}