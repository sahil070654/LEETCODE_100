class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int n = nums.length;
        for(int i: nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int k : freq.keySet()){
            if(freq.get(k)>=2){
                return true;
            }
        }
        return false;
    }
}
