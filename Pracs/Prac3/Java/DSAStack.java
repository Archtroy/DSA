public class DSAStack{
    private Object[] stack;
    private int count;
    
    private static final int DEFULT_CAPACITY = 100;

    public void print(String arg3) { //Y tf ain't this default? 
        System.out.print(arg3);
    }

    public DSAStack(){ //constructor
        stack = new Object[DEFULT_CAPACITY];
        count = 0;
    }

    public DSAStack(int maxCapacity){ //alt constructor
        stack = new Object[maxCapacity];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public Boolean isFull() { //accessor 
        Boolean full = (count == (stack.length));

        return full;
    }

    public Boolean isEmpty() { //accessor 
        Boolean empty = (count == 0);

        return empty;
    }

    public void push(Object arg1) { //mutator 
        if (isFull() == true) {
            System.out.println("ERROR: Stack is full");
        }
        else {
        // add arg1 to the stack
            stack[count] = arg1;

            count++;
        }
    }

    public Object top() { //mutator 
        Object topVal = null;

        if (isEmpty() == true) {
            System.out.println("ERROR: Stack is empty");
             
        }
        else {
            topVal = stack[count - 1];
        }

        return topVal;
    }

    public Object pop() { //mutator
        Object topVal = top();
        count = count - 1;

        return topVal;
    }

    public void prtStack() {
        //System.out.println(stack);
        print("[");
        for (int ii = 0; ii < (count-1); ii++) {
            print(stack[ii] + ", ");
        }
        System.out.println(stack[count-1] + "]");
    }
}