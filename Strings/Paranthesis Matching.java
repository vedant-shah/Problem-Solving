// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"
// Output: true
class Solution {
    int top =-1;
     void push(char []arr,char ch)
{
        if(top<=arr.length-1)
        {
             arr[++top]=ch;
        }
       
        
}
 void pop(char[] arr)
{
    top--;
}
    
    public boolean isValid(String s) {
        char arr[]= new char[s.length()];
        

    for(int i=0 ; i<s.length(); i++)
    {
        if(s.charAt(i)=='{' ||s.charAt(i)=='(' ||s.charAt(i)=='[' )
        push(arr,s.charAt(i));
        else if(top>-1 && (s.charAt(i)=='}' &&  arr[top]=='{' || s.charAt(i)==')' &&  arr[top]=='(' || s.charAt(i)==']' &&  arr[top]=='['))
        pop(arr);
        else if((s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']') && top==-1)
            return false;
        else
            return false;
    }
        
    if(top==-1)
    return true;
    else
    return false;
    
}
}
