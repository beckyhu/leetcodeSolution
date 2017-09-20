package hard;

public class HStringSolution {
	/**
	 * 76. Minimum Window Substring
	 * @param s
	 * @param t
	 * @return
	 */
	public String minWindow(String s, String t) {
        int[] cache = new int[256];
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        for (char c : tt) cache[c]++;
        int l = 0, r = 0, cnt = tt.length;
        int len = Integer.MAX_VALUE, head = 0;
        
        while (r < ss.length) {
            if (cache[ss[r]] > 0) {
                cnt--;
            }
            cache[ss[r]]--;
            r++;
            while (cnt == 0) {
                if (r - l < len) {
                    len = r - l;
                    head = l;
                }
                if (cache[ss[l]] == 0) {
                    cnt++;
                }
                cache[ss[l]]++;
                l++;
            }
            
        }
        return len == Integer.MAX_VALUE? "" : s.substring(head, head + len);
    }
}
