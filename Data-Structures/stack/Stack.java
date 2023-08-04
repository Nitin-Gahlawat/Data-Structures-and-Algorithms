/**
 * This class represents an Stack.
 */
class Stack_imp {
    // This is the total size of the Stack;
    int size = 0;
    // This is the value of the top pointer of the Stack
    int top = 0;
    // Stack implemented using array
    int[] Stack_pointer;

    /**
     * Stack constructor
     *
     * @param size it is the size of the Stack.
     */
    Stack_imp(int size) {
        this.size = size;
        this.Stack_pointer = new int[this.size];
        this.top = 0;
    }

    /**
     * Stack constructor
     *
     */
    Stack_imp() {
        this.size = 10;
        this.Stack_pointer = new int[this.size];
        this.top = 0;
    }

    /**
     * push operation insert a new value in Stack at the top.
     *
     * @param value element to add the item in the Stack .
     */
    void push(int value) {
        if (top + 1 > this.size) {
            System.out.println("overflow");
            return;
        }
        Stack_pointer[this.top] = value;
        this.top++;
    }

    /**
     * return the top value of the Stack.
     *
     */
    int top() {
        return Stack_pointer[this.top - 1];
    }

    /**
     * removes the top value from the Stack.
     *
     */
    void pop() {
        if (this.top == 0) {
            System.err.println("Stack is empty.");
            return;
        }
        Stack_pointer[this.top - 1] = 0;
        this.top--;
    }
}

/**
 * The main method class.
 */
public class Stack {
    /**
     * The main method.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Stack_imp st = new Stack_imp();
        st.push(1);
        System.out.println(st.top()); // printing the top most element
        st.pop(); // poping out the last element

        // This statement will print 'Stack is empty'
        st.pop();
    }
}