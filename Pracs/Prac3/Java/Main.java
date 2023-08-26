public class Main {
    public static void main(String[] args) {

        /*
        DSAStack s = new DSAStack();//creates a stack with 100
        DSAStack s1 = new DSAStack(50); //creates a stackwith 50
        s.push(5); //pushes 5 into the stack s
        s.prtStack();
        s.push(1232);
        System.out.println(s.top());
        s.push("Bogos");
        s.push("Binted");
        System.out.println(s.top());
        s.prtStack();
        */
        
        /*
        CircQueue t = new CircQueue(10);
        for (int ii = 1; ii < 12; ii++) {
            t.enqueue(ii);
        }
        t.prtQueue();

        t.dequeue();

        t.prtQueue();

        t.enqueue(123);

        t.prtQueue();
        

         
        ShuffQueue m = new ShuffQueue(70);
        for (int ii = 1; ii < 12; ii++) {
            m.enqueue(ii);
        }
        m.prtQueue();

        m.dequeue();

        m.prtQueue();

        m.enqueue(123);

        m.prtQueue();
        */
        
        
        EquationSolver b = new EquationSolver();

        double nom = b.solver("( 10.3 * ( 14 + 3.2 ) ) / ( ( 5 + 2 ) - ( 4 * 3 ) )");

        System.out.println("Result:" + String.valueOf(nom));
        
    }
}