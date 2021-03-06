package adt;

/**
 * This interface will serve as the ADT for the LinkedList.
 * This ADT will define the operations available on the LinkedList.
 * As all the other Data Structures, the LinkedList will have operations to:
 * 1. add a node in the linked list.
 * 2. delete a node from the linked list.
 * 3. search a node in the linked list.
 * 4. sort the whole linked list based on the type of data its nodes contain.
 * 5. traverse the whole linked list and print the contents of its nodes.
 */
public interface LinkedListADTInterface<E> {
    /**
     * This method will add a node to the linked list.
     * The programmer will only send in the data value to this method and this
     * method will create a node suited to the linked list to be added inside it.
     *
     * @param item The data value that is to be added to the linked list.
     */
    void add(E item);

    /**
     * This method will remove a node from end of the linked list.
     *
     * @return the data of the deleted node
     */
    E remove();

    /**
     * This method will search for any occurrences of the given item in the linked list.
     * If the item has been found in the linked list, the method shall return a non-negative integer
     * greater than or equal to zero and less than the size.
     *
     * @param item The item to search in the linked list.
     * @return the index of the item found in the linked list.
     */
    int search(E item);

    /**
     * This method will sort the elements of the linked list.
     */
    void sort();

    /**
     * This method traverses the linked list and prints the contents of the nodes one-by-one.
     */
    void print();
}
