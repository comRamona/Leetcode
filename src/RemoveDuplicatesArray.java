/*
Given a sorted array, remove the duplicates in place such that each element appear only once 
and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
For example,
Given input array nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
It doesn't matter what you leave beyond the new length.
*/
public class RemoveDuplicatesArray {
public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int i = 0; // last processed item
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
}
public int removeDuplicates2(int[] A) {
	if (A.length < 2)
		return A.length;
 
	int j = 0;
	int i = 1;
 
	while (i < A.length) {
		if (A[i] == A[j]) {
			i++;
		} else {
			j++;
			A[j] = A[i];
			i++;
		}
	}
 
	return j + 1;
}
    public int removeDuplicatesInefficient(int[] nums) {
     int len=1;
     if(nums==null) return 0;
     if(nums.length==0) return 0;
     if(nums.length==1) return 1;
     
     for(int i=0;i<nums.length;i++){
       
         int pos=i;
         int nr=0;
         while(i+1<nums.length&&nums[i+1]<=nums[pos]){
             i++;
             nr++;
             
         }
         for(int j=1;j<=nr;j++){
             if(pos+j+nr>=nums.length){ 
                break;
             }
             nums[pos+j]=nums[pos+j+nr];
         }
         i=pos;
     }
      for(int i=1;i<nums.length;i++){
        
           if(nums[i]<=nums[i-1]) return len;
           len++;
         
      }
     return len;
    }
}
