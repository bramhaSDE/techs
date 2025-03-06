import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,8,4,6,9};
        int k=3;
        int element = findKthLargest(a,k);
        System.out.println(element);
    }

    private static int findKthLargest(int[] a, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : a) {
            maxHeap.add(num);
        }

        for (int i = 0; i < k-1; i++) {
            maxHeap.poll();
        }


        return maxHeap.poll();
    }

}
