/*

Leetcode : 1722 . Minimize Hamming Distance After Swap Operations
You are given two integer arrays, source and target, both of length n. 
You are also given an array allowedSwaps where allowedSwaps[i] = [ai, bi] indicates that you are allowed to swap the elements at index ai and index bi (0-indexed) of array source. 
Note that you can swap elements at a specific pair of indices multiple times and in any order. 
The Hamming distance of two arrays of the same length, source and target, is the number of positions where source and target differ.
Return the minimum Hamming distance of source and target after performing any amount of swap operations on array source.

Example 1:  
Input: source = [1,2,3,4], target = [2,1,4,5], allowedSwaps = [[0,1],[2,3]]
Output: 1

Explanation: We can swap indices 0 and 1 in source to get [2,1,3,4]. 
              The Hamming distance of source and target is now 1 as they differ in the 3rd position. 
              It can be shown that we cannot get a Hamming distance of 0, so we return 1. 


*/

class Solution {

    private int[] fa;
    private int[] rank;

    private int find(int x) {
        if (fa[x] != x) {
            fa[x] = find(fa[x]);
        }
        return fa[x];
    }

    private void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) return;
        if (rank[x] < rank[y]) {
            int temp = x;
            x = y;
            y = temp;
        }
        fa[y] = x;
        if (rank[x] == rank[y]) {
            rank[x]++;
        }
    }

    public int minimumHammingDistance(
        int[] source,
        int[] target,
        int[][] allowedSwaps
    ) {
        int n = source.length;
        fa = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            fa[i] = i;
        }

        for (int[] pair : allowedSwaps) {
            union(pair[0], pair[1]);
        }

        Map<Integer, Map<Integer, Integer>> sets = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int f = find(i);
            sets.putIfAbsent(f, new HashMap<>());
            Map<Integer, Integer> cnt = sets.get(f);
            cnt.put(source[i], cnt.getOrDefault(source[i], 0) + 1);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int f = find(i);
            Map<Integer, Integer> cnt = sets.get(f);
            if (cnt.getOrDefault(target[i], 0) > 0) {
                cnt.put(target[i], cnt.get(target[i]) - 1);
            } else {
                ans++;
            }
        }
        return ans;
    }
}