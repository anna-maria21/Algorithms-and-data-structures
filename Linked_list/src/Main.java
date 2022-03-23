import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nSimple Linked List: \n");
        List first = new List();
        first.add_front(5);
        first.add_front(4);
        first.add_front(3);
        first.add_front(2);
        first.add_front(13);
        first.add_last(8);
        first.add_last(7);
        first.add_last(2);
        first.add(15, 4);
        first.add(13, 1);
        first.add(0, 7);
        first.add(10, 5);
        first.add(4, 4);
        first.add(4, 10);
        first.add(15, 6);
        first.add(17, 2);
        first.add(20, 20);
        System.out.print("Your list consists of " + first.list_length() + " elements:          ");
        first.print_list();
        first.exersize();
        System.out.println();
        System.out.print("After swapping values, the list looks like: ");
        first.print_list();
        System.out.println();
        System.out.print("After deleting values, the list looks like: ");
        first.search(13);
        first.print_list();

        System.out.println("\n\nDouble Linked List: \n");
        DList second = new DList();
        second.add_front(5);
        second.add_front(4);
        second.add_front(3);
        second.add_front(10);
        second.add_front(10);
        second.add_last(9);
        second.add_last(8);
        second.add_last(7);
        second.add_last(6);
        second.add(7, 4);
        second.add(15, 8);
        second.add(0, 4);
        second.add(9, 2);
        second.add(10, 10);
        second.add(10, 100);
        System.out.print("Your list consists of " + second.list_length() + " elements:          ");
        second.print_list();
        System.out.println();
        System.out.print("After deleting values, the list looks like: ");
        second.search(10);
        second.print_list();
    }
}
