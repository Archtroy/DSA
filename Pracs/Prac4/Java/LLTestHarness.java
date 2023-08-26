public class LLTestHarness {

    public static void main(String[] args) {
        DSALinkedList a = new DSALinkedList();

        a.insertFirst(25);

        a.insertLast("Amongus");

        System.out.println(a.peekFirst());

        a.removeFirst();

        System.out.println(a.peekFirst());
    }
}