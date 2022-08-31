package DS.Bit_DS.Queue;

public class LinkdedQueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedQueue<>();
        queue.offer(1);
        queue.offer(3);
        queue.offer(5);
        queue.offer(7);
        queue.offer(9);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
    }
}
