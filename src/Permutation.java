package sh.ebx.article.optimalmessage;

import java.util.Arrays;

/**
 * Created by Rama on 10/08/2016.
 */
public class Permutation {
  int n;
  int[] array;
  boolean[] used;
  int[] res;
  public Permutation(int[] array){
    this.n=array.length;
    this.array=array;
    res=new int[n];
    used=new boolean[array.length];
  }
  public void backTrack(int pos){
    if(pos==n) {
      System.out.println(Arrays.toString(res));
    }
    else
    {
      for(int j=0;j<n;j++){
        if(used[j]) continue;
        else{
          used[j]=true;
          res[pos]=array[j];
          backTrack(pos+1);
          used[j]=false;
        }
      }
    }
  }
  public void permute(){
    backTrack(0);
  }

  public static void main(String[] args) {
    Permutation permutation=new Permutation(new int[] {2, 6, 1});
    permutation.permute();
  }
}
