package medium;
import java.util.LinkedList;
import java.util.List;


public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
    	List<String> resList = new LinkedList<>();
    	if (n < 1) return resList;
    	StringBuilder builder = new StringBuilder();
    	helper(resList, builder, n, 0);
        return resList;
    }
    
    private static void helper(List<String> resList, StringBuilder builder, int left, int right) {
    	if (left==0 && right==0) {
    		resList.add(builder.toString());
    		return;
    	}
    		
    	if (left > 0) {
    		builder.append("(");
    		helper(resList, builder, left-1, right+1);
    		builder.deleteCharAt(builder.length()-1);
    	}
    	if (right > 0) {
    		builder.append(")");
    		helper(resList, builder, left, right-1);
    		builder.deleteCharAt(builder.length()-1);
    	}
    }
}
