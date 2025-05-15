package org.example.Day005;

public class ReversedInteger {

    public int reverse(int number){
        int reversedNumber = 0 ;

        while (number != 0){
            int lastDigit = number % 10;
            number /=10;

            if(reversedNumber > Integer.MAX_VALUE / 10 ||
                    (reversedNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)){
                return 0;
            }

            if(reversedNumber < Integer.MIN_VALUE /10 ||
                    (reversedNumber == Integer.MIN_VALUE / 10 && lastDigit < -8)){
                return 0;
            }

            reversedNumber = reversedNumber * 10 + lastDigit;
        }

        return  reversedNumber;
    }
}
