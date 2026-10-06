class Solution {
    public int minRotations(String s) {
        int rotation = 0;
        int curr = 0;

        for (int i =0; i < s.length(); i++){
            int target = s.charAt(i) - '0';

            int dis = Math.abs(curr - target);

            rotation += Math.min(dis, 10 - dis);
            
            curr = target;
        }
        return rotation;
    }
}