package queues;

public class QueueWithTwoStacksTester {
    public static void main(String[] args) {
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(10);
        System.out.println("Dequeued:" + queue.dequeue()); // should print 1
        System.out.println("Dequeued:" + queue.dequeue()); // should print 2
        queue.enqueue(11);
        System.out.println("Dequeued:" + queue.dequeue()); // should print 4
        System.out.println("Dequeued:" + queue.dequeue()); // should print 10
        System.out.println("Dequeued:" + queue.dequeue()); // should print 11
        System.out.println("Is empty? " + queue.isEmpty()); // true
    }
}
