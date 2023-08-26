public class ShuffQueue extends DSAQueue {
    public ShuffQueue() {   //Copycat constructor
        super();
    }
    public ShuffQueue(int maxCapacity) {    //Copycat constructor
        super(maxCapacity);
    }

    public void enqueue(Object value) { 
        if (isFull() == true) {
            System.out.println("ERROR: Stack is full");
        }
        else {
        // add value to queue
            queue[count] = value;

            count++;
        }
    }
}