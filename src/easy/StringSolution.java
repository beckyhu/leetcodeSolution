package easy;

public class StringSolution {
	public String reverseString(String s) {
        if(s == null){
        	return s;
        }
        char[] cArr = s.toCharArray();
        System.out.println(String.valueOf(cArr));
        int cArrLength = cArr.length;
        char temp;
        for(int i = 0; i < cArrLength / 2; i++) {
        	temp = cArr[i];
        	cArr[i] = cArr[cArrLength -1 - i];
        	cArr[cArrLength - 1 - i] = temp;
        }
        return String.valueOf(cArr);
    }
	
}
