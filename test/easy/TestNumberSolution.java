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
	@Test
	public void testReverse() {
		assertEquals(0, numberSolution.reverse(0));
		assertEquals(-12, numberSolution.reverse(-21));
		assertEquals(123, numberSolution.reverse(321));
		assertEquals(0, numberSolution.reverse(1000000009));
	}
	@Test
	public void testMyAtoi() {
		assertEquals(-2147483648, numberSolution.myAtoi("      -11919730356x"));
		assertEquals(0, numberSolution.myAtoi("\"\""));
		assertEquals(12345, numberSolution.myAtoi("12345"));
		assertEquals(Integer.MAX_VALUE, numberSolution.myAtoi("99999999999999999"));
		assertEquals(-123, numberSolution.myAtoi("-123"));
		assertEquals(123, numberSolution.myAtoi("+123"));
		assertEquals(0, numberSolution.myAtoi(""));
		assertEquals(10, numberSolution.myAtoi("   010"));
		assertEquals(-2147483648, numberSolution.myAtoi("-2147483649"));
		
	}
}
