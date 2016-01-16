/**Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.
*/

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] ar=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int pos;
            if(c>='a'&&c<='z') 
                pos=c-'a';
            else
                pos=c-'A';
            ar[pos]++;
        }
         for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            int pos;
            if(c>='a'&&c<='z') 
                pos=c-'a';
            else
                pos=c-'A';
            ar[pos]--;
        }
        for(int i=0;i<26;i++)
        if(ar[i]!=0) return false;
        return true;
    }
}
