class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int count = 0;
        for(int i=0;i<V;i++){
            count += adj.get(i).size();
        }
        return count;
    }
};

//Question (https://www.geeksforgeeks.org/problems/sum-of-dependencies-in-a-graph5311/1)
