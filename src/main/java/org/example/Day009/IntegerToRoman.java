package org.example.Day009;

public class IntegerToRoman {

    public static String intToRoam(int num){
        String[] thousands ={"","M","MM","MMM"};
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] units = {"","I","II","III","IV","V","VI", "VII","VIII","IX"};

        return thousands[num/1000] +
                hundreds[(num % 1000)/100]+
                tens[(num % 100) / 10]+
                units[num % 10];
    }


}
