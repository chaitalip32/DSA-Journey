class numberPalindrome {
    public static boolean isPalindrome(int num){
        int rev=0;
        int rem=0;
        int temp=num;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        
        if(rev==num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        int n=1221;
        if(isPalindrome(n)){
            System.out.println(n+ " is a palindrome");
        }else{
            System.out.println(n+ " is not a palindrome");
        }
    }
}