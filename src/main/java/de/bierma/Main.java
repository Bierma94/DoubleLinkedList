package de.bierma;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(); // Erzeugt eine leere Liste vom Typ Integer
        LinkedListAlgorithm<Integer> listHelper = new LinkedListAlgorithm<>();

        System.out.println("Fügt 10 Elemente am Anfang und 10 am Ende der Liste ein");
        for(int i = 0; i < 10; i++) {
            listHelper.insertLast(list, new Node<>(i));
        }

        for(int i = 10; i < 20; i++) {
            listHelper.insertFirst(list, new Node<>(i));
        }
        System.out.println(list);
        System.out.println("Löscht das Node mit dem Schlüssel 10");
        //Nutzt die search Methode um das Node mit dem Schlüssel 10 zu finden
        listHelper.delete(list, listHelper.search(list, 10));
        System.out.println(list);
        System.out.println("Gibt das erste Node der Liste zurück");
        System.out.println(listHelper.first(list));
    }
}