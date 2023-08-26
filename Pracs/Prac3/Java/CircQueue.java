public class CircQueue extends DSAQueue {
    public CircQueue() {    //Copycat constructor
        super();
    }
    public CircQueue(int maxCapacity) {    //Copycat constructor
        super(maxCapacity);
    }
    
    public void enqueue(Object value) { //mutator
        if (isFull()) {
            Object frontVal = queue[0]; 

            for (int ii = 0; ii < (count - 1); ii++) { 
                queue[ii] = queue[(ii+1)];
            }
            queue[count - 1] = frontVal; 
        }
        else {
            queue[count] = value;

            count++;
        }
    }


}