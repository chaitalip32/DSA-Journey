class MergeSortedarrays {
    static void mergeArray(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[] merged=new int[n+m];
        int i,j,k;
        i=j=k=0;
        
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                merged[k++]=arr1[i++];
            }
            else{
                merged[k++]=arr2[j++];
            }
        }
        
        while(i<n)
            merged[k++]=arr1[i++];
        
        while(j<m)
            merged[k++]=arr2[j++];
            
        for(i=0;i<n;i++){
            arr1[i]=merged[i];
        }
        
        for(j=0;j<m;j++){
            arr2[j]=merged[n+j];
        }
    }
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};
        
        mergeArray(arr1,arr2);
        for(int num:arr1){
            System.out.print(num+" ");
        }
        System.out.println();;
        for(int num:arr2){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}