package DataStructures;

public class Dequeue {
    /* A Linked List based implementation of Dequeue (Double Ended Queue)
    *
    * A Dequeue is just like a normal Queue, except you can push
    * and pop from both the front and the back.
    *
    * Please use the Link.java class provided for you.
    *
    * */

    /* HINT: You should use 2 sentinel nodes to mark the start and end of the queue
        similar to our sentinel node trick in HW 1.
     */
    private Link sentHead;
    private Link sentTail;
    private int size;

    public Dequeue() {
        // YOUR CODE HERE
    	size = 0;
    	sentHead = new Link(0);
    	sentTail = new Link(0);
    	sentHead.next = sentTail;
    }

    public void addFirst(int value) {
        // YOUR CODE HERE
    	sentHead.next = new Link(value, sentHead.next);
    }

    public void addLast(int value) {
        // YOUR CODE HERE
    	Link ptr = sentHead;
    	while (ptr.next != sentTail)
    		ptr = ptr.next;
    	ptr.next = new Link(value, ptr.next);
    }

    public int removeFirst() {
        // YOUR CODE HERE
    	if (size == 0)
    		throw new RuntimeException();
    	
    	return sentHead.next.value;
    }

    public int removeLast() {
        // YOUR CODE HERE
    	if (size == 0)
    		throw new RuntimeException();
    	
    	Link ptr = sentHead;
    	while (ptr.next.next != sentTail)
    		ptr = ptr.next;
    	
    	int temp = ptr.next.value;
    	ptr.next = ptr.next.next;
    	return temp;
    }

    public boolean isEmpty() {
        // YOUR CODE HERE
    	return size == 0;
    }

    public int getSize() {
        // YOUR CODE HERE
    	return size;
    }

    public int get(int index) {
        // YOUR CODE HERE
    	if (index < 0 || index >= size)
    		throw new IllegalArgumentException();
    	
    	Link ptr = sentHead.next;
    	for (int i = 0; i < index; i++)
    		ptr = ptr.next;
    	return ptr.value;
    }

}