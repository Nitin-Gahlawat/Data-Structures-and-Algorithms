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

    stack(int size) {
        this.size = size;
        this.stack_pointer = new int[this.size];
    }

    void push(int value) {
        if (top + 1 > this.size) {
            System.out.println("overflow");
            return;
        }
        stack_pointer[this.top] = value;
        this.top++;
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
        stack obj = new stack(3);
        obj.push(12);
        obj.push(1);
        obj.push(182);
        obj.push(162);
    }
}