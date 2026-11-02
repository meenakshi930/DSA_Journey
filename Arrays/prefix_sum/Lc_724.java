package prefix_sum;

public class Lc_724 {
	public static void main(String[] args) {
		int[] nums= {1,7,3,6,5,6};
		
		int total=0;
		
		
		for(int num:nums) {
			total+=num;
		}
		int leftsum=0;
		for(int i=0;i<nums.length;i++) {
			int rightsum=total-leftsum-nums[i];
			if(leftsum==rightsum) {
				System.out.print(i);
				return;
			}
			leftsum+=nums[i];
		}
		System.out.println(-1);
	}

}
