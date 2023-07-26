/**
 * This class represents an stack.
 */
class stack {
    // This is the total size of the stack;
    int size;
    // This is the value of the top pointer of the stack
    int top;
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
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());

    }
}