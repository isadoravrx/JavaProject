package firstList;
import java.util.Scanner;
public class invertedNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int firstNumber = n /10000;
        int restOfNumber = n % 10000;
        int secondNumber = restOfNumber / 1000;
        restOfNumber =  restOfNumber % 1000;
        int thirdNumber = restOfNumber / 100;
        restOfNumber = restOfNumber % 100;
        int forthNumber = restOfNumber/ 10;
        int fifthNumber = restOfNumber % 10;
        String firstValue = Integer.toString(firstNumber);
        String secondValue = Integer.toString(secondNumber);
        String thirdValue = Integer.toString(thirdNumber);
        String forthValue = Integer.toString(forthNumber);
        String fifthValue = Integer.toString(fifthNumber);
        String completedNumber = fifthValue + forthValue + thirdValue + secondValue + firstValue;
        System.out.println(completedNumber);

    }
}
