package de.bierma;

/**
 * Node
 *
 * @version 1.0 - 12.11.2024
 */
public class Node<T> {
    /** Der Schlüssel der gespeichert werden soll*/
    T key;
    /** Referenz auf das nächste Element */
    Node<T> next;
    /** Referenz auf das vorherige Element */
    Node<T> prev;

    // Konstruktoren
    public Node(T value, Node<T> next, Node<T> prev) {
        this.key = value;
        this.next = next;
        this.prev = prev;
    }
    public Node(T value) {this(value, null, null);}

    public Node(){this(null, null, null);}

    // Getter und Setter

    public Node<T> getNext() {return next;}

    public void setNext(Node<T> next) {this.next = next;}

    public T getKey() {return key;}

    public void setKey(T key) {this.key = key;}

    public Node<T> getPrev() {return prev;}

    public void setPrev(Node<T> prev) {this.prev = prev;}
    /**
     * Gibt das Element als String zurück
     * @return das Element als String
     */
    @Override
    public String toString() {
        return key.toString();
    }
}
