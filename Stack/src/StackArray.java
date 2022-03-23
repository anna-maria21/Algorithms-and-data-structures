public class StackArray {
    char[] array;
    int index;

    public void push(char elem) {
        char[] temp = array;
        array = new char[index + 1];
        for (int i = 0; i < index; i++) {
            array[i+1] = temp[i];
        }
        array[0] = elem;
        index++;
    }

    public char pop() {
        char toReturn = array[0];
        char[] temp = array;
        array = new char[index - 1];
        for (int i = 0; i < index-1; i++) {
            array[i] = temp[i+1];
        }
        index = index -1;
        return toReturn;
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void search() {
        int letters = 0;
        int numbers = 0;
        for (int i=0; i<index; i++) {
            if (array[i]<='Z' && array[i]>='A') {
                letters++;
            } else if (array[i]<='9' && array[i]>='0') {
                numbers++;
            }
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
