class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> arr = new HashMap<>();

        for( var k : knowledge){
            arr.put(k.get(0), k.get(1));
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                int j = s.indexOf(")", i + 1);
                str.append(arr.getOrDefault(s.substring(i + 1, j), "?"));
                i = j;
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();

    }
}


