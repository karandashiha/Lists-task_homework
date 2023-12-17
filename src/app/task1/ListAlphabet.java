package app.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAlphabet {
    public static void main(String[] args) {

        List<String> names = createAndSortList();

        System.out.println("Initial list:");
        printList(names);

        System.out.println("\nSorted list:");
        printList(names);
    }

    private static List<String> createAndSortList() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Robert");
        names.add("Lisa");
        names.add("David");
        names.add("Amanda");

        Collections.sort(names);
        return names;
    }

    private static void printList(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ") " + names.get(i));
        }
    }
}
