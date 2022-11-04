// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int c =1;
        int min = getmin(strs);
        boolean f = true;
        while(c<=min && strs.length>1)
            {
               String pre=strs[0].substring(0,c);
            for(int i=0; i<strs.length;i++)
                {
                if(!strs[i].substring(0,c).equals(pre))
                    f=false;
            }
            if(!f){
                return strs[0].substring(0,c-1);}
            else{
                c++;}
            }
        if(strs.length==1)
            return strs[0];
            
        return strs[0].substring(0,c-1);
    }
    static int getmin(String[] arr){
       int min=arr[0].length();
        for(int i=1;i<arr.length;i++)
            {
            if(arr[i].length()<min)
                min=arr[i].length();
        }
        return min;
        }
}
