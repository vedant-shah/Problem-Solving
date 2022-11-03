/*

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

*/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1= new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
            {
            if(map.containsKey(s.charAt(i)))
               map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else{
                map.put(s.charAt(i),1);
                }
            if(map1.containsKey(t.charAt(i)))
            map1.put(t.charAt(i),map1.get(t.charAt(i))+1);
            else
map1.put(t.charAt(i),1);
            }
       if(map.equals(map1))
        return true;
        return false;
    }
}
