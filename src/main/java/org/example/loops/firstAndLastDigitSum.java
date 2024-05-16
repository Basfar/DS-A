package org.example.loops;

public class firstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int lastDigit = number % 10;

        // Find the first digit using a loop
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Return the sum of the first and last digits
        return firstDigit + lastDigit;
    }
}
