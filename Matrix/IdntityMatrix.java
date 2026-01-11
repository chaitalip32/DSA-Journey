class IdntityMatrix {
    public static boolean checkIdntityMatrix(int[][] mat){
        int n=mat.length;
        for(int i=0;i<n;i++){
            if(mat[i][i]!=1){
                return false;
            }
            for(int j=0;j<n;j++){
                if((i!=j) && (mat[i][j]!=0)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] mat={{1,0,},{0,1,0},{0,0,1}};
        System.out.print(checkIdntityMatrix(mat));
    }
}