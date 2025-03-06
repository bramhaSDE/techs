import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,8,4,6,9};
        int k=1;

        int element = findKthSmallest(a,k);
        System.out.println(element);
    }

    public static int findKthSmallest(int[] a, int k){
        int element=0;
      // create a priorityQueue with reverse order
        PriorityQueue<Integer> maxHeap =  new PriorityQueue<>(Collections.reverseOrder());

//        iterate till k element and add it to Queue
        for(int i = 0;i<k;i++){
            maxHeap.add(a[i]);
        }

//        iterrate
        for(int i=k;i<a.length;i++){
            if(a[i]<maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(a[i]);
            }
        }


        return maxHeap.peek();
    }
}
