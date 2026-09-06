class Solution {
public:
    vector<vector<int>> cache;
    int numDistinct(string s, string t) {
        cache = vector<vector<int>>( s.length(), vector<int>(t.length(),-1));

        return dfs(0,0,s,t);
    }

    int dfs(int i, int j, string& s, string& t){
        if(j==t.length()) return 1;

        if(i==s.length()) return 0;

        if(cache[i][j]!=-1) return cache[i][j];

        if(s[i]==t[j]){
            cache[i][j]=dfs(i+1,j+1,s,t) + dfs(i+1,j,s,t);
        }else{
            cache[i][j]=dfs(i+1,j,s,t);
        }
        return cache[i][j];
    }
};