class StringReverse {
    public static void main(String[] args) {
        String str="Hello";
        String r="";
        
        // Approach 1
        for(int i = 0; i < str.length(); i++){
            r= str.charAt(i) + r;
        }
        System.out.println(r);


        System.out.println("___________________________________");
        // Approach 2
        for(int i=str.length-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

        System.out.println("___________________________________");
        //Approach 3
        char[] charArr=str.toCharArray();
        
        for(int i=charArr.length-1;i>=0;i--){
            System.out.print(charArr[i]);
        }

        System.out.println("___________________________________");
        //Approach 4
        StringBuilder sb=new StringBuilder();
        System.out.print(sb.reverse());
    }
}

1) Reverse a String using Java
2) Remove Duplicate Characters in String 
3) Reverse Each word in String
4) Find Each Characater occurrence in String 
5) Find First Non Repeated Character in String 
6) Replace Character with its occurrence in string 
7) Find Longest Substring without repeated characters
8) Sort String characters using Java 
9) Remove Whitespaces in String 
10) Remove Special Characters in String 
