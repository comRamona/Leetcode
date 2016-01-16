/**
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
*/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j&&j>=0&&i<s.length()){
    
            while(!Character.isLetterOrDigit(s.charAt(i))){ i++; if(i>=s.length()) break; }
            while(!Character.isLetterOrDigit(s.charAt(j))) { j--; if(j<0) break; }
            if(i>=j) break;
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
