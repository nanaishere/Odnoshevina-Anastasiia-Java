package Test1;

import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        NumberChecker checker = new NumberChecker();
        checker.printHelloIfMoreThanSeven(number);

        scanner.close();
    }
}

class NumberChecker {
    void printHelloIfMoreThanSeven(int number) {
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}