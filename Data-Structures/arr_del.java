import java.util.*;
import java.lang.*;
import java.io.*;
/*
    Future Implementation

    1.A before_ele function that deletes the element that is one position before the given element in the list.
*/

/**
 * This class represents an array of integers.
 */
class Array {

    /**
     * The current size of the array.
     */
    int size;

    /**
     * The maximum length of the array.
     */
    private int length;

    /**
     * The array of integers.
     */
    private int[] arr;

    /**
     * Constructs a new array with the specified length.
     *
     * @param length The length of the array.
     */
    public Array(int length) {
        this.length = length;
        this.size = 0;
        this.arr = new int[this.length];
    }

    /**
     * Prints the contents of the array.
     */
    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.arr[i]);
        }
    }

    /**
     * Inserts an element into the array.
     *
     * @param element The element to insert.
     */
    public void insert(int element) {
        this.arr[this.size] = element;
        this.size++;
    }

    /**
     * Deletes the last element from the array.
     */
    public void dellast() {
        this.arr[this.size - 1] = 0;
        this.size--;
    }

    /**
     * Deletes the first element from the array.
     */
    public void delfirst() {
        for (int i = 1; i < this.size; i++) {
            this.arr[i - 1] = this.arr[i];
        }
        this.arr[this.size - 1] = 0;
        this.size--;
    }

    /**
     * Deletes the element at the specified position.
     *
     * @param pos The position of the element to delete.
     */
    public void delpos(int pos) {
        if (pos > this.size - 1 || pos < 0) {
            System.out.println("Not Possible to Delete");
        } else {
            for (int i = pos; i < this.size; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.arr[this.size - 1] = 0;
            this.size--;
        }
    }

    /**
     * Deletes the element after the specified element.
     *
     * @param ele The element to delete after.
     */
    public void after_ele(int ele) {
        int temp = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.arr[i] == ele) {
                temp = i + 1;
                break;
            }
        }
        if (temp == -1) {
            dellast();
        } else {
            delpos(temp);
        }
    }
    /**
     * Deletes the current element or given element.
     *
     * @param ele The element to delete .
     */
    public void curr_ele(int ele){
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == ele) {
                break;
            }
        }
        if (i == this.size) {
            // dellast();
            System.out.println("element not found");
        } else {
            delpos(i);
        }
    }
}
/**
* The main method class.
*/
class arr_del {
    /**
    * The main method.
    *
    * @param args The command-line arguments.
    */
    public static void main(String[] args) {

        // Create a new array.
        Array obj = new Array(10);

        // Insert some elements into the array.
        obj.insert(45);
        obj.insert(200);
        obj.insert(120);
        obj.insert(1250);
        obj.insert(10);

        // Print the contents of the array.
        obj.print();

        // Delete the last element from the array.
        obj.dellast();

        // Print the contents of the array again.
        obj.print();
    }
}
