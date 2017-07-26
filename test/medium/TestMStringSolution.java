package medium;

import static org.junit.Assert.*;

import org.junit.Test;

import medium.MStringSolution;

public class TestMStringSolution {
	private MStringSolution mStringSolution = new MStringSolution();
	@Test
	public void testLengthOfLongestSubstring() {
		String s = "abcabcbb";
		int length = mStringSolution.lengthOfLongestSubstring(s);
		assertEquals(3, length);
		
		s = "bbbb";
		length = mStringSolution.lengthOfLongestSubstring(s);
		assertEquals(1, length);
		
		s = "pwwkew";
		length = mStringSolution.lengthOfLongestSubstring(s);
		assertEquals(3, length);
	}

}
