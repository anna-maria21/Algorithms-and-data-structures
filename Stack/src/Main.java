/*Створити стек символів. Вивести на екран чого більше – прописних латинських літер чи цифр.*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,/?<>!:;#$%^&*-=+";
        final int length = str.length();

        StackArray stack_array = new StackArray();
        StackList stack_list = new StackList();

        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            char temp = str.charAt(rand.nextInt(length));
            System.out.print(temp + " ");
            stack_array.push(temp);
            stack_list.push(temp);
        }
        System.out.println("\nThe stack looks like:");
        stack_array.print();

        System.out.println("\n*Based on array*");
        stack_array.search();

        System.out.println("\n\n*Based on list*");
        stack_list.search();
    }
}
