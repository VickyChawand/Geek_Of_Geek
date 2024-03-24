Question:- Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.
Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.

Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(LogN) if solving recursively and O(1) otherwise.


Constraints:

1 <= N <= 10^5
1 <= arr[i] <= 10^6
1 <= K <= 10^6
Solution:- 
  class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
                index=i;
        }
        if(index==0)
            index=-1;
        return index;
    }
}
