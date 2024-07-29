/**
 * Represents a node in a doubly linked list.
 *
 * @author Ting Zhang
 */
public class DoubleNode <T>{
    private DoubleNode<T> next;
    private DoubleNode<T> prev;
    private T element;

    /**
     * Creates a node storing the specified element.
     * @param elem element to be stored
     */
    public DoubleNode(T elem)
    {
        next = null;
        prev = null;
        element = elem;
    }

    /**
     * Returns the node that follows this one.
     * @return reference to next node
     */
    public DoubleNode<T> getNext()
    {
        return next;
    }

    /**
     * Sets the node that follows this one.
     * @param node node to follow this one
     */
    public void setNext(DoubleNode<T> node)
    {
        next = node;
    }

    /**
     * Returns the node that before this one.
     * @return reference to previous node
     */
    public DoubleNode<T> getPrev()
    {
        return prev;
    }

    /**
     * Sets the node that before this one.
     * @param node node to before this one
     */
    public void setPrev(DoubleNode<T> node)
    {
        prev = node;
    }

    /**
     * Returns the element stored in this node.
     * @return element stored at the node
     */
    public T getElement()
    {
        return element;
    }

    /**
     * Sets the element stored in this node.
     * @param elem element to be stored at this node
     */
    public void setElement(T elem)
    {
        element = elem;
    }

}
