package org.example.Day006;

public class StringToInteger {

    public int myAtoi(String s){
        int i = 0, strLength = s.length(), sign = 1;
        long result = 0;

        while (i < strLength && s.charAt(i)== ' '){
            i ++;
        }

        if(i < strLength && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign = (s.charAt(i)=='-')? -1: 1;
            i++;
        }

        while (i< strLength&& Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;

            if(sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign ==-1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * result);
    }
}
