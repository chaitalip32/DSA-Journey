class FindMaxSubArray {
    public static int findMaxSubArray(int[] arr){
        int res=arr[0];
        
        int maxEnding=arr[0];
        for(int i=0;i<arr.length;i++){
            //Either extend the previous subarray or start new array from the current element
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            
            //update the result if the new subarray sum is greter that the previous
            res=Math.max(maxEnding,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};
        System.out.println(findMaxSubArray(arr));
    }
}