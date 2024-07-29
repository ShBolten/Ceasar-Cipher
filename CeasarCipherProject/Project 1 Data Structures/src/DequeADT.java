/**
 * DequeADT.java
 * @author Ting Zhang
 *
 * Defines the interface to a deque collection.
 */
public interface DequeADT<T extends Comparable<T>> {
    /**  Adds one element to the front of this deque. */
    public void addFirst (T element);

    /**  Adds one element to the rear of this deque. */
    public void addLast (T element);

    /**  Removes and returns the element at the front of this deque. */
    public T removeFirst();

    /**  Removes and returns the element at the rear of this deque. */
    public T removeLast();

    /**  Returns without removing the element at the front of this deque. */
    public T peekFirst();

    /**  Returns without removing the element at the rear of this deque. */
    public T peekLast();

    /**  Returns true if this deque contains no elements. */
    public boolean isEmpty();

    /**  Returns the number of elements in this deque. */
    public int size();

    /**  Returns a string representation of this deque. */
    public String toString();
}
