class Stack {
    int max, top;
    int[] stack;

    void stack(int max) {
        this.max = max;
        this.top = -1;
        this.stack = new int[max];
    }
    
    // PUSH operation
    void push(int x) {
        if (isFull() == 1) {
            System.out.println("Error: Stack Overflow");
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    // POP operation
    void pop() {
        if (isEmpty() == 1) {
            System.out.println("Error: Stack Underflow");
        } else {
            int x = stack[top--];
            System.out.println("Popped element: " + x);
        }
    }

    // PEEK operation
    void peek() {
        if (isEmpty() == 1) {
            System.out.println("Error: Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // DISPLAY operation
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // isEmpty
    int isEmpty() {
        if (top == -1)
            return 1;
        else
            return 0;
    }

    // isFull
    int isFull() {
        if (top == max - 1)
            return 1;
        else
            return 0;
    }
}

