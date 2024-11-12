package de.bierma;

/**
 * DoublyLinkedList
 *
 * @author Jannes Bierma
 * @version 1.0 - 12.11.2024
 */
public class DoubleLinkedList<T>  {
    /** Referenz auf das erste Element der Liste */
    private Element<T> head;
    /** Referenz auf das letzte Element der Liste */
    private Element<T> tail;

    // Konstruktoren
    public DoubleLinkedList(Element<T> head, Element<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public DoubleLinkedList() {this(null, null);}

    // Getter und Setter
    public Element<T> getHead() {return head;}

    public void setHead(Element<T> head) {this.head = head;}

    public Element<T> getTail() {return tail;}

    public void setTail(Element<T> tail) {this.tail = tail;}

    /**
     * Gibt die Liste als String zurück
     * @return die Liste als String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Element<T> x = head;
        while (x != null) {
            sb.append(x);
            sb.append(" ");
            x = x.getNext();
        }
        return sb.toString();
    }
}
