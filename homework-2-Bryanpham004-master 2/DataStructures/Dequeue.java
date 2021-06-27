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
    	size++;
    }

    public void addLast(int value) {
        // YOUR CODE HERE
    	Link ptr = sentHead;
    	while (ptr.next != sentTail)
    		ptr = ptr.next;
    	ptr.next = new Link(value, ptr.next);
    	size++;
    }

    public int removeFirst() {
        // YOUR CODE HERE
    	if (isEmpty())
    		return -1;// throw new RuntimeException();
    	
    	int temp = sentHead.next.value;
    	sentHead.next = sentHead.next.next;
    	return temp;
    }

    public int removeLast() {
        // YOUR CODE HERE
    	if (isEmpty())
    		return -1;// throw new RuntimeException();
    	
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
    
    /*
    public String toString() {
    	String res = "SentHead -> ";
    	Link ptr = sentHead.next;
    	while (ptr != sentTail) {
    		res += ptr.value + " -> ";
    		ptr = ptr.next;
    	}
    	res += "SentTail -> ";
    	return res;
    }
    
    public static void main(String[] args) {
    	Dequeue q = new Dequeue();
    	System.out.println(q);
    	q.addFirst(10);
    	System.out.println(q);
    	q.addLast(20);
    	System.out.println(q);
    	q.removeLast();
    	System.out.println(q);
    	System.out.println(q.get(1));
    }*/

}