public class DSAQueue {
    public Object[] queue;
    public int count;
    
    public static final int DEFULT_CAPACITY = 100;

    public void print(String arg3) { //Y tf ain't this default? 
        System.out.print(arg3);
    }

    public DSAQueue(){ //constructor
        queue = new Object[DEFULT_CAPACITY];
        count = 0;
    }

    public DSAQueue(int maxCapacity){ //alt constructor
        queue = new Object[maxCapacity];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public Boolean isFull() { //accessor 
        Boolean full = (count == (queue.length-1));

        return full;
    }

    public Boolean isEmpty() { //accessor 
        Boolean empty = (count == 0);

        return empty;
    }

    public void dequeue() { //mutator
        if (isEmpty()) {
            System.out.println("ERROR: Queue is empty");
        }
        else { 
            for (int ii = 0; ii < count; ii++) {
                queue[ii] = queue[(ii+1)];
            }
            count--;
        }
    }

    public Object peek() { //mutator
        Object frontVal = null;

        if (isEmpty() == true) {
            System.out.println("ERROR: Queue is empty");
             
        }
        else {
            frontVal = queue[0];
        }

        return frontVal;
    }

    public void prtQueue() {
        //System.out.println(stack);
        print("[");
        for (int ii = 0; ii < (count-1); ii++) {
            print(queue[ii] + ", ");
        }
        System.out.println(queue[count-1] + "]");
    }
}