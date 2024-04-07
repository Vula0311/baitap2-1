import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String symbol;
        char symbolz = '*';

        do {
            System.out.println("Menu: ");
            System.out.println("    " + "1. Print the rectangle");
            System.out.println("    " + "2. Print the square triangle");
            System.out.println("    " + "3. Print isosceles triangle");
            System.out.println("    " + "4. Exit");
            System.out.print("Select item from menu: ");
            number = input.nextInt();
            if (number == 1) {
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(symbolz + " ");
                    }
                    System.out.println(symbolz);
                }
            } else {
                if (number == 2) {
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(symbolz + " ");
                        }
                        System.out.println(symbolz);
                    }
                } else {
                    if (number == 3) {
                        for (int i = 5; i >= 1; i--) {
                            for (int j = 1; j < i; j++) {
                                System.out.print(symbolz + "  ");
                            }
                            System.out.println(symbolz);
                        }
                    }
                }
            }
        } while (number != 4);

    }
}