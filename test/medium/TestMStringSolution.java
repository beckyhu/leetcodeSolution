package medium;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

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
	@Test
	public void testLongestCommon() {
		String s1 = "";
		String s2 = "";
		String longestCommon = mStringSolution.longestCommon(s1, s2);
		assertEquals("", longestCommon);
		s1 = "abcdefg";
		s2 = "cdefb";
		longestCommon = mStringSolution.longestCommon(s1, s2);
		assertEquals("cdef", longestCommon);
	}
	@Test
	public void testLongestPalindrome() {
		String s = "babad";
		Set<String> accepts = new HashSet<>();
		accepts.add("aba");
		accepts.add("bab");
		assertTrue(accepts.contains(mStringSolution.longestPalindrome(s)));
		s = "abceddfcba";
		assertEquals("dd", mStringSolution.longestPalindrome(s));
		s = "abcdcba";
		assertEquals("abcdcba", mStringSolution.longestPalindrome(s));
		s = "cbbd";
		assertEquals("bb",mStringSolution.longestPalindrome(s));
	}
}
