package de.bierma;

/**
 * LinkedListMethods
 *
 * @author Jannes Bierma
 * @version 1.0 - 12.11.2024
 */
public class LinkedListHelper<T>  {

    public LinkedListHelper() {}
    /**
     * Gibt das erste Element der Liste zurück
     * @param l die Liste
     * @return das erste Element der Liste
     */
    public Element<T> first(DoubleLinkedList<T> l) {
        return l.getHead() == null
                ? null
                : l.getHead();
    }
    /**
     * Sucht das Element mit dem Schlüssel k in der Liste l
     * @param l die Liste
     * @param k der Schlüssel nach dem gesucht wird
     * @return das Element mit dem Schlüssel k
     */
    public Element<T> search(DoubleLinkedList<T> l, T k) {
        Element<T> x = l.getHead();
        while (x != null && !x.getKey().equals(k)) {
            x = x.getNext();
        }
        return x;
    }
    /**
     * Fügt das Element x am Anfang der Liste l ein
     * @param list die Liste
     * @param x das Element das eingefügt werden soll
     */
    public void insertFirst(DoubleLinkedList<T> list, Element<T> x) {
        x.setNext(list.getHead());
        if (list.getHead() != null) {
            list.getHead().setPrev(x);
        } else {
            list.setTail(x);
        }
        list.setHead(x);
        x.setPrev(null);

    }
    /**
     * Fügt das Element x am Ende der Liste l ein
     * @param list die Liste
     * @param x das Element das eingefügt werden soll
     */
    public void insertLast(DoubleLinkedList<T> list, Element<T> x) {
        x.setPrev(list.getTail());
        if (list.getTail() != null) {
            list.getTail().setNext(x);
        } else {
            list.setHead(x);
        }
        list.setTail(x);
        x.setNext(null);
    }
    /**
     * Löscht das Element x aus der Liste l
     * @param list die Liste
     * @param x das Element das gelöscht werden soll
     */
    public void delete(DoubleLinkedList<T> list, Element<T> x) {
        if(x.getPrev() != null) {
            x.getPrev().setNext(x.getNext());
        } else {
            list.setHead(x.getNext());
        }
        if(x.getNext() != null) {
            x.getNext().setPrev(x.getPrev());
        } else {
            list.setTail(x.getPrev());
        }
    }
}


