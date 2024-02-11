// These code works but will get TLE.
class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        list.add(i);
        while(i<n){
            int result = list.get(i) - (i+1);
            if(result<0 || list.contains(result)){
                result = list.get(i) + (i+1);
                list.add(result);
            }
            else{
                list.add(result);
            }
            i++;
        }
        return list;
    }
}
// Optimised Approach
class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
         ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        
        for (int i = 1; i < n; i++) {
            int val = list.get(i - 1) - i;
            if (val < 0 || set.contains(val)) {
                val = list.get(i - 1) + i;
            }
            list.add(val);
            set.add(val);
        }
        
        return list;
    }
}
