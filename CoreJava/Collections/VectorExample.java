package CoreJava.Collections;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Comparator;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println("Vector after adding elements: " + vector);

        // Add element at a specific index
        vector.add(1, "Date");
        System.out.println("Vector after adding 'Date' at index 1: " + vector);

        // Add all elements from another collection
        Vector<String> anotherVector = new Vector<>();
        anotherVector.add("Elderberry");
        anotherVector.add("Fig");
        vector.addAll(anotherVector);
        System.out.println("Vector after adding all elements from anotherVector: " + vector);

        // Add all elements from another collection at a specific index
        vector.addAll(2, anotherVector);
        System.out.println("Vector after adding all elements from anotherVector at index 2: " + vector);

        // Add element using addElement (legacy method)
        vector.addElement("Grape");
        System.out.println("Vector after adding 'Grape' using addElement: " + vector);

        // Get the current capacity of the Vector
        System.out.println("Current capacity of the Vector: " + vector.capacity());

        // Clear the Vector
        vector.clear();
        System.out.println("Vector after clearing all elements: " + vector);

        // Clone the Vector
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);

        // Add elements again for further operations
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Check if the Vector contains a specific element
        System.out.println("Does the Vector contain 'Banana'? " + vector.contains("Banana"));

        // Check if the Vector contains all elements from another collection
        System.out.println("Does the Vector contain all elements from anotherVector? " + vector.containsAll(anotherVector));

        // Copy elements into an array
        String[] array = new String[vector.size()];
        vector.copyInto(array);
        System.out.println("Array after copying elements from Vector: " + java.util.Arrays.toString(array));

        // Get element at a specific index
        System.out.println("Element at index 1: " + vector.elementAt(1));

        // Get an enumeration of the elements
        Enumeration<String> enumeration = vector.elements(); // The Enumeration interface is used to iterate over the elements of the Vector.
        System.out.print("Elements in the Vector using enumeration: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        // Ensure capacity
        vector.ensureCapacity(10);
        System.out.println("Capacity after ensuring minimum capacity of 10: " + vector.capacity());

        // Check equality with another object
        System.out.println("Is the Vector equal to anotherVector? " + vector.equals(anotherVector));

        // Get the first element
        System.out.println("First element: " + vector.firstElement());

        // Perform an action for each element

        vector.forEach(s -> System.out.println("Processing element: " + s));

        // Get element at a specific index
        System.out.println("Element at index 2: " + vector.get(2));

        // Get the hash code of the Vector
        System.out.println("Hash code of the Vector: " + vector.hashCode());

        // Get the index of a specific element
        System.out.println("Index of 'Cherry': " + vector.indexOf("Cherry"));

        // Get the index of a specific element starting from a specific index
        System.out.println("Index of 'Cherry' starting from index 1: " + vector.indexOf("Cherry", 1));

        // Insert an element at a specific index
        vector.insertElementAt("Date", 2);
        System.out.println("Vector after inserting 'Date' at index 2: " + vector);

        // Check if the Vector is empty
        System.out.println("Is the Vector empty? " + vector.isEmpty());

        // Get an iterator over the elements
        Iterator<String> iterator = vector.iterator();
        System.out.print("Elements in the Vector using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Get the last element
        System.out.println("Last element: " + vector.lastElement());

        // Get the last index of a specific element
        System.out.println("Last index of 'Banana': " + vector.lastIndexOf("Banana"));

        // Get the last index of a specific element starting from a specific index
        System.out.println("Last index of 'Banana' starting from index 2: " + vector.lastIndexOf("Banana", 2));

        // Get a list iterator over the elements
        ListIterator<String> listIterator = vector.listIterator();
        System.out.print("Elements in the Vector using list iterator: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // Get a list iterator starting from a specific index
        ListIterator<String> listIteratorFromIndex = vector.listIterator(1);
        System.out.print("Elements in the Vector using list iterator from index 1: ");
        while (listIteratorFromIndex.hasNext()) {
            System.out.print(listIteratorFromIndex.next() + " ");
        }
        System.out.println();

        // Remove an element at a specific index
        vector.remove(2);
        System.out.println("Vector after removing element at index 2: " + vector);

        // Remove a specific element
        vector.remove("Banana");
        System.out.println("Vector after removing 'Banana': " + vector);

        // Remove all elements from another collection
        vector.removeAll(anotherVector);
        System.out.println("Vector after removing all elements from anotherVector: " + vector);

        // Remove all elements
        vector.removeAllElements();
        System.out.println("Vector after removing all elements: " + vector);

        // Add elements again for further operations
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Remove a specific element using removeElement (legacy method)
        vector.removeElement("Banana");
        System.out.println("Vector after removing 'Banana' using removeElement: " + vector);

        // Remove an element at a specific index using removeElementAt (legacy method)
        vector.removeElementAt(1);
        System.out.println("Vector after removing element at index 1 using removeElementAt: " + vector);

        // Remove elements that satisfy a given predicate
        vector.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        });
        System.out.println("Vector after removing elements that start with 'A': " + vector);

        // Add elements again for further operations
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");


        // Replace each element with the result of applying a given operator
        vector.replaceAll(new java.util.function.UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        System.out.println("Vector after replacing each element with its uppercase version: " + vector);

        // Retain only the elements in the Vector that are contained in another collection
        vector.retainAll(anotherVector);
        System.out.println("Vector after retaining only elements from anotherVector: " + vector);

        vector.add("Apple");

        // Set the element at a specific index
        vector.set(0, "Date");
        System.out.println("Vector after setting element at index 0 to 'Date': " + vector);

        // Set the element at a specific index using setElementAt (legacy method)
        vector.setElementAt("Elderberry", 0);
        System.out.println("Vector after setting element at index 0 to 'Elderberry' using setElementAt: " + vector);

        // Set the size of the Vector
        vector.setSize(5);
        System.out.println("Vector after setting size to 5: " + vector);

        // Get the number of components in the Vector
        System.out.println("Number of components in the Vector: " + vector.size());

        Vector<String> vector1 = new Vector<>();
        vector1.add("Date");
        vector1.add("Apple");
        vector1.add("Banana");


        // Sort the Vector
        vector1.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Vector after sorting: " + vector1);

        // Get a Spliterator over the elements
        java.util.Spliterator<String> spliterator = vector.spliterator();
        System.out.print("Elements in the Vector using spliterator: ");
        spliterator.forEachRemaining(System.out::print);
        System.out.println();

        // Get a sublist of the Vector
        java.util.List<String> subList = vector.subList(0, 2);

        System.out.println("Sublist from index 0 to 2: " + subList);

        // Convert the Vector to an array
        Object[] array1 = vector.toArray();
        System.out.println("Array from Vector: " + java.util.Arrays.toString(array1));

        // Convert the Vector to an array of a specific type
        String[] stringArray = new String[vector.size()];
        vector.toArray(stringArray);
        System.out.println("String array from Vector: " + java.util.Arrays.toString(stringArray));

        // Get the string representation of the Vector
        System.out.println("String representation of the Vector: " + vector.toString());

        System.out.println("Before trimming : " + vector.capacity());
        // Trim the capacity of the Vector to its current size
        vector.trimToSize();
        System.out.println("Capacity after trimming to size: " + vector.capacity());

    }}

