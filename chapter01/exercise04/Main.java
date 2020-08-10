package exercise04;

public class Main {
    public static void main(String[] args) {
        double max = Double.MAX_VALUE;
        double min = Double.MIN_VALUE;

        System.out.println("Double max: " + max);
        System.out.println("Double min: " + min);

        System.out.println("Max nextUp: " + Math.nextUp(max));
        System.out.println("Min nextDown: " + Math.nextDown(min));
    }
}