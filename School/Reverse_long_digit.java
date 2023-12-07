// Given N,  reverse the digits of N.
class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        String reverse = Long.toString(n);
        String temp = "";
        for(int i = reverse.length()-1; i>=0; i--)
        {
            temp += reverse.charAt(i);
        }
        
        long res = Long.parseLong(temp);
        return res;
    }
}
