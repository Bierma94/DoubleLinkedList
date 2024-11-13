package de.bierma;

/**
 * Element  
 *
 * @author Jannes Bierma
 * @version 1.0 - 12.11.2024
 */
public class Element<T> {
    /** Der Schlüssel der gespeichert werden soll*/
    T key;
    /** Referenz auf das nächste Element */
    Element<T> next;
    /** Referenz auf das vorherige Element */
    Element<T> prev;

    // Konstruktoren
    public Element(T value, Element<T> next, Element<T> prev) {
        this.key = value;
        this.next = next;
        this.prev = prev;
    }
    public Element(T value) {this(value, null, null);}

    public Element(){this(null, null, null);}

    // Getter und Setter

    public Element<T> getNext() {return next;}

    public void setNext(Element<T> next) {this.next = next;}

    public T getKey() {return key;}

    public void setKey(T key) {this.key = key;}

    public Element<T> getPrev() {return prev;}

    public void setPrev(Element<T> prev) {this.prev = prev;}
    /**
     * Gibt das Element als String zurück
     * @return das Element als String
     */
    @Override
    public String toString() {
        return key.toString();
    }
}
