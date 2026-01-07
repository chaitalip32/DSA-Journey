import java.util.*;
class StringRemoveDuplicates {
    public static String removeDuplicate(String s)
    {
        HashSet<Character> exists=new HashSet<>();
        StringBuilder ans=new StringBuilder();
        
        for(char c: s.toCharArray()){
            
            if(!exists.contains(c)){
                ans.append(c);
                exists.add(c);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str="HelloEveryone";
        System.out.print("String after removal of duplicates: "+removeDuplicate(str));
    }
}