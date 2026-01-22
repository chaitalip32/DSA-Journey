import java.util.ArrayList;
class findDuplicatesInarray {
    public static ArrayList<Integer> findduplicates(int[] arr){
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                int idx=Math.abs(arr[i])-1;
                if(arr[idx]<0){
                    ans.add(Math.abs(arr[i]));
                }
                else{
                    arr[idx]= -arr[idx];
                }
            }
            return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,1,4,5,6};
        ArrayList<Integer> res= findduplicates(arr);
        for(int num : res){
            System.out.print(num+" ");
        }
    }
}