package lesson;

public class Dispatcher {
    public static void main(String[] args) {
        int firstNumber = 6;
        int secondNumber =10;

        int sum;
        int subtraction;
        int multiplication;

        int division;
        int remainderOfTheDivision;

        sum = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        multiplication = firstNumber * secondNumber;
        division = firstNumber / secondNumber;
        remainderOfTheDivision = firstNumber % secondNumber;
        System.out.println("Сума чисел = " + sum);
        System.out.println("Різниця чисел = " + subtraction);
        System.out.println("Добуток чисел = " + multiplication);
        System.out.println("Частка чисел = " + division+"."+remainderOfTheDivision);

    }
}
