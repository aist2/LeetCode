package easy;
public class ReverseInteger {
	public static int reverse(int x) {
		return reverse1(x);
	}

	public static int reverse1(int x) {
		int res = 0;
		int mod;
		while (x != 0) {
			mod = x % 10;
			if (res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && mod>Integer.MAX_VALUE%10)) return 0;
			if (res<Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10 && mod<Integer.MIN_VALUE%10)) return 0;
			res *= 10;
			res += mod;
			x /= 10;
		}
		return res;
	}
}
