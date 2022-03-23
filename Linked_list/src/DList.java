public class DList {

    private DNode head;
    private DNode tail;

    void add_front(int element) {
        DNode e = new DNode();
        e.element = element;
        if (head == null) {
            head = e;
            tail = e;
        } else {
            e.next_element = head;
            head.prev_element = e;
            head = e;
        }
    }

    void add_last(int element) {
        DNode e = new DNode();
        e.element = element;
        if (tail == null) {
            head = e;
            tail = e;
        } else {
            tail.next_element = e;
            e.prev_element = tail;
            tail = e;
        }
    }

    void add(int element, int index) {
        int position = 0;
        DNode current = head;
        while (current != tail && current.next_element != null && position != index-2) {
            current = current.next_element;
            position++;
        }
        if (index-2 > position) {
            add_last(element);
            return;
        }

        DNode data = new DNode();
        data.element = element;
        if (current == null) {
            head = data;
            tail = data;
        } else if (current == tail){
            tail.next_element = data;
            data.prev_element = tail;
            tail = tail.next_element;
        } else {
            DNode temp = current.next_element;
            data.next_element = current.next_element;
            data.prev_element = current;
            current.next_element = data;
            temp.prev_element = data;
        }
    }

    int list_length() {
        DNode current = head;
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
            head.prev_element = null;
        }

        DNode t = head;
        while (t.next_element != null) {
            if (t.next_element.element == data) {
                if(tail == t.next_element) {
                    tail = t;
                    t.next_element = t.next_element.next_element;
                    break;
                }
                t.next_element = t.next_element.next_element;
                t.next_element.prev_element = t;
            }
            t = t.next_element;
        }
    }

    void print_list() {
        DNode t = head;
        while (t != null) {
            System.out.print(t.element + " " /*+ t + " " + t.prev_element + " " + t.next_element + " "*/);
            t = t.next_element;
        }
    }
}
