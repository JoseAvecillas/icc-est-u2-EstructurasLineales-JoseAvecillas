import controllers.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Stack stack= new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        // System.out.println(stack.peek());
        // System.out.println(stack.peek());

        stack.printStack();
        System.out.println("Tam = " + stack.size());
        stack.pop();
        stack.printStack();
        System.out.println("Tam = " + stack.size());

    }
}
