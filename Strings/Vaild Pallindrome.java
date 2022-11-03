/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

*/

class Solution {
    public boolean isPalindrome(String s)  {
        String s1="",s2="";
        
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                s1+=s.charAt(i);
        }
        
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        System.out.println(s1);
        if(s1.equalsIgnoreCase(s2))
            return true;
        return false;
    }
}
