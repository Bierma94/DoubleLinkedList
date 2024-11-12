package de.bierma;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(); // Erzeugt eine leere Liste vom Typ Integer
        LinkedListHelper<Integer> listHelper = new LinkedListHelper<>();

        System.out.println("Fügt 10 Elemente am Anfang und 10 am Ende der Liste ein");
        for(int i = 0; i < 10; i++) {
            listHelper.insertLast(list, new Element<>(i));
        }

        for(int i = 10; i < 20; i++) {
            listHelper.insertFirst(list, new Element<>(i));
        }
        System.out.println(list);

        System.out.println("Löscht das Element mit dem Schlüssel 10");
        //Nutzt die search Methode um das Element mit dem Schlüssel 10 zu finden
        listHelper.delete(list, listHelper.search(list, 10));
        System.out.println(list);
        System.out.println("Gibt das erste Element der Liste zurück");
        System.out.println(listHelper.first(list));
    }
}