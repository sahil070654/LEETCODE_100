class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int left = 0;
        int right = n - 1;
        while ( k > 0) {
            sum += Math.max(arr[left], arr[right]);
            left++;
            right--;
            k--;
            System.out.println(sum);

        }
        return sum;
    }
}
