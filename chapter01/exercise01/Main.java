package exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        // number = 10;
        scanner.close();

        System.out.println("Decimal: " + number);
        System.out.println("Binary: b" + Integer.toBinaryString(number));
        System.out.println("Octal: 0x" + Integer.toOctalString(number));
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Hexadecimal Floating Point: " + Float.toHexString(number));

        System.out.println("----------------------------------------------");
        System.out.printf("Decimal: %d\n", number);
        System.out.printf("Binary: b%s\n", Integer.toBinaryString(number));
        System.out.printf("Octal: 0x%o\n", number);
        System.out.printf("Hexadecimal: %X\n", number);
        System.out.printf("Hexadecimal Floating Point: %A\n", ((double)number));
       

    }
}