package easy;


public class PlusOne {
	public static int[] plusOne(int[] digits) {
        return plusOne1(digits);
    }
	
	public static int[] plusOne1(int[] digits) {
		boolean carryForward = true;
		int i = digits.length - 1;
		while (carryForward == true && i>=0) {
			if (digits[i] == 9) {
				digits[i]=0;
				carryForward = true;
			}
			else {
				digits[i] += 1;
				carryForward = false;
			}
			i--;
		}
		if (carryForward == true && i < 0){
			int[] res = new int[digits.length+1];
			res[0] = 1;
			return res;
		}
        return digits;
    }
}
