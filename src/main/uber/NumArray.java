package uber;

/**
 * Created by ericli on 10/5/17.
 */
public class NumArray {
    SegTreeNode root;
    public NumArray(int[] nums) {
        root = buildTree(nums, 0, nums.length-1);
    }

    public void update(int i, int val) {
        updateUtil(root, i, val);
    }

    public int sumRange(int i, int j) {
        return queryUtil(root, i, j);
    }

    private SegTreeNode buildTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else if (start == end) {
            return new SegTreeNode(nums[start], start, end, null, null);
        } else {
            int mid = (start + end)/2;
            SegTreeNode left = buildTree(nums, start, mid);
            SegTreeNode right = buildTree(nums, mid+1, end);
            int val = 0;
            if (left != null) {
                val += left.val;
            }
            if (right != null) {
                val += right.val;
            }
            return new SegTreeNode(val, start, end, left, right);
        }
    }

    private int queryUtil(SegTreeNode root, int i, int j) {
        int mid = (root.start + root.end)/2;
        if (i == root.start && j == root.end) {
            return root.val;
        }
        if (i > mid) {
            return queryUtil(root.right, i, j);
        }
        if (j <= mid) {
            return queryUtil(root.left, i, j);
        }
        return queryUtil(root.left, i, mid) + queryUtil(root.right, mid+1, j);
    }

    private void updateUtil(SegTreeNode root, int i, int val) {
        if (root.start == root.end && root.start == i) {
            root.val = val;
            return;
        } else {
            int mid = (root.start + root.end)/2;
            if (i<=mid) {
                updateUtil(root.left, i, val);
            } else {
                updateUtil(root.right, i, val);
            }
            int newVal = 0;
            if (root.left != null) {
                newVal += root.left.val;
            }
            if (root.right != null) {
                newVal += root.right.val;
            }
            root.val = newVal;
        }
    }

    public class SegTreeNode {
        int val;
        SegTreeNode left, right;
        int start, end;

        public SegTreeNode(int val, int start, int end, SegTreeNode left, SegTreeNode right) {
            this.val = val;
            this.start = start;
            this.end = end;
            this.left = left;
            this.right = right;
        }
    }
}
