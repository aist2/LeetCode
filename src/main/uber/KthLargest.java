package uber;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by ericli on 6/5/17.
 */
public class KthLargest {
    public static int findKthLargestMaxHeap(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int val: nums) {
            q.offer(val);
            if (q.size() > nums.length - k + 1) {
                q.poll();
            }
        }
        return q.peek();
    }

    public static int findKthLargestMinHeap(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(k);
        for (int val: nums) {
            if (q.size() == 0 || val > q.peek()) {
                q.offer(val);
                if (q.size() > k) {
                    q.poll();
                }
            }
        }
        return q.peek();
    }

    public static int findKthLargestQuick(int[] nums, int k) {
        quickSelect(nums, k, 0, nums.length-1);
        return nums[k-1];
    }

    private static void quickSelect(int[] nums, int k, int start, int end) {
        if (start >= end || k-1 < start || k-1 > end) {
            return;
        }
        int pivot = end;
        int left = start;
        int right = end - 1;
        while (left <= right) {
            while (left < end && nums[left] >= nums[pivot]) {
                left++;
            }
            while (right > start && nums[right] < nums[pivot]) {
                right--;
            }
            if (left >= right) {
                break;
            }
            swap(nums, left, right);
        }
        swap(nums, left, pivot);
        if (left == k-1) {
            return;
        }
        quickSelect(nums, k, start, left-1);
        quickSelect(nums, k, left+1, end);
    }

    private static void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
