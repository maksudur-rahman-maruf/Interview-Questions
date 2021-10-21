package QueueImpl;

import java.util.LinkedList;

public class QueueImpUsingLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add("maruf");
        list.add(2);
        list.add("Faiha");

        list.poll(); // removing front

        // getting front
        Object front = list.getFirst();
        System.out.println("Front: " + front);

        // getting rear
        Object rear = list.getLast();
        System.out.println("Rear: " + rear);

        for (Object item : list) {
            System.out.println(item);
        }


    }

}
