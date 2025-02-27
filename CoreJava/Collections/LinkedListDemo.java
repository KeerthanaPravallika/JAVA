package CoreJava.Collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        // Appends the specified element to the end of this list.
        l1.add(2);

        // Inserts the specified element at the specified position in this list.
        l1.add(1, 3);

        // Inserts the specified element at the beginning of this list.
        l1.addFirst(1);

        // Appends the specified element to the end of this list.
        l1.addLast(4);

        System.out.println(l1);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2 = (LinkedList) l1.clone();

        System.out.println("Copying l1 to l2 using clone() - " + l2);

        // returns true if this list contains the specified element
        System.out.println("Whether 2 is present in l1 or not : " + l1.contains(2));

        // retrieves the head (first element) of this list.
        System.out.println("Head element of l1 :" + l1.element());

        // returns the element at the specified position in this list.
        System.out.println("3rd element of l1 : " + l1.get(2));

        // returns the first element in this list.
        System.out.println("First element of l1 : " + l1.getFirst());

        // returns the last element in this list.
        System.out.println("Last element of l1 : " + l1.getLast());

        l1.add(4);

        // method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println("First occurence of 4 : " + l1.indexOf(4));

        // returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println("Last occurence of 4 : " + l1.lastIndexOf(4));


        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        System.out.println("Initial list: " + list);

        // listIterator(int index) - returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.
        ListIterator<String> iterator = list.listIterator(1);
        System.out.println("List iterator starting at index 1:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // offer(E e) - Adds the specified element as the tail (last element) of this list.
        list.offer("Element 4");
        System.out.println("Offer - Adding element at last : " + list);

        // offerFirst(E e) - Inserts the specified element at the front of this list.
        list.offerFirst("Element 0");
        System.out.println("OfferFirst - Adding element at starting : : " + list);

        // offerLast(E e) - Inserts the specified element at the end of this list.
        list.offerLast("Element 5");
        System.out.println("After offerLast: " + list);

        // peek() - retrieves but does not remove, the head (first element) of this list.
        System.out.println("Peek: " + list.peek());

        // peekFirst() - retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
        System.out.println("PeekFirst: " + list.peekFirst());

        // peekLast() - retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
        System.out.println("PeekLast: " + list.peekLast());

        // poll() - retrieves and removes the head (first element) of this list.
        System.out.println("Poll: " + list.poll());
        System.out.println("After poll: " + list);

        // pollFirst() - retrieves and removes the first element of this list, or returns null if this list is empty.
        System.out.println("PollFirst: " + list.pollFirst());
        System.out.println("After pollFirst: " + list);

        // pollLast() - retrieves and removes the last element of this list, or returns null if this list is empty.
        System.out.println("PollLast: " + list.pollLast());
        System.out.println("After pollLast: " + list);

        // remove() - retrieves and removes the head (first element) of this list.
        System.out.println("Remove: " + list.remove());
        System.out.println("After remove: " + list);

        // remove(int index) - removes the element at the specified position in this list.
        list.add("Element 6");
        System.out.println("After adding Element 6: " + list);
        System.out.println("Remove at index 1: " + list.remove(1));
        System.out.println("After remove at index 1: " + list);

        // remove(Object o) - removes the first occurrence of the specified element from this list if it is present.
        System.out.println("Remove 'Element 3': " + list.remove("Element 3"));
        System.out.println("After remove 'Element 3': " + list);

        // removeFirst() - removes and returns the first element from this list.
        list.addFirst("Element 0");
        System.out.println("After addFirst: " + list);
        System.out.println("RemoveFirst: " + list.removeFirst());
        System.out.println("After removeFirst: " + list);

        // removeFirstOccurrence(Object o) - removes the first occurrence of the specified element in this list
        list.add("Element 2");
        list.add("Element 2");
        System.out.println("After adding duplicates: " + list);
        System.out.println("RemoveFirstOccurrence 'Element 2': " + list.removeFirstOccurrence("Element 2"));
        System.out.println("After removeFirstOccurrence: " + list);

        // removeLast() - removes and returns the last element from this list.
        System.out.println("RemoveLast: " + list.removeLast());
        System.out.println("After removeLast: " + list);

        // removeLastOccurrence(Object o) - removes the last occurrence of the specified element in this list
        list.add("Element 2");
        list.add("Element 2");
        System.out.println("After adding duplicates again: " + list);
        System.out.println("RemoveLastOccurrence 'Element 2': " + list.removeLastOccurrence("Element 2"));
        System.out.println("After removeLastOccurrence: " + list);

        // set(int index, E element) - replaces the element at the specified position in this list with the specified element.
        list.set(0, "New Element 1");
        System.out.println("After set at index 0: " + list);

        // size() - method returns the number of elements in this list.
        System.out.println("Size of the list: " + list.size());

        // spliterator() - creates a late-binding and fail-fast Spliterator over the elements in this list.
        Spliterator<String> spliterator = list.spliterator();
        System.out.println("Spliterator elements:");
        spliterator.forEachRemaining(System.out::println);

        // toArray() - returns an array containing all of the elements in this list in proper sequence
        Object[] array = list.toArray();
        System.out.println("Array from list:");
        for (Object obj : array) {
            System.out.println(obj);
        }

        // toString() - returns a string containing all of the elements in this list in proper sequence
        System.out.println("List as string: " + list.toString());


    }
}
