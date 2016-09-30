package easy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
}
