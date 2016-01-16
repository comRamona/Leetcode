/**
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets
in the array which gives the sum of zero.
n^2 complexity
*/

public class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<=n-3;i++){
            if(i>0&&nums[i]==nums[i-1]) continue; //avoid duplicates
            if(nums[i]>0) break;
            int a=nums[i];
            int start=i+1;
            int end=n-1;
            while(start<end){
                int b=nums[start];
                int c=nums[end];
                if(a+b+c==0) {
                    List<Integer> li=new ArrayList<Integer>();
                    li.add(a); li.add(b); li.add(c);
                    list.add(li);
                    start++;
                    end--;
                    while (start < end && nums[end] == nums[end + 1])  //avoid duplicates
                        end--;
 
		    while (start < end && nums[start] == nums[start - 1])
		        start++;
                }
                else if(a+b+c>0) {
                    end--;
                
                }
                else {
                    start++;
                }
            }
        }
        return list;
    }
}
