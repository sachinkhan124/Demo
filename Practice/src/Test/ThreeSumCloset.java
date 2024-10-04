package Test;

import java.util.Arrays;

public class ThreeSumCloset {

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closetSum = nums[0] + nums[1] + nums[2];

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int currentSum = nums[i] + nums[left] + nums[right];
				if (Math.abs(currentSum - target) < Math.abs(closetSum - target)) {
					closetSum = currentSum;
				}
				if (currentSum == target) {
					return currentSum;
				} else if (currentSum < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		return closetSum;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		int result = threeSumClosest(nums, target);
		System.out.println("The sum closest to the target is: " + result);
	}
}
