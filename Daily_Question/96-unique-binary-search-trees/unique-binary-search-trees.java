class Solution {
    public int numTrees(int n) {
        int[] uniqueTree = new int[n + 1];
        for(int i=0; i <= n; i++){
            uniqueTree[i] = 1;
        }
        for(int node=2; node <= n; node++){
            int total = 0;
            for(int root = 1; root <= node; root++){
                total += uniqueTree[ root - 1 ] * uniqueTree[node - root];
            }
            uniqueTree[node] = total;
        }
        return uniqueTree[n];
    }
}