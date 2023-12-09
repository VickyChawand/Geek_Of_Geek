class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int itr : arr) {
                frequencyMap.put(itr, frequencyMap.getOrDefault(itr, 0) + 1);
        }
        for (int i = 0; i < N; i++) {
                arr[i] = frequencyMap.getOrDefault(i + 1, 0);
        }
    }
}
