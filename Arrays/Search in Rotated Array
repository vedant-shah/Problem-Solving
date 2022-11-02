/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
*/


class Solution {
    public int search(int[] nums, int target) {
    int sortArr[] = new int[nums.length];
    int pivot = pivot(nums,0,nums.length-1);
    if(pivot!=0){
    int arr1[] = Arrays.copyOfRange(nums, pivot, nums.length);
    int arr2[] = Arrays.copyOfRange(nums, 0, pivot);
    
    System.arraycopy(arr1,0,sortArr,0,arr1.length);    
    System.arraycopy(arr2,0,sortArr,arr1.length,arr2.length);
    }
    else{
        System.arraycopy(nums,0,sortArr,0,nums.length);
    }
        int ans = binarySearch(sortArr,0,sortArr.length-1,target);
        if(ans != -1)
            ans= (ans+pivot)%nums.length;
        
        return ans;
    }
int pivot(int [ ] arr, int s, int e){
    int mid=(s+e)/2;
    if(arr[s]<arr[e] || s==e)
        return s;
    if(arr[mid+1]< arr[mid])
    return mid+1 ;
    if(arr[s]>arr[mid])
    return pivot(arr , s ,mid);
    else
        return pivot(arr ,mid+1 , e) ;
    
    }
   int binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        return mid; 
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
      return -1;
 } 
}
