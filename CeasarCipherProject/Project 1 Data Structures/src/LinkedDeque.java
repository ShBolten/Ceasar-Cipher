public class LinkedDeque<T extends Comparable<T>> implements DequeADT<T> {
	private DoubleNode<T> front; 
	private DoubleNode<T> rear;
	private int count;

public LinkedDeque() {
	front = null;
	rear = null;
	count = 0;
}


public void addFirst(T element) {
	DoubleNode<T> newNode = new DoubleNode<T>(element);
	 if(isEmpty()) {
		 front = newNode;
		 rear = newNode;
	 }
	 else {
		 newNode.setNext(front);
		 front = newNode;
		 newNode = null;
	 }
	 count++;
}

public void addLast(T element) {
	DoubleNode<T> newNode = new DoubleNode<T>(element);
	 if(isEmpty()) {
		 front = newNode;
		 rear = newNode;
	 }
	 else {
		 rear.setNext(newNode);
		 rear = newNode;
	 newNode = null;
	 }
	 count++;
}

public T removeFirst() {
	if (isEmpty())
		 throw new EmptyCollectionException("LinkedList");
		T result = front.getElement();
		front = front.getNext();
		count--;
		return result;
}

public T removeLast() {
	if (isEmpty())
		 throw new EmptyCollectionException("LinkedList");
		T result = rear.getElement();
		DoubleNode<T> current = front;
		while(current.getNext() != rear || current.getNext() != null)
		current = current.getNext();
		current.setNext(null);
		rear = current;
		count--;
		return result;
}

public T peekFirst() {
	if (isEmpty())
        throw new EmptyCollectionException("LinkedDeque");
	return front.getElement();
}

public T peekLast() {
	if (isEmpty())
        throw new EmptyCollectionException("dequeue");
	return rear.getElement();
}

public boolean isEmpty() {
	if (count == 0)
		return true;
	else
		return false;
}

public int size() {
	return count;
}

public String toString() {
	DoubleNode<T> temp = front; 
    StringBuilder builder = new StringBuilder(); // This was found via stack overflow 
    while (temp != null) {
        builder.append(temp.getElement() + "");
        temp = temp.getNext();
    }
    return builder.toString();
}

}
