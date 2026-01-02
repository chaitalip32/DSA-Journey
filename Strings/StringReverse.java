class StringReverse {
    public static void main(String[] args) {
        String s="Hello";
        String r="";
        
        for(int i = 0; i < s.length(); i++){
            r= s.charAt(i) + r;
        }
        System.out.println(r);
    }
}