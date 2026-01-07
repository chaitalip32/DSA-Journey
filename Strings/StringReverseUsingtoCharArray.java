class StringReverse {
    public static void main(String[] args) {
        String str="Hello";
        String r="";
        
        // Approach 1
        for(int i = 0; i < str.length(); i++){
            r= str.charAt(i) + r;
        }
        System.out.print(r);


        System.out.println("\n________________Using length ___________________");
        // Approach 2
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

        System.out.println("\n_______________Using array____________________");
        //Approach 3
        char[] charArr=str.toCharArray();
        
        for(int i=charArr.length-1;i>=0;i--){
            System.out.print(charArr[i]);
        }

        System.out.println("\n_________________StringBuilder__________________");
        //Approach 4
        StringBuilder sb=new StringBuilder(str);
        System.out.print(sb.reverse());
    }
}