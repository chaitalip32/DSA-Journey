public class FindMissingNumber{
    public static void main(String args[]){
        int[] arr={1,2,3,5};

        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }

        int missingNumber=sum-totalsum;
        System.out.println(missingNumber);
    }
}