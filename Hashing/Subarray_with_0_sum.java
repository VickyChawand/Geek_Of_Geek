class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(0);
        for(int i =0;i<n;i++){
            sum+=arr[i];
            if(set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }
}
