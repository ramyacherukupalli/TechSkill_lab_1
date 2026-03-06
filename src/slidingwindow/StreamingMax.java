package slidingwindow;

import java.util.*;

public class StreamingMax {

    public static List<Integer> maxSlidingWindow(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            // 1️⃣ Remove indices that are out of window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // 2️⃣ Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // 3️⃣ Add current index
            deque.offerLast(i);

            // 4️⃣ Window is ready
            if (i >= k - 1) {
                result.add(nums[deque.peekFirst()]);
            }
        }

        return result;
    }
}