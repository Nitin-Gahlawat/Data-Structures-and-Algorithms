/**
 * Class representing an algorithm for sorting an array using the bubble sort
 * technique
 *
 */
class algorithm {
    int arr[];

    /**
     * Constructor to initialize the algorithm object with the input array
     *
     */
    algorithm(int[] arr) {
        this.arr = arr;
    }

    /**
     * Method to print the elements of the array
     *
     */
    void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d  ", arr[i]);
        }
        System.out.printf("\n");
    }

    /**
     * Method to sort the array using the bubble sort algorithm
     *
     */
    void bubblesort() {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // Swap elements if they are in the wrong order
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

public class sorting {
    /**
     * Main Method
     *
     */
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 3, 6 };
        algorithm obj = new algorithm(arr);

        System.out.println("Elements before sorting:-");

        obj.print();
        obj.bubblesort();

        System.out.println("Elements after sorting:-");
        obj.print();
    }
}
