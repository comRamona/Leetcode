public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
       return select(nums,0,nums.length-1,k-1);
    }
    public int select(int[] nums,int lo,int hi,int k){
       if(lo<hi){
          int p=partition(nums,lo,hi);
          if(k<p) return select(nums,lo,p-1,k);
          else if(k>p) return select(nums,p+1,hi,k);
          else return nums[p];
       } 
       return nums[lo];
    }
    public int partition(int[] arr,int lo,int hi){
        int p = arr[lo];
		int i = lo;
		int j = hi + 1;
		while (true) {
			while (arr[++i] > p)  //stop when we find a smaller number than p that should be put in the left side
				if (i == hi)
					break;
			while (arr[--j] < p)
				if (j == lo)
					break;
			if (i >= j)
				break;
			swap(arr, i, j);
		}
       //at this point, j is where the pivot's right place is, so swap them
		swap(arr, lo, j);
       //return pivot's position to be used by select()
		return j;
        
    }
    public void swap(int[] nums,int i,int j){
        int aux=nums[i];
        nums[i]=nums[j];
        nums[j]=aux;
    }
}
