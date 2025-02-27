package CoreJava.Collections;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // It is used to build an empty array list.
        ArrayList<Integer> list1 = new ArrayList<>();

        // Adding elements - add() -  This method is used to append a specific element to the end of a list.
        list1.add(1);
        list1.add(3);
        list1.add(4);

        System.out.println("Demo of add function : " + list1);

        // add(int index, Object element) - This method is used to insert a specific element at a specific position index in a list.

        list1.add(1,2);

        System.out.println("Demo of add function when index is given: " + list1);

        // This method is used to append all the elements from a specific collection to the end of the mentioned list.
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);

        list1.addAll(list2);

        System.out.println("Demo of addAll function : " + list1);

        // Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list.

        list2.addAll(0,list1);

        System.out.println("Demo of addAll function when index is given : " + list2);

        // This method is used to remove all the elements from any list.
        list2.clear();
        System.out.println("Clearing all elements of list 2 : " + list2);

        // Returns true if this list contains the specified element.
        System.out.println("Whether 6 is present in list1 : "+ list1.contains(6) );
        System.out.println("Whether 16 is present in list1 : "+ list1.contains(16) );

        // Using for each
        System.out.println("Using for each : ");
        list1.forEach(num -> System.out.println(num));

        // Returns the element at the specified position in this list.
        System.out.println("Element at index 3 : " +list1.get(3));

        list1.add(6);

        // The index the first occurrence of a specific element is either returned or -1 in case the element is not in the list.
        System.out.println("First occurrence of value 6 in list1 : "+ list1.indexOf(6));
        System.out.println("First occurrence of value 16 in list1 : "+ list1.indexOf(16));

        // Returns true if this list contains no elements.
        System.out.println("Whether list1 is empty : " + list1.isEmpty());
        System.out.println("Whether list2 is empty : " + list2.isEmpty());

        // The index of the last occurrence of a specific element is either returned or -1 in case the element is not in the list.
        System.out.println("Last occurence of 6 in list1 : " + list1.lastIndexOf(6));
        System.out.println("Last occurence of 16 in list1 : " + list1.lastIndexOf(16));

        list1.add(12);
        list1.add(12);

        // Removes the element at the specified position in this list.
        list1.remove(6);

        System.out.println("Removed element at index 6 : " +list1);

        list2.add(1);
        list2.add(12);

        // Removes from this list all of its elements that are contained in the specified collection.

        list1.removeAll(list2);
        System.out.println("removed all elements of list2 in list1 : " + list1);

        // set(int index, E element) - Replaces the element at the specified position in this list with the specified element.
        // returns the removed element
        list1.set(1,10);
        System.out.println("replace value at index 1 with 10 : " + list1);

        // Returns the number of elements in this list.
        System.out.println("Array list 1 size : " + list1.size());

        // Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        System.out.println("Sub list in list1 : " + list1.subList(2,5));
    }
}
