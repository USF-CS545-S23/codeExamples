package queues;

import stacks.ArrayStack;
import stacks.Stack;

/** The class that implements the functionality of the queue with
 * two stacks.
 */
public class QueueWithTwoStacks {
    private Stack s1 = new ArrayStack();
    private Stack s2 = new ArrayStack();
    // You may NOT use any other memory, no array and no linked list,
    // only the two stacks, s1, s2. You may call methods push, pop, empty() on s1, s2

    /** Adds an element to the queue
     * @param elem  Element to add to the queue
     */
    public void enqueue(int elem) {
        //  FILL IN CODE

    }

    /**
     * Removes the element from the queue
     * @return the element in front of the queue that was removed
     */
    public Object dequeue() {
        //  FILL IN CODE

        return 0; // change
    }

    /**
     * Check if the queue is empty
     * @return True if the queue is empty, and false otherwise.
     */
    public boolean isEmpty() {
        //  FILL IN CODE

        return false; //change
    }
}
