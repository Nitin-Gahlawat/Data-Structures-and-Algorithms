/**
 * This class represents an stack.
 */
class stack {
    // This is the total size of the stack;
    int size = 0;
    // This is the value of the top pointer of the stack
    int top = 0;
    // stack implemented using array
    int[] stack_pointer;

    /**
     * stack constructor
     *
     * @param size it is the size of the stack.
     */
    stack(int size) {
        this.size = size;
        this.stack_pointer = new int[this.size];
        this.top = 0;
    }

    /**
     * push operation insert a new value in stack at the top.
     *
     * @param value element to add the item in the stack .
     */
    void push(int value) {
        if (top + 1 > this.size) {
            System.out.println("overflow");
            return;
        }
        stack_pointer[this.top] = value;
        this.top++;
    }

    /**
     * return the top value of the stack.
     *
     */
    int top() {
        return stack_pointer[this.top - 1];
    }

    /**
     * removes the top value from the stack.
     *
     */
    void pop() {
        if (this.top == 0) {
            System.err.println("Stack is empty.");
            return;
        }
        stack_pointer[this.top - 1] = 0;
        this.top--;
    }
}

/**
 * The main method class.
 */
public class create {
    /**
     * The main method.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        stack st = new stack(4);
        st.push(12);
        st.push(1);
        st.push(182);
        st.push(162);
        for (int i = 0; i < st.top(); i++) {
            st.pop(); // poping out all the element expect the last element
        }
        System.out.println(st.top()); // printing the last element
        st.pop(); // poping out the last element

        // This statement will print 'Stack is empty'
        st.pop();
    }
}