package de.bierma;

/**
 * LinkedListMethods
 *
 * @author Jannes Bierma
 * @version 1.0 - 12.11.2024
 */
public class LinkedListAlgorithm<T>  {

    public LinkedListAlgorithm() {}
    /**
     * Gibt das erste Node der Liste zurück
     * @param l die Liste
     * @return das erste Node der Liste
     */
    public Node<T> first(DoubleLinkedList<T> l) {
       return l.getHead();
    }
    /**
     * Sucht das Node mit dem Schlüssel k in der Liste l
     * @param l die Liste
     * @param k der Schlüssel nach dem gesucht wird
     * @return das Node mit dem Schlüssel k
     */
    public Node<T> search(DoubleLinkedList<T> l, T k) {
        Node<T> x = l.getHead();
        while (x != null && !x.getKey().equals(k)) {
            x = x.getNext();
        }
        return x;
    }
    /**
     * Fügt das Node x am Anfang der Liste l ein
     * @param list die Liste
     * @param x das Node das eingefügt werden soll
     */
    public void insertFirst(DoubleLinkedList<T> list, Node<T> x) {
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
     * Fügt das Node x am Ende der Liste list ein
     * @param list die Liste
     * @param x das Node das eingefügt werden soll
     */
    public void insertLast(DoubleLinkedList<T> list, Node<T> x) {
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
     * Löscht das Node x aus der Liste list
     * @param list die Liste
     * @param x das Node das gelöscht werden soll
     */
    public void delete(DoubleLinkedList<T> list, Node<T> x) {
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


