package linkedLists.exercise;

/** A class representing a linked list. */
public class LinkedList {
	private Node head, tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	/** Inserts a new node to the front of the list
	 *
	 * @param elem value to insert in the linked list
	 */
	public void insertAtFront(int elem) {
		Node newNode = new Node(elem);
		// FILL IN CODE

	}

	/** Creates a new node with the given element and adds it to the back of the list
	 *
	 * @param elem new value to append to the linked list
	 */
	public void append(int elem) {
		Node newNode = new Node(elem);
		// FILL IN CODE

	}

	/** Prints all the nodes in the link list */
	public void printNodes() {
		Node current = head;
		// FILL IN CODE

	}

	/** Return true if the given element is in the list
	 *
	 * @param elem value to find
	 * @return true if found the node with this value, false otherwise
	 */
	public boolean find(int elem) {
		Node current = head;
		// FILL IN CODE

		return false;
	}

	/**
	 * Insert a given element at index i in the linked list
	 * @param index index where to insert
	 * @param elem element to insert
	 */
	public void insert(int index, int elem) {
		Node newNode = new Node(elem);
		if (head == null) { // the linked list was previously empty, the new node becomes the head and the tail
			head = newNode;
			tail = newNode;
		}
		else if (index == 0) { // inserting in front
			newNode.setNext(head);
			head =  newNode;
		}
		else { // General case: need to move prev to index - 1
			   // then insert the new node after it
			   Node prev = head;
			   // FILL IN CODE

			}
	}

	/**
	 * Remove the node after "previousNode". Return the value of the element at
	 * the deleted node
	 */
	public int remove(Node previousNode) {
		if ((previousNode == null) || (previousNode.next() == null)) {
			System.out.println("Nothing to remove");
			return Integer.MAX_VALUE;
		}
		int elem = previousNode.next().elem();

		// if removing the tail
		if (previousNode.next() == tail) {
			// FILL IN CODE

		} else { // General case: delete node
			// FILL IN CODE:

		}
		return elem;
	}

	public Node tail() {
		return tail;
	}

	/** Returns the value of the middle node
	 *
	 * @return value stored in the middle node
	 */
	public int middleElement() {
		Node slow = head;
		Node fast = head;

		// FILL IN CODE

		return -1; // change
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtFront(0);
		list.insertAtFront(9);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtFront(7);
		list.insertAtFront(1);
		list.insertAtFront(5);
		list.printNodes();

		/* LinkedList list1 = new LinkedList();
		list1.append(35);
		list1.append(40);
		list1.append(10);
		list1.printNodes();
		*/

		/*list.insert(0, 4);
		list.printNodes();
		list.insert(1, 5);
		list.printNodes();
		list.insert(3, 88);
		list.printNodes();
		list.insert(5, 100);
		list.printNodes(); */
	}
}
