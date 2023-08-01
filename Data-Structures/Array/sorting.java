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
    void bubblesort(boolean ascending) {
        int temp;
        // Swap elements if they are in the wrong order
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // for ascending order
                if (ascending && arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                // for descending order
                else if (!ascending && arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    /**
     * Method to sort the array using the bubble sort algorithm
     * Default implemenation in case of no argument(s) is provided
     */
    void bubblesort() {
        int temp;
        // Swap elements if they are in the wrong order
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // for ascending order
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
        obj.bubblesort(false); // arrange the elements in the descending order

        System.out.println("Elements after sorting:-");
        obj.print();
    }
}
