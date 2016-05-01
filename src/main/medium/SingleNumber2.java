package medium;

public class SingleNumber2 {
    public static int singleNumber(int[] nums) {
        int ones=0;
        int twos=0;
        for (int item: nums) {
        	ones = ones^item & ~twos;
        	twos = twos^item & ~ones;
        }
        return ones;
    }
}
