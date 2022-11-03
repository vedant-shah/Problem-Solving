/*
Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

Example 1:

Input:
N = 5
A[] = {-2, 1, -4, 5, 3}
Output: 1
Explanation: min = -4, max =  5. Sum = -4 + 5 = 1
*/

import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = A[0];
        int max = A[0];
        int sum=0;
        for(int i=1;i<N;i++){
            if(A[i]<min)
            min=A[i];
            else if(A[i]>max)
            max=A[i];
        }
        return sum=min+max;
    }
}
