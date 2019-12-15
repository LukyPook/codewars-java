public class MaximumSubArraySum {
	public static int sequence(int[] nums) {
		if(nums.length == 0) return 0;
		if(nums.length == 1) {
			return nums[0];
		}
		int prevSum = nums[0];
		int max = nums[0];
		for(int i = 1; i < nums.length; i++) {

			prevSum = nums[i] + (prevSum <= 0 ? 0 : prevSum);
			max = prevSum > max ? prevSum : max;
		}
		if(max < 0) return 0;
		return max;
	}
}