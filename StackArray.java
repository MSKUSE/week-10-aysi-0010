import java.util.ArrayList;

public class StackArray implements Stack{

    private ArrayList<Object> stack =
            new ArrayList<>();

    @Override
    public void push(Object Item) {
        stack.add(0,Item);

    }

    @Override
    public Object pop() {
        return stack.remove(0);
    }

    @Override
    public void peek() {
        System.out.println("The top is" + stack.get(0));
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
