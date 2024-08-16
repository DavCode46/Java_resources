package dev.davcode;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d km)", name, distance);
    }
}

public class LinkedListsChallenge {
    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner s = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while(!quitLoop) {
            System.out.println("Enter value: ");
            String menuItem = s.nextLine().toUpperCase().substring(0, 1);
            switch(menuItem) {
                case "F":
                    if(!forward) {
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }
                    if(iterator.hasNext()) {
                        System.out.println("Visiting " + iterator.next());
                    } else {
                        System.out.println("End of the list");
                    }
                    break;
                case "B":
                    if(forward) {
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if(iterator.hasPrevious()) {
                        System.out.println("Visiting " + iterator.previous());
                    } else {
                        System.out.println("Start of the list");
                    }
                    break;
                case "L":
                    for(var place : placesToVisit) {
                        System.out.println(place);
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "Q":
                    quitLoop = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if(list.contains(place)) {
            System.out.println("Place already exists");
            return;
        }

        for(Place p : list) {
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Place already exists");
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace : list) {
            if(listPlace.distance() > place.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }


}
