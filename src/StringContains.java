/**
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

public class StringContains{
    public int strStr(String haystack, String needle) {
    if(needle.equals("")) return 0;
    int L = needle.length();
    for(int i=0; i<=haystack.length()-L; i++) 
        if(haystack.substring(i,i+L).equals(needle)) return i;
    return -1; // if index not found, return -1
}
    public int strStr2(String haystack, String needle) {
        if(needle==null) return -1;
        if(needle.equals("")) return 0;
        if(haystack.length()<needle.length()) return -1;
        int occ=-1;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                boolean found=true;
                if(i+needle.length()>haystack.length()) continue;
                for(int j=1;j<needle.length();j++){
                   if(haystack.charAt(i+j)!=needle.charAt(j)){
                       found=false;
                       break;
                   }
                }
                if(found) return i;
            }
        }
        return occ;
    }
}
