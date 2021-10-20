
class Stack {
    int top;
    int maxSize = 10;
    int arr[] = new int[maxSize];

    Stack() {
        top = -1;
    }


    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Overflow!!");
        } else {
            top = top + 1;
            arr[top] = value;
            System.out.println("Inserted Successfully!!");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow!!");
        } else {
            top = top - 1;
            System.out.println("Deleted Successfully!!");
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}


public class StackOperations {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        stack.pop();

        stack.display();

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);

        stack.display();

        System.out.println(stack.isEmpty());

    }

}
