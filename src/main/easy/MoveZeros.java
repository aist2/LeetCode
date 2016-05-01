package easy;


public class MoveZeros {
	public void moveZeroesV1(int[] nums) {
		int countZero = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				countZero++;
			}
		}
		if (countZero == 0) return;
		
		int idxLastNonZero = nums.length - countZero - 1;
		
		int pointer = 0;
		for (int i = 0; i <= idxLastNonZero; i++) {
			for (int j = pointer; j < nums.length; j++) {
				if (nums[j] != 0) {
					nums[i] = nums[j];
					pointer = j+1;
					break;
				}
			}
		}
		
		for (int i = idxLastNonZero + 1; i < nums.length; i++){
			nums[i] = 0;
		}
		return;
	}
	
	public void moveZerosV2(int[] nums){
		int pFast = 0;
		int pSlow = 0;
		
		for (;pFast < nums.length;pFast++) {
			if (nums[pFast] != 0) {
				nums[pSlow] = nums[pFast];
				pSlow++;
			}
		}
		
		for (;pSlow < nums.length;pSlow++) {
			nums[pSlow] = 0;
		}
	}
}
