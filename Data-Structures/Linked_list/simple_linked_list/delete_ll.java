/**
 * This class represents an the node of the linked list;
 *
 */
class node {
    int data;
    node link;
}

/**
 * This class represents a linked list.
 */
class linkedlist {
    node head;
    int size = 0;

    /**
     * Initializes a new instance of the linkedlist class with the given element.
     *
     * @param value initially the value to be inserted
     */
    linkedlist(int value) {
        // initial construction with one value
        this.head = new node();
        head.data = value;
        head.link = null;
    }

    /**
     * Initializes a new instance of the linkedlist class.
     *
     */
    linkedlist() {
    }

    /**
     * Prints all the elements in the linked list.
     */
    void print() {
        node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("\n");
    }

    /**
     * Inserts an element at the end of the linked list.
     *
     * @param value the value to be inserted
     */
    void insert(int value) {

        // creating a new node
        node obj = new node();
        obj.data = value;
        obj.link = null;

        if (head == null) {
            this.head = new node();
            head = obj;
            size++;
            return;
        }
        size++;
        node temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = obj;
        return;
    }

    /**
     * Delete the element from the end of the linked list.
     *
     */
    void delete_end() {
        node temp = head;
        if (temp == null) {
            System.out.println("No element found in the linked list");
            return;
        }
        size--;
        if (temp.link == null) {
            temp = null;
            return;
        }
        while (temp.link.link != null) {
            temp = temp.link;
        }
        temp.link = null;
    }

    /**
     * Delete the element from the beginning of the linked list
     *
     */
    void delete_beg() {
        if (head != null)
            head = head.link;
        else
            System.out.println("No element found in the linked list");
    }

    /**
     * Delete the given element from the linked list
     *
     * @param value the value to be Deleted
     */
    void delete_value(int value) {
        // check for the head if it is empty or not
        if (head == null) {
            System.out.println("The linked lsit is empty");
            return;
        }
        node temp = head;
        node pre = head;
        // for the first node in the linked list
        if (temp.data == value) {
            head = temp.link;
            return;
        }
        // for all the other node in the linked list expect for the first node
        while (temp.data != value && temp != null)

        {
            pre = temp;
            temp = temp.link;
        }
        if (temp == null)
            System.out.println("the element not found");
        else {
            pre.link = temp.link;

        }

    }
}

class delete_ll {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(18);
        list.insert(45);
        list.insert(28);
        list.insert(250);
        list.delete_value(18);
        list.print();
    }
}