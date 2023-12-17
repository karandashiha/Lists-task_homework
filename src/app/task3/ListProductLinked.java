package app.task3;

import java.util.LinkedList;

public class ListProductLinked {
    public static void main(String[] args) {

        LinkedList<String> products = createProductList();
        System.out.println("Initial list:");
        printList(products);

        manipulateList(products);
        System.out.println("\nEdited list:");
        printList(products);
    }


    private static LinkedList<String> createProductList() {
        LinkedList<String> products = new LinkedList<>();
        products.add("orange");
        products.add("grape");
        products.add("apple");
        products.add("lemon");
        return products;
    }


    private static void manipulateList(LinkedList<String> list) {

        list.addFirst("plum");
        list.addLast("mango");
    }

    private static void printList(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ") " + list.get(i));
        }
    }
}
