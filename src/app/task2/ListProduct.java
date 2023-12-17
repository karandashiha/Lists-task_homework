package app.task2;

import java.util.ArrayList;
import java.util.List;

public class ListProduct {
    public static void main(String[] args) {

        List<String> products = createProductList();
        System.out.println("Initial list:");
        printList(products);

        List<String> partOfList = getPartOfList(products, 2, 4);
        System.out.println("\nList part:");
        printList(partOfList);
    }

    private static List<String> createProductList() {
        List<String> products = new ArrayList<>();
        products.add("orange");
        products.add("mango");
        products.add("banana");
        products.add("apple");
        products.add("kiwi");
        products.add("cherry");
        return products;
    }

    private static List<String> getPartOfList(List<String> originalList, int fromIndex, int toIndex) {
        return new ArrayList<>(originalList.subList(fromIndex - 1, toIndex));
    }

    private static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ") " + list.get(i));
        }
    }
}
