class Solution {
    public int maxDepth(String s) {
        int depth = 0;

        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == ')') {
                depth--;
                continue;
            }

            if (c != '(') {
                continue;
            }
            depth++;

            if (depth > count) {
                count = depth;
            }

        }
        return count;

    }
}