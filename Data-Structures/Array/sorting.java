/**
 * Class representing an Algorithm for sorting an array using the bubble sort
 * technique
 *
 */
class Algorithm {
    int arr[];

    /**
     * Constructor to initialize the Algorithm object with the input array
     *
     */
    Algorithm(int[] arr) {
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
     * Method to sort the array using the bubble sort Algorithm
     *
     */
    void sort(boolean ascending) {
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
     * Method to sort the array using the bubble sort Algorithm
     * Default implemenation in case of no argument(s) is provided
     */
    void sort() {
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
}

public class Sorting {
    /**
     * Main Method
     *
     */
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 3, 6 };
        Algorithm obj = new Algorithm(arr);

        System.out.println("Elements before sorting:-");

        obj.print();
        obj.sort(false); // arrange the elements in the descending order

        System.out.println("Elements after sorting:-");
        obj.print();
    }
}
