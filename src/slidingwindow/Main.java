package slidingwindow;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        System.out.println(StreamingMax.maxSlidingWindow(nums, k));
    }
}