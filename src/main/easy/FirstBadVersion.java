package easy;

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
    	if (isBadVersion(1)) return 1;
    	int maxGood = 1;
    	int minBad = n;
    	int currVer;
    	while (minBad - maxGood > 1){
    		currVer = (minBad - maxGood)/2+maxGood;
	    	if (isBadVersion(currVer)) {
	    		minBad = currVer;
	    	} else {
	    		maxGood = currVer;
	    	}
    	}
        return minBad;
    }
}