class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff = prices[j]-prices[i];
                max = Math.max(max,diff);
            }
        }
        return max;
    }
}
/*KADANE'S ALGORITHM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int max = 0;
        for(int i=1;i<n;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else if(prices[i]-buy > max){
                max = prices[i] - buy;
            }
        }
        return max;
    }
}
*/
