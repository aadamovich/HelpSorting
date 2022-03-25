package collectionExamples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> numbers = new LinkedList<Integer>();

        // Adding elements
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);

        System.out.println("Queue: " + numbers);
        System.out.println(numbers.peek()); // find first element but leave it in place

        System.out.println(numbers.poll()); // find and remove first element
        System.out.println("Queue: " + numbers);
        System.out.println(numbers.peek());




    }
}
