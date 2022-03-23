public class List {

    private Node head;
    private Node tail;

    void add_front(int element) {
        Node e = new Node();
        e.element = element;
        if (head == null) {
            head = e;
            tail = e;
        } else {
            e.next_element = head;
            head = e;
        }
    }

    void add_last(int element) {
        Node e = new Node();
        e.element = element;
        if (head == null) {
            head = e;
            tail = e;
        } else {
            tail.next_element = e;
            tail = e;
        }
    }

    void add(int element, int index) {
        int position = 0;
        Node current = head;
        while (current != tail && current.next_element != null && position != index-2) {
            current = current.next_element;
            position++;
        }
        if (index-2 > position) {
            add_last(element);
            return;
        }

        Node data = new Node();
        data.element = element;
        if (current == null) {
            head = data;
            tail = data;
        } else if (current == tail){
            tail.next_element = data;
            tail = tail.next_element;
        } else {
            data.next_element = current.next_element;
            current.next_element = data;
        }
    }

    void print_list() {
        Node t = head;
        while (t != null) {
            System.out.print(t.element + " ");
            t = t.next_element;
        }
    }

    Node get_element_at(int index) {
        if (index > list_length()) {
            System.out.println("This index is impossible!(");
            return null;
        }
        Node current = head;
        int counter = 0;
        while (current != null && counter != index) {
            counter++;
            current = current.next_element;
        }
        return current;
    }

    void swap(int one, int two) {
        Node first = get_element_at(one);
        Node second = get_element_at(two);
        int temp = first.element;
        first.element = second.element;
        second.element = temp;
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

    void search(int data) {
        if(head == null)
            return;
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.element == data) {
            head = head.next_element;
            swap(0, 1);
            return;
        }
        int counter = 1;
        Node t = head;
        while (t.next_element != null) {
            if (t.next_element.element == data) {
                if(tail == t.next_element) {
                    tail = t;
                }
                t.next_element = t.next_element.next_element;
                if (counter < list_length()-1) {
                    swap(counter, counter + 1);
                }
            }
            t = t.next_element;
            counter++;
        }
    }

    void exersize() {
        for (int i=0; i<list_length()/5; i++) {
            swap(5*i, 5*(i+1)-1);
        }
    }
}
