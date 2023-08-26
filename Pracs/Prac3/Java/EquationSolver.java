public final class EquationSolver {
    private int precedenceOf(Object theOp) {
        int prescedence = 0;
        if (theOp == "+" || theOp == "-") {
            prescedence = 1;
        }
        else if (theOp == "*" || theOp == "/") {
            prescedence = 2;
        }

        return prescedence;
    }

    private ShuffQueue parseInfixToPostfix(String equation) {    
        DSAStack opStack = new DSAStack(100);

        ShuffQueue postfix = new ShuffQueue(100);

        String[] infix = equation.split(" "); 
        int ii = 0;
        while ( ii < infix.length ) {
            String term = infix[ii];

            if (term.equals("(")) {
                opStack.push("(");
            }
            else if (term.equals(")")) {
                while (opStack.top() != "(") {
                    //postfix <- postfix + opStack.pop()
                    postfix.enqueue(opStack.pop());
                }
                opStack.pop();
            }
            else if (term.equals("+") || term.equals("-") || term.equals("*") || term.equals("/")) {
                while (!opStack.isEmpty() && opStack.top() != "(" && precedenceOf(opStack.top()) >= precedenceOf(term)) {
                    //postfix <- postfix + opStack.pop()
                    postfix.enqueue(opStack.pop());
                }
                opStack.push(term.charAt(0));
            }
            else {
                //postfix <- postfix + term
                postfix.enqueue(Double.parseDouble(term));
            }

            ii++;
        }

        while (!opStack.isEmpty()){
            //postfix <- postfix + opStack.pop()
            postfix.enqueue(opStack.pop());
        }

        return postfix;
    }
     
    private double executeOperation(Character op, double op1, double op2) { //Helper function for evaluatePostfix().
        
        double result = 0;
        if (op == '+') {
            result = op1 + op2;
        }
        else if (op == '-') {
            result = op1 - op2;
        }
        else if (op == '*') {
            result = op1 * op2;
        }
        else if (op == '/') {
            result = op1 / op2;
        }

        System.out.println("Operation: " + String.valueOf(op1) + op + String.valueOf(op2) + " = " + String.valueOf(result));
        return result;

    }

    private double evaluatePostfix(ShuffQueue postfixQueue) {
        DSAStack stackOut = new DSAStack(100);

        int ii = 0;
        final int stopper = postfixQueue.getCount();
        while ( ii < stopper ) {
            Object term = postfixQueue.peek(); 
            System.out.println(term);
            if (term instanceof Character) { //(term == "+" || term == "-" || term == "*" || term == "/")
                double op2 = (double) stackOut.top(); 
                stackOut.pop();

                double op1 = (double) stackOut.top();
                stackOut.pop();
                
                stackOut.push(executeOperation( (Character) term, op1, op2));

                postfixQueue.dequeue();
            }
            else{
                stackOut.push(term);

                postfixQueue.dequeue();
            }
            
            ii++;
        }
        stackOut.prtStack();

        return (double) stackOut.top(); 
    }
    
    public double solver(String Equation) {
        System.out.println("Infix: " + Equation);
        
        ShuffQueue posOut = parseInfixToPostfix(Equation);
        
        System.out.print("Postfix: ");
        posOut.prtQueue();

        double finalAns = evaluatePostfix(posOut);

        return finalAns;
    }
    
}