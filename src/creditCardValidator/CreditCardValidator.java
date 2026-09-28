package creditCardValidator;

import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card Details To Verify: ");
        String number = input.nextLine();

        System.out.println("Card Type: " + cardType(number));
        System.out.println("Card Number: " + number);
        System.out.println("Card Digit Length: " + number.length());
        System.out.println("Card Validity Status: " + cardValidity(number));
    }


    public static String cardType(String number) {
        boolean length = number.length() >=13 && number.length() <= 16;
        char firstNumber = number.charAt(0);
        char secondNumber = number.charAt(1);

        if(firstNumber == '5' && length) return "Mastercard";
        else if(firstNumber == '4' && length) return "Visa Cards";
        else if(firstNumber == '3' && secondNumber == '7' && length) return "American Express Cards";
        else if(firstNumber == '6' && length) return "Discover cards";
        else return "Invalid Card";
    }


    public static int[] digitDoubling(String number) {
        int[] numbers = new int[number.length()/2];

        int index = 0;

        for(int count = number.length() - 2; count >= 0; count-=2){
            char digit = number.charAt(count);
            numbers[index] = Integer.parseInt(String.valueOf(digit));
            index++;
      }

        for(int counter = 0; counter < numbers.length; counter++){
            int doubled = numbers[counter] * 2;
            if(doubled <= 9){
                numbers[counter] = doubled;
          }
            else{
                int first = doubled / 10;
                int second = doubled % 10;
                numbers[counter] = first + second;
          }
      }
        return numbers;
    }

    public static int digitAdding(String number) {

        int[] value = digitDoubling(number);
        int sum = 0;
        for(int count = 0; count < value.length; count++){
            sum += value[count];
        }
        return sum;
    }

    public static int oddNumberSum(String number) {
        int[] numbers = new int[number.length()/2];

        int index = 0;

        for(int count = number.length() - 1; count >= 0; count-=2){
            char digit = number.charAt(count);
            numbers[index] = Integer.parseInt(String.valueOf(digit));
            index++;
        }

        int sum = 0;
        for(int count = 0; count < numbers.length; count++){
            sum += numbers[count];
        }
        return sum;
    }

    public static int finalSum(String number) {
        int firstValue = digitAdding(number);
        int secondValue = oddNumberSum(number);
        int sum = 0;

        sum = firstValue + secondValue;
        return sum;
    }

    public static String cardValidity(String number) {
        int value = finalSum(number);

        if(value % 10 != 0) return "Invalid";
        return "Valid";

    }
}
