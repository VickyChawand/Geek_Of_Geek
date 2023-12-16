// Topic :- permutation and combination
class Solution 
{ 
    static long countStr(long n)
	{
	    long case1=1; // all a
        long case2=n; // one b
        long case3=n; // one c
        long case4=n*(n-1); // one b,one c
        long case5=(n*(n-1))/2; // two c
        long case6=(n*(n-1)*(n-2))/2; // one b, two c
    
    return case1+case2+case3+case4+case5+case6;
	}
}

class Solution 
{ 
    static long countStr(long n)
	{
	        return 1 + 2*n + n*(n-1)*(n+1)/2;
	}
} 
