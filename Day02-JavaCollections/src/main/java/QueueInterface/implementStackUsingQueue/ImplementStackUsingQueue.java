package QueueInterface.implementStackUsingQueue;

public class ImplementStackUsingQueue {

    public static void main(String[] args){
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(9);

        System.out.println("Original Stack -> " + stack);
        System.out.println("Top -> " + stack.top());
        stack.pop();
        System.out.println("New stack after pop operation -> " + stack);
        System.out.println("New Top -> " + stack.top());
        System.out.println("Stack is empty -> " + stack.empty());
    }
}
