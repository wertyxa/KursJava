package app;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // fors();
        calculate();
    }

    private static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculate. \nPlease input First number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please input Second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Select please type operation: 1 - Addition, 2 - Subtract, 3 - division, 4 - remainderOfTheDivision");
        int type = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.println("Result = "+(firstNumber+secondNumber));
                break;
            case 2:
                System.out.println("Result = "+(firstNumber-secondNumber));
                break;
            case 3:
                System.out.println("Result = "+(firstNumber/secondNumber));
                break;
            case 4:
            System.out.println("Result = "+(firstNumber%secondNumber));
            break;
            default:
                System.out.println("Incorrect type operation");
                break;

        }
    }

    private static void fors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву:");
        int[] numArray = new int[scanner.nextInt()];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = new Random().nextInt(100);
        }
        System.out.println("Введіть число для перевірки:");
        int secondNumber = scanner.nextInt();
        boolean res = false;
        for (int i : numArray) {
            if (i == secondNumber) {
                res = true;
            }
        }
        if (res) {
            System.out.println("Дане число " + secondNumber + " є в масиві");
        } else {
            System.out.println("Числа " + secondNumber + " немає в масиві");
        }
        int maxNumber = numArray[0];
        for (int i : numArray) {
            System.out.println(i);
            if (maxNumber < i)
                maxNumber = i;
        }
        System.out.println("Максимальне число в масиві: " + maxNumber);
    }
}
