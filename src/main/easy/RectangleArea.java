package easy;

public class RectangleArea {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	int areaA = Math.abs((C-A)*(D-B));
    	int areaB = Math.abs((G-E)*(H-F));
    	int iA=0;
    	int iB=0;
    	int iC=0;
    	int iD=0;
    	Math.max(C,G);
    	if (A <= E && E < C) {
			iA = E;
			iB = Math.min(C, G);
    	} else if (E <= A && A < G) {
    		iA = A;
			iB = Math.min(C, G);
    	}
    	
    	if (B <= F && F < D) {
			iC = F;
			iD = Math.min(H, D);
    	} else if (F <= B && B < H) {
    		iC = B;
			iD = Math.min(H, D);
    	}
    	int areaI = Math.abs((iB-iA)*(iD-iC));
        return areaA+areaB-areaI;
    }
}
