package oops;

public class printMaxToTheArray {
	public int[] maxEnd3(int[] nums) {
		  if(nums[0] > nums[1] > && nums[0] > nums[2])
		  {
		    nums[1] = nums[0];
		    nums[2] = nums[0];
		  }
		  else if(nums[1] > nums[0] && nums[1] > nums[2])
		  {
		    nums[0]= nums[1];
		    nums[2]= nums[1];
		    
		  }
		  else{
		    nums[0] = nums[2];
		    nums[1] = nums[2];
		  }
		  
		  return nums;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
