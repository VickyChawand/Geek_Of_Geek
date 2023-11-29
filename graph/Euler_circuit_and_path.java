// TC: O(V) SC: O(1)

// Steps:

// 1. Find vertices with odd degree.

// 2. Apply Euler circuit and path property.

// (0 odd degree vertices means Euler circuit is Present,  exactly 2 odd degree vertices means Euler path is Present).

// 3. Finally, check the value of the count variable and return appropriate result.

  class Solution{
    public int isEulerCircuit(int V, List<Integer>[] adj) 
    {
        // code here
      int count = 0;
	    for(int i=0; i<V; i++){
	        count += adj[i].size() % 2;
	    }
	    if(count == 0) return 2;
	    if(count == 2) return 1;
	    return 0;
    }
}
