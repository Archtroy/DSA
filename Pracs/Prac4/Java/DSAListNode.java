public class DSAListNode {
    public Object value;
    public DSAListNode next;
    public DSAListNode prev;
    
    public DSAListNode(Object inValue) { //constructor
        value = inValue;
        next = null;
        prev = null;
    }

    public Object getValue() { //accessor


        return value;
    }

    public void setValue(Object inValue) { //mutator
        value = inValue;
    }

    public DSAListNode getNext() { //accessor


        return next;
    }

    public void setNext(DSAListNode newNext) { //mutator
        next = newNext;
    }

    public DSAListNode getPrev() { //accessor


        return prev;
    }

    public void setPrev(DSAListNode newPrev) { //mutator
        prev = newPrev;
    }
}