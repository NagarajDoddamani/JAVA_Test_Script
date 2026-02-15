package StackAN;

public class stackImplimentation {
    int max, top;
    int[] stack;

    public stackImplimentation(int max){
        this.max = max;
        this.top = -1;
        this.stack = new int[max];
    }
    
    // PUSH operation
    public int push(int x) {
        if (isFull() == 1) {
            // System.out.println("Error: Stack Overflow");
            return 1;
        } else {
            stack[++top] = x;
            // System.out.println(x + " pushed into stack");
            return 0;
        }
    }

    // POP operation
    public int pop() {
        if (isEmpty() == 1) {
            // System.out.println("Error: Stack Underflow");
            return 0;
        } else {
            int x = stack[top--];
            // System.out.println("Popped element: " + x);
            return 1;
        }
    }

    // PEEK operation
    public int peek() {
        if (isEmpty() == 1) {
            // System.out.println("Error: Stack is empty");
            return 0;
        } else {
            // System.out.println("Top element: " + stack[top]);
            return 1;
        }
    }

    // DISPLAY operation
    public int display() {
        if (isEmpty() == 1) {
            // System.out.println("Stack is empty");
            return 0;
        } else {
            // System.out.print("Stack elements: ");
            // for (int i = top; i >= 0; i--) {
            //     System.out.print(stack[i] + " ");
            // }
            // System.out.println();
            return 1;
        }
    }

    // isEmpty
    int isEmpty() {
        if (this.top == -1)
            return 1;
        else
            return 0;
    }

    // isFull
    int isFull() {
        if (this.top == this.max - 1)
            return 1;
        else
            return 0;
    }

    // no random valiues 
    public void makeFull() {
        for (int i = 0; i < max; i++) {
            stack[i] = i + 1; // Filling the stack with some values
        }
        top = max - 1; // Set top to the last index
    }
}

