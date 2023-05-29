package chapterSixteen;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(3);
        queue.offer(40);
        queue.offer(10);
        queue.offer(15);

        queue.poll();

        System.out.println(queue);

    }
}
