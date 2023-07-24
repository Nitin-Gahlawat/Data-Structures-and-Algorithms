/**
 * This class represents an the Node of the Circular linked list;
 *
 */
class Node {
    int data;
    Node link;
}

/**
 * This class represents a linked list.
 */
class Circular_linked_list {
    Node head;

    /**
     * Initializes a new instance of the Circular linked list class with the given
     * element.
     *
     * @param value initially the value to be inserted
     */
    Circular_linked_list(int value) {
        // initial construction with one value
        this.head = new Node();
        this.head.data = value;
        this.head.link = this.head;
    }

    /**
     * Initializes a new instance of the Circular linked list class.
     *
     */
    Circular_linked_list() {

    }

    /**
     * Prints all the elements in the Circular linked list.
     */
    void print() {
        Node temp = this.head;
        if (temp == null) {
            System.out.println("The Circular linked list is empty");
        }
        do {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        } while (temp != this.head);

        System.out.printf("\n");
    }

    /**
     * Inserts an element in the Circular linked list.
     *
     * @param value the value to be inserted
     */
    void addelement(int value) {

        // creating a new Node
        Node obj = new Node();
        obj.data = value;
        obj.link = this.head;

        // cheacking if there is any node in the linked list or not.
        if (head == null) {
            this.head = new Node();
            this.head = obj;
            return;
        }
        // if head!=null inserting the new node in the Circular linked list.
        Node temp = this.head;
        while (temp.link != this.head) {
            temp = temp.link;
        }
        temp.link = obj;
        return;
    }
}

class traversal {
    public static void main(String[] args) {
        Circular_linked_list list = new Circular_linked_list(8);
        list.addelement(8);
        list.addelement(18);
        list.addelement(28);
        list.print();
    }
}