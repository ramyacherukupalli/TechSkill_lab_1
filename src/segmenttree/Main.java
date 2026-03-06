package segmenttree;

public class Main {
    public static void main(String[] args) {

        int[] prices = {2, 1, 5, 3, 4};

        SegmentTree st = new SegmentTree(prices);

        System.out.println("Max in range 1-3: " + st.queryMax(1, 3));

        st.update(2, 10);

        System.out.println("After update:");
        System.out.println("Max in range 1-3: " + st.queryMax(1, 3));
    }
}