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

    void delete_end() {
        node temp = head;
        if(temp==null){
            System.out.println("No element found in the linked list");
            return;
        }
        size--;
        if(temp.link==null){
            temp=null;
            return;
        }
        while (temp.link.link != null) {
            temp = temp.link;
        }
        temp.link = null;
    }

    void delete_beg() {
        if (head != null)
            head = head.link;
        else
            System.out.println("No element found in the linked list");
    }
}

class delete_ll {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(18);
        list.insert(8);
        list.insert(28);
        list.insert(200);
        // list.delete_beg();
        list.print();
    }
}