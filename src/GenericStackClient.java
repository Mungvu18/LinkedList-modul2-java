public class GenericStackClient {
    public void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println("1.1 Size of stack after push operations:" + stack.size());
        System.out.print("1.2 Pop elements from stack: ");
        System.out.printf("%s",stack.pop());
        System.out.println("\n1.3 size of stack after pop: " + stack.size());
    }
    public void stackOfIntegers(){
        MyGenericStack <Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        int length = stack.size();
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
        }
        System.out.println("1.1 Size of stack after push operations:" + length);
        System.out.print("1.2 Pop elements from stack: ");
        System.out.printf("%s",stack.pop());
        System.out.println("\n1.3 size of stack after pop: " + length);

    }

    public static void main(String[] args) {
        System.out.println("Stack of String ");
        GenericStackClient genericStackClient = new GenericStackClient();
        genericStackClient.stackOfIStrings();
        genericStackClient.stackOfIntegers();

    }
}
