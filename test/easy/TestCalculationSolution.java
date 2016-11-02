package easy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculationSolution {
	private CalculationSolution calculationSolution;
	private static int[] twoSumCaseArr;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		twoSumCaseArr = new int[] {1,2,5,9,34,39,28};
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		twoSumCaseArr = null;
	}

	@Before
	public void setUp() throws Exception {
		calculationSolution = new CalculationSolution();
	}

	@After
	public void tearDown() throws Exception {
		calculationSolution = null;
	}

	@Test
	public void testTwoSumSolution1() {
		Integer[] resultArr = calculationSolution.twoSumSolution1(twoSumCaseArr, 48);
		Assert.assertArrayEquals(new Integer[]{3,5}, resultArr);
	}
	
	@Test
	public void testTwoSumSolution2() {
		Integer[] resultArr = calculationSolution.twoSumSolution2(twoSumCaseArr, 48);
		Assert.assertArrayEquals(new Integer[]{3,5}, resultArr);
	}
	
	@Test
	public void testSingleNumber() {
		int[] input = {1, 2, 3, 3, 2, 4, 1};
		int singleNumber = calculationSolution.singleNumber(input);
		Assert.assertEquals(4, singleNumber);
	}
	@Test
	public void testgetSum() {
		int a = 123, b = 976;
		int result = calculationSolution.getSum(a, b);
		Assert.assertEquals(a+b, result);
	}
}
