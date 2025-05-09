public class StackLinkedList implements Stack {

    StackItem top;

    @Override
    public void push(Object Item) {
        StackItem newBox = new StackItem(Item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }


    @Override
    public Object pop() {
        Object tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is " + this.top);

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
