package easy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestNumberSolution {
	private NumberSolution numberSolution;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		numberSolution = new NumberSolution();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testmoveZeroes() {
		int[] nums = new int[] {0, 1, 0, 3, 12};
		numberSolution.moveZeroes(nums);
		Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
		nums = new int[] {1, 0, 2, 0, 0, 11};
		numberSolution.moveZeroes(nums);
		Assert.assertArrayEquals(new int[]{1, 2, 11, 0, 0, 0}, nums);
		nums = new int[] {0};
		numberSolution.moveZeroes(nums);
		Assert.assertArrayEquals(new int[]{0}, nums);
	}
	
	@Test
	public void testintersection() {
		int[] nums1 = new int[] {1, 2, 2, 1};
		int[] nums2 = new int[] {2, 2};
		int[] result = numberSolution.intersection(nums1, nums2);
		Assert.assertArrayEquals(new int[] {2}, result);
		
		nums1 = new int[] {};
		nums2 = new int[] {1};
		result = numberSolution.intersection(nums1, nums2);
		Assert.assertArrayEquals(new int[] {}, result);
	}

}
