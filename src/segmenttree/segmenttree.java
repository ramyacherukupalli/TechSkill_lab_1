package segmenttree;

public class SegmentTree {

    private int[] tree;
    private int n;

    public SegmentTree(int[] nums) {
        n = nums.length;
        tree = new int[4 * n];
        build(nums, 0, 0, n - 1);
    }

    private void build(int[] nums, int node, int start, int end) {
        if (start == end) {
            tree[node] = nums[start];
        } else {
            int mid = (start + end) / 2;
            build(nums, 2 * node + 1, start, mid);
            build(nums, 2 * node + 2, mid + 1, end);
            tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
        }
    }

    public void update(int index, int value) {
        updateHelper(0, 0, n - 1, index, value);
    }

    private void updateHelper(int node, int start, int end, int index, int value) {
        if (start == end) {
            tree[node] = value;
        } else {
            int mid = (start + end) / 2;
            if (index <= mid) {
                updateHelper(2 * node + 1, start, mid, index, value);
            } else {
                updateHelper(2 * node + 2, mid + 1, end, index, value);
            }
            tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
        }
    }

    public int queryMax(int left, int right) {
        return queryHelper(0, 0, n - 1, left, right);
    }

    private int queryHelper(int node, int start, int end, int left, int right) {

        if (right < start || left > end) {
            return Integer.MIN_VALUE;
        }

        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        int leftMax = queryHelper(2 * node + 1, start, mid, left, right);
        int rightMax = queryHelper(2 * node + 2, mid + 1, end, left, right);

        return Math.max(leftMax, rightMax);
    }
}