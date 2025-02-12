package QueueInterface.ReverseQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static <T> void reverseQueue(Queue<T> queue){
        if(queue.isEmpty()) {
            return;
        }
        T front = queue.poll();
        reverseQueue(queue);
        queue.offer(front);
    }

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Original Queue : " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue : " + queue);
    }
}
