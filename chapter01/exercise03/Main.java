package exercise03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter third number: ");
        int num3 = Integer.valueOf(scanner.nextLine());

        scanner.close();

        int max;
        if(num1 > num2){
            max = num1;
        }else{
            max = num2;
        }

        if(max < num3){
            max = num3;
        }

        System.out.println("Using if/else\n\tMax number is: " + max);


        max = Math.max(num1, num2);
        max = Math.max(max, num3);

        System.out.println("Using Math.max\n\tMax number is: " + max);
    }
}