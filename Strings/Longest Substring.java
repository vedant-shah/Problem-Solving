// Given a string s, find the length of the longest substring without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int c = 0;
        int l=0;
        HashMap<Character, Integer> hm =new HashMap<>();
        if(s.length()==1)
            return 1;
        for(int i=0; i<s.length()-1;i++){
            hm.clear();
            hm.put(s.charAt(i),1);
            c=1;
            for(int j=i+1; j<s.length();j++){
                if(hm.containsKey(s.charAt(j)))
                    break;
                hm.put(s.charAt(j),1);
                c++;
            }
            if(c>max)
                max=c;
        }
        return max;
}
}
