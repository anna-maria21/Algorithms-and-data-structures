public class StackList {
    public class Node {
        char element;
        Node next_element;
    }
    private Node head;

    public void push(char element) {
        Node e = new Node();
        e.element = element;
        if (head == null) {
            head = e;
        } else {
            e.next_element = head;
            head = e;
        }
    }
    public char pop() {
        char temp = head.element;
        head = head.next_element;
        return temp;
    }

    public void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.element + " ");
            t = t.next_element;
        }
        System.out.println();
    }

    int list_length() {
        Node current = head;
        int counter =0;
        while (current != null) {
            counter++;
            current = current.next_element;
        }
        return counter;
    }

    public void search() {
        int letters = 0;
        int numbers = 0;

        if(head == null) {
            System.out.println("The stack is empty(");
            return;
        }

        Node t = head;
        for (int i=0; i<list_length(); i++) {
            if (t.element<='Z' && t.element>='A') {
                letters++;
            } else if (t.element<='9' && t.element>='0') {
                numbers++;
            }
            t = t.next_element;
        }

        if (letters > numbers) {
            System.out.printf("The stack has more uppercase letters than numbers (%d uppercase letter(s) and %d digit(s))", letters, numbers);
        } else if (letters < numbers) {
            System.out.printf("The stack has more numbers than uppercase letters (%d number(s) and %d uppercase letter(s))", numbers, letters);
        } else {
            System.out.printf("The stack has the same number of uppercase letters and numbers (%d each)", numbers);
        }
    }
}
