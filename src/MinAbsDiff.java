/**
Given a list A={a0,a1,…,aN−1} of unsorted integers, find and print the pair (or pairs) of elements having 
the minimum absolute difference.
*/

import java.io.*;
import java.util.*;

public class MinAbsDiff {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            int val=Math.abs(a[i]-a[i+1]);
            if(val<=min){
                if(val<min) list.clear();
                list.add(a[i]);
                list.add(a[i+1]);
                min=val;
            }
        }
        for(Integer i:list)
            System.out.print(i+" ");
    }
}
