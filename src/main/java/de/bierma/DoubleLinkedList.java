package de.bierma;

/**
 * DoublyLinkedList
 *
 * @version 1.0 - 12.11.2024
 */
public class DoubleLinkedList<T>  {
    /** Referenz auf das erste Node der Liste */
    private Node<T> head;
    /** Referenz auf das letzte Node der Liste */
    private Node<T> tail;

    // Konstruktoren
    public DoubleLinkedList(Node<T> head, Node<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public DoubleLinkedList() {this(null, null);}

    // Getter und Setter
    public Node<T> getHead() {return head;}

    public void setHead(Node<T> head) {this.head = head;}

    public Node<T> getTail() {return tail;}

    public void setTail(Node<T> tail) {this.tail = tail;}

    /**
     * Gibt die Liste als String zurück
     * @return die Liste als String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> x = head;
        while (x != null) {
            sb.append(x);
            sb.append(" ");
            x = x.getNext();
        }
        return sb.toString();
    }
}
