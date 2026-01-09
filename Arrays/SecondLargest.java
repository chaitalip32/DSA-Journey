class SecondLargest {
    
    pubic static int getSecondlargest(int[] arr){
        int largest=-1;
        int secondlargest=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[] arr={12,35,1,10,34};
        System.out.println("Second Largest element is "+getSecondlargest(arr));
    }
}