class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int len = 1;
        int curr = 1;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]) continue;
            if(nums[i]-nums[i-1]==1){
                curr++;
            }else {
                curr = 1;
            }
            len = Math.max(len,curr);
        }
        return len;
    }
}
