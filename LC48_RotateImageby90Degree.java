class Solution {
    public void reverse(int[] arr){
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public void rotate(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(arr[i]);
        }
        
    }
}
