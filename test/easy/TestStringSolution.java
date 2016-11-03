package easy;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import util.Print;

public class TestStringSolution {

	private StringSolution stringSolution;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		stringSolution = new StringSolution();
	}

	@After
	public void tearDown() throws Exception {
		stringSolution = null;
	}

	@Test
	public void testReverseString() {
		String reversedStr = stringSolution.reverseString("abcdefgh");
		Assert.assertEquals("hgfedcba", reversedStr);
	}
	@Test
	public void testZigZagConverte() {
		String input = "PAYPALISHIRING";
		String output = stringSolution.zigZagConverte(input, 3);
		Assert.assertEquals("PAHNAPLSIIGYIR", output);
		
		output = stringSolution.zigZagConverte(input, 4);
		Assert.assertEquals("PINALSIGYAHRPI", output);
		
		output = stringSolution.zigZagConverte(input, 5);
		Assert.assertEquals("PHASIYIRPLIGAN", output);
	}
	@Test
	public void testFizzBuzz() {
		int input = 20;
		List<String> result = stringSolution.fizzBuzz(input);
		Assert.assertEquals(20, result.size());
		String[] expecteds = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz",
				"11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz"};
		Assert.assertArrayEquals("FizzBuzz:", expecteds, result.toArray());
	}
}
