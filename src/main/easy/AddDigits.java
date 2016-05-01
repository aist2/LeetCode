package easy;

public class AddDigits {
    public static int addDigits(int num) {
        return addDigits2(num);
    }
    
    public static int addDigits1(int num) {
    	int res=0;
    	int count=0;
    	do {
    		count=0;
    		while (num!=0){
    			res += num%10;
    			num /= 10;
    			count++;
    		}
    		num = res;
    		res = 0;
    	} while (count > 1);
        return num;
    }
    
    public static int addDigits2(int num) {
        return 1 + (num-1)%9;
    }
}
