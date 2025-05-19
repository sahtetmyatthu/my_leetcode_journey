package org.example.Day007;

public class PalindromeNumber {

    public boolean isPalindrome(int x){

        if( x < 0 ||(x % 10 == 0  && x != 0) ){
            return false;
        }

        int reserveHalf = 0;

        while (x > reserveHalf){
            int digit = x % 10;
            reserveHalf = reserveHalf * 10 + digit;
            x /= 10;
        }

        return x == reserveHalf || x == reserveHalf/10;
    }
}
