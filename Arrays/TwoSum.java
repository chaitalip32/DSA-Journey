import java.util.Arrays;

public class TwoSum {

    public static int[] twosum(int[] arr, int target) {

        int n = arr.length;
        int[][] nums = new int[n][2];

        // Store value and original index
        for (int i = 0; i < n; i++) {
            nums[i][0] = arr[i]; // value
            nums[i][1] = i;      // index
        }
        
        Arrays.sort(nums, (a,b)->a[0]-b[0]);
        
        int left=0, right=n-1;
        
        while(left<right){
            int sum=nums[left][0]+nums[right][0];
            if(sum==target){
                return new int[]{nums[left][1],nums[right][1]};
            }
            else if(sum<left){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    
    public static void main(String[] args){
        int[] arr={-1, 0, -3, -2, 1, 3};
        int target=-2;
        
        int[] result=twosum(arr,target);
        System.out.print("Positions are "+Arrays.toString(result));
    }
}