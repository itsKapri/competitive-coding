class Solution {
public:
    int countPrefixes(vector<string>& words, string s) {
        int count=0;
        string temp;
        for(auto i=0;i<words.size();i++){
            temp=s.substr(0,words[i].size());
            if(temp==words[i])count++;
        }
        return count;
    }
};