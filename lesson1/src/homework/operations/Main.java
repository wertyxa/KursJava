package homework.operations;

public class Main {
    public static void main(String[] args) {
        byte bt = 127;
        short sh = 11111;
        int i = 1111111111;
        long l = 1111111111111111111L;
        double d = 1111111111.0;
        float f = 111111111111111111111111111111111111111.0F;

        double sum = bt + sh;
        double subtraction = sh - i;
        double multiplication = i * l;
        double division = l / d;
        double remainderOfTheDivision = d % f;

        System.out.println(sum(f,f));
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainderOfTheDivision);



    }

    public static float sum(double x, double y) {
        return (float) (x + y);
    }
    public static double subtraction(double x, double y) {
        return x - y;
    }
    public static double multiplication(double x, double y) {
        return x * y;
    }
    public static double division(double x, double y) {
        return x / y;
    }
    public static double remainderOfTheDivision(double x, double y) {
        return x % y;
    }
}
