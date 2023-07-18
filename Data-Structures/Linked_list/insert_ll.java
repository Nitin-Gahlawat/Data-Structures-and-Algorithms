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
    void add_element_at_end(int value) {

        // creating a new node
        node obj = new node();
        obj.data = value;
        obj.link = null;

        if (head == null) {
            this.head = new node();
            head = obj;
            return;
        }
        node temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = obj;
        return;
    }

    /**
     * Inserts an element at the begining of the linked list.
     *
     * @param value the value to be inserted
     */
    void add_element_at_beg(int value) {

        // creating a new node
        node obj = new node();
        obj.data = value;
        obj.link = null;

        if (head == null) {
            this.head = new node();
            head = obj;
            return;
        }
        obj.link = head;
        this.head = obj;
        return;
    }
}

class insert_ll {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.add_element_at_end(8);
        list.add_element_at_end(18);
        list.add_element_at_beg(28);
        list.print();
    }
}