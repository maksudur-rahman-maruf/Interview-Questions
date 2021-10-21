package StackImpl;

import java.util.LinkedList;

public class StackImplUsingLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add("maruf");
        list.add(2);
        list.add("Faiha");

        // getting top
        Object top = list.getLast();
        System.out.println("Top: " + top);

        // removing top
        list.pollLast();

        for (Object item : list) {
            System.out.println(item);
        }

    }

}
