class Solution {
public:
    string frequencySort(string s) {
        int n = s.size();
        vector<int>freq(256);
        for(char ch : s){
            freq[ch]++;
        }

        sort(s.begin(),s.end(),[&](auto& a , auto& b){
        if(freq[a]==freq[b]) return a>b;
        return freq[a]>freq[b];
        });
        return s;
    }
};