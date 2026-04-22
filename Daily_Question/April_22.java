/*

Leetcode 2452 : Words Within Two Edits of Dictionary
You are given two string arrays, queries and dictionary.
All words in each array comprise of lowercase English letters and have the same length.

In one edit you can take a word from queries, and change any letter in it to any other letter.
Find all words from queries that, after a maximum of two edits, equal some word from dictionary.

Return a list of all words from queries, that match with some word from dictionary after a maximum of two edits.
Return the words in the same order they appear in queries.

Example 1:
Input: queries = ["word","note","ants","wood"], dictionary = ["wood","j
ord","moat"]
Output: ["word","note","wood"]

*/

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> que = new ArrayList<>();

        for(String qu : queries){
            for(String di : dictionary){
                int dis=0;

                for(int i=0;i<qu.length();i++){

                    if(qu.charAt(i)!=di.charAt(i))
                    {
                        dis++;
                    }
                }
                if(dis<=2){
                    que.add(qu);
                    break;
                }
            }
        }
        return que;
    }
}