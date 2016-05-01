package easy;
import java.util.HashMap;
import java.util.Map;


public class ReverseBits {
    // you need treat n as an unsigned value
	private static Map<Byte,Byte> cache = new HashMap<Byte,Byte>();
	
	public static int reverseBits(int n) {
		return reverseBits3(n);
	}
    public static int reverseBits1(int n) {
    	int res = 0;
    	for (int i = 0; i<32; i++){
    		if (n%2==1)
    			res += Math.pow(2, 31-i);
    		n /= 2;
    	}
    	return res;
        
    }
    
    public static int reverseBits2(int n) {
	    int res = 0;
	    for (int i=0; i< 32; i++){
	    	res = res << 1 | n & 1;
	    	n >>>= 1;
	    }
	    return res;
    }
    
    
    public static int reverseBits3(int n) {
	    int res=0;
	    for (int i=0; i<4;i++) {
	    	byte tmpByte = (byte)(n&0xFF);
	    	byte reverseByte = reverseByte(tmpByte);
	    	res = res<<8| (reverseByte&0xFF);
	    	n>>>=8;
	    }
	    return res;
    }
    
    private static byte reverseByte(byte b) {
    	if (cache.containsKey(b)) return cache.get(b);
    	byte res=0;
    	byte tmpB = b;
    	for (int i=0; i<8; i++) {
    		res = (byte) (res<<1|tmpB&1);
    		tmpB>>>=1;
    	}
    	cache.put(b, res);
    	return res;
    }
}
