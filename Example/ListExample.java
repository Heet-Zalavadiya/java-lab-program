import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> list = new ArrayList<>();

        // void add(int index, E element) OR boolean add(E element)
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Orange"); // Insert at index 1

        // boolean addAll(Collection<? extends E> c)
        List<String> moreFruits = Arrays.asList("Grapes", "Mango");
        list.addAll(moreFruits);

        // E get(int index)
        System.out.println("Item at index 2: " + list.get(2));

        // int indexOf(Object o)
        System.out.println("Index of 'Banana': " + list.indexOf("Banana"));

        // int lastIndexOf(Object o)
        list.add("Apple"); // Add duplicate
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // ListIterator<E> listIterator()
        ListIterator<String> iterator = list.listIterator();
        System.out.print("Iterating using ListIterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // E remove(int index) OR boolean remove(Object o)
        list.remove("Orange"); // Remove by object
        list.remove(2);        // Remove by index

        // E set(int index, E element)
        list.set(1, "Pineapple"); // Replace Banana with Pineapple

        // List<E> subList(int fromIndex, int toIndex)
        List<String> sub = list.subList(1, 3); // fromIndex inclusive, toIndex exclusive
        System.out.println("Sublist from index 1 to 2: " + sub);

        // Final list
        System.out.println("Final List: " + list);
    }
}
