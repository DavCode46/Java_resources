package dev.davcode;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {

        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Melbourne");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//            gettingElements(placesToVisit);

//        printItinerary(placesToVisit);

        testIterator(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Adelaide");
        list.addLast("Brisbane");
        // Queue methods
        list.offer("Perth");
        list.offerFirst("Darwin");
        list.offerLast("Alice Springs");
        // Stack methods
        list.push("Canberra");
    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Alice Springs");
        System.out.println(list);

        String s1 = list.remove();
        System.out.println(s1 + " was removed from the list");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed from the list");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed from the list");

        // Queue methods
        String p1 = list.poll();
        System.out.println(p1 + " was removed from the list");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed from the list");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed from the list");

        list.push("Canberra");
        list.push("Alice Springs");
        list.push("Darwin");
        System.out.println(list);

        // Stack methods
        String t1 = list.pop();
        System.out.println(t1 + " was removed from the list");
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Element at index 2 is " + list.get(2));

        System.out.println("First element is " + list.getFirst());

        System.out.println("Last element is " + list.getLast());

        System.out.println("Index of Alice Springs is " + list.indexOf("Alice Springs"));
        System.out.println("Index of Alice Springs is " + list.lastIndexOf("Alice Springs"));

        // Queue retrieval methods
        System.out.println("Element from element is the first element" + list.element());
        System.out.println("Peek: " + list.peek());
        System.out.println("Peek first: " + list.peekFirst());
        System.out.println("Peek last: " + list.peekLast());
    }

    private static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());

        for(int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());


    }

    private static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previeousTown = list.getFirst();
        for(String town : list) {
            System.out.println("--> From: " + previeousTown + " to " + town);
            previeousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());


    }

    private static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previeousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previeousTown + " to " + town);
            previeousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
//            System.out.println("Next: " + iterator.next());
            if(iterator.next().equals("Alice Springs")) {
                iterator.add("Uluru");
            }

        }
        while(iterator.hasPrevious()) {
            System.out.println("Previous: " + iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println("Next: " + iterator2.next());
    }
}
