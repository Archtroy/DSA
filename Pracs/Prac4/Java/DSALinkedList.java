public class DSALinkedList{
    DSAListNode head;
    DSAListNode tail;
    
    public void println(String arg) { //Y tf ain't this default? 
        System.out.println(arg);
    }

    public DSALinkedList(){ //defualt constructor
        head = null;
    }

    public void insertFirst(Object newValue) { //mutator
        DSAListNode newNd = new DSAListNode(newValue);

        if (isEmpty()) {
            head = newNd;
        }
        else {
            newNd.setNext(head);
            head.setPrev(newNd);

            head = newNd;
            tail = head.getNext();
        }
    }

    public void insertLast(Object newValue) { //mutator
        DSAListNode newNd = new DSAListNode(newValue);

        if (isEmpty()) {
            head = newNd;
        }
        else {
            DSAListNode currNd = head;
            while (currNd.getNext() != null) {
                currNd = currNd.getNext();
            }
            currNd.setNext(newNd);
            tail = newNd;
        }
    }

    public boolean isEmpty() { //accessor
        boolean empty = (head == null);

        return empty;
    }

    public Object peekFirst() { //accessor
        Object nodeValue = 0;

        if (isEmpty()) {
            println("ERROR: LinkList is Empty");
        }
        else {
            nodeValue = head.getValue();
        }

        return nodeValue;
    }

    public Object peekLast() { //accessor
        Object nodeValue = 0;
        
        if (isEmpty()) {
            println("ERROR: LinkList is Empty");
        }
        else {
            /* 
            DSAListNode currNd = head;
            while (currNd.getNext() != null){
                currNd = currNd.getNext();
            }
            nodeValue = currNd.getValue();
            */
            nodeValue = tail.getValue();
        }

        return nodeValue;
    }

    public Object removeFirst() { //mutator
        Object nodeValue = 0;
        
        if (isEmpty()) {
            println("ERROR: LinkList is Empty");
        }
        else {
            nodeValue = head.getValue();
            head = head.getNext();
        }

        return nodeValue;
    }

    public Object removeLast() {
        Object nodeValue = 0;
        
        DSAListNode prevNd;
        DSAListNode currNd;

        if (isEmpty()) {
            println("ERROR: LinkList is Empty");
        }
        else if( head.getNext() == null ) {
            nodeValue = head.getValue();
            head = null;
        }
        else {
            prevNd = null;
            currNd = head;
            while (currNd.getNext() != null) {
                prevNd = currNd;
                currNd = currNd.getNext();
            }
            prevNd.setNext(null);
            nodeValue = currNd.getValue();
        }

        return nodeValue;
    }

}