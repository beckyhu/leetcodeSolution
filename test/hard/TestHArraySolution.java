package hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHArraySolution {
	private HArraySolution solution = new HArraySolution();
	@Test
	public void test() {
		int[] nums1 = new int[]{1, 3};
		int[] nums2 = new int[]{2};
		double median = solution.findMedianSortedArrays(nums1, nums2);
		assertEquals(2.0, median, 0.0);
		
		int[] nums3 = new int[]{1, 2};
		int[] nums4 = new int[]{3, 4};
		median = solution.findMedianSortedArrays(nums3, nums4);
		assertEquals(2.5, median, 0.0);
	}

}
