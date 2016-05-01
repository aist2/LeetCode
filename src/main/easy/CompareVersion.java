package easy;

public class CompareVersion {
    public static int compareVersion(String version1, String version2) {
        return compareVersion1(version1, version2);
    }
    
    public static int compareVersion1(String version1, String version2) {
    	int ver1=0;
    	int ver2=0;
    	int pSlow1=0;
    	int pFast1=1;
    	int pSlow2=0;
    	int pFast2=1;
    	int len1=version1.length();
    	int len2=version2.length();
    	while (pFast1 <= len1 || pFast2 <= len2) {
    		ver1=0;
    		ver2=0;
    		while (pSlow1< len1 && pFast1 <= len1) {
    			if (pFast1==len1||version1.charAt(pFast1)=='.') {
    				ver1 = Integer.valueOf(version1.substring(pSlow1, pFast1));
    				pSlow1 = pFast1+1;
    				pFast1 += 2;
    				break;
    			}
    			pFast1++;
    		}
    		
    		while (pSlow2< len2 && pFast2 <= len2) {
    			if (pFast2==len2||version2.charAt(pFast2)=='.') {
    				ver2 = Integer.valueOf(version2.substring(pSlow2, pFast2));
    				pSlow2 = pFast2+1;
    				pFast2 += 2;
    				break;
    			}
    			pFast2++;
    		}
    		
    		if (ver1>ver2) 
    			return 1;
    		else if (ver1<ver2)
    			return -1;
    	}

        return 0;
    }
    
    
}
