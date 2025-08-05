import java.util.* ;
import java.io.*; 
public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        int l = 0;
        int r = n-1;
        int count  = 0;
        while(l<r){
            int sum = arr[l] + arr[r];
            if(sum == target){
                count++ ;
                l++;
                r--;
            }else if(sum < target){
                l ++ ;
            }else {
                r--;
            }
            
        }
        if(count!=0) {
            return count;
        }else{
            return -1;
        }
    }
}
