package exercise02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an angle: ");
        int angle = Integer.valueOf(scanner.nextLine());
        int angle2 = angle;
        scanner.close();

        angle = angle % 360;

        if(angle < 0){
            angle = 360 + angle;
        }


        System.out.println("Using %: " + angle);

        angle2 = Math.floorMod(angle2, 360);
        System.out.println("Using floorMod: " + angle2);



    }
}