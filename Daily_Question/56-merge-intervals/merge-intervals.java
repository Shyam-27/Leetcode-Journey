class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        List<int[]> res = new ArrayList<>();

        for(int[] cur : intervals){
            if(res.isEmpty() || cur[0]>res.get(res.size()-1)[1]){
                res.add(cur);
            }
            else{
                res.get(res.size()-1)[1]=Math.max(cur[1],res.get(res.size()-1)[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}