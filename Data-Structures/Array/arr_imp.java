/**
 * The array class represents a dynamic array data structure.
 */
class array {
    int size;
    int length;
    int[] arr;

    /**
     * Returns the size of the array.
     *
     * @return the size of the array
     */
    int size() {
        return this.size();
    }

    /**
     * Initializes a new instance of the array class with the given length.
     *
     * @param len the initial length of the array
     */
    private void increase_size() {
        this.length = this.length * 2;
        int new_arr[] = new int[this.length];
        for (int i = 0; i < this.length / 2; i++) {
            new_arr[i] = arr[i];
        }
        arr = new_arr;
    }

    /**
     * Initializes a new instance of the array class with the given length.
     *
     * @param len the initial length of the array
     */
    array(int len) {
        this.length = len;
        this.size = 0;
        this.arr = new int[this.length];
    }

    /**
     * Initializes a new instance of the array class with the given length.
     *
     */
    array() {
        // by default 10 size array is created.
        this.length = 10;
        this.size = 0;
        this.arr = new int[this.length];
    }

    /**
     * Prints all the elements in the array.
     */
    void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * Inserts an element at the end of the array.
     *
     * @param element the element to be inserted
     */
    void insertlast(int element) {
        if (this.size == this.length)
            increase_size();
        arr[this.size] = element;
        this.size = this.size + 1;
    }

    /**
     * Inserts an element at the beginning of the array.
     *
     * @param element the element to be inserted
     */
    void insertfirst(int element) {
        if (this.size == this.length)
            increase_size();
        if (this.size == 0)
            arr[this.size] = element;
        else {
            for (int i = this.size - 1; i >= 0; i--)
                arr[i + 1] = arr[i];
            arr[0] = element;
        }
        this.size++;
    }

    /**
     * Inserts an element at the specified position in the array.
     *
     * @param element the element to be inserted
     * @param pos     the position at which to insert the element
     */
    void insertposition(int element, int pos) {
        if (this.size == this.length)
            increase_size();
        if (pos > this.size) {
            System.err.println("Position given is far from the array size.");
            return;
        } else {
            for (int i = this.size - 1; i >= pos; i--) {
                arr[i + 1] = arr[i];
            }
            arr[pos] = element;
        }
        this.size++;
    }

    /**
     * Inserts an element after a specified element in the array.
     *
     * @param element the element to be inserted
     * @param ele     the element after which to insert the new element
     */
    void after_ele(int element, int ele) {
        int i = 0;
        for (i = 0; i < this.size; i++) {
            if (arr[i] == ele)
                break;
        }
        if (i == this.size)
            insertlast(element);
        else
            insertposition(element, i + 1);
    }

    /**
     * Inserts an element before a specified element in the array.
     *
     * @param element the element to be inserted
     * @param pos     the element before which to insert the new element
     */
    void before_ele(int element, int pos) {
        int temp = -1;
        for (int i = 0; i < this.size; i++) {
            if (arr[i] == pos) {
                temp = i;
                break;
            }
        }
        if (temp == -1)
            insertfirst(element);
        else
            insertposition(element, temp);
    }
}

public class arr_imp {
    public static void main(String[] args) {
        // The initial length of the array is 4 but the length is can increase in case
        // of more than 4 elements
        array obj = new array();
        obj.insertfirst(220);
        obj.insertlast(415);
        obj.insertfirst(220);
        obj.insertposition(80, 2);
        obj.insertlast(45);
        obj.print();
    }
}