import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        //  kiểm tra xem stack có null k
        if (!isEmpty()){
          return stack.removeFirst();
        }throw new EmptyStackException();
    }
    public  int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyGenericStack{" +
                "stack=" + stack +
                '}';
    }
}
