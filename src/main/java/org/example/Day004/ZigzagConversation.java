package org.example.Day004;

public class ZigzagConversation {

    public String convert(String s, int numRows) {

        int strLength = s.length();

        if(numRows == 1 || numRows > strLength){
            return s;
        }

        StringBuilder zigzagString = new StringBuilder();

        int cycleLength = 2 * numRows - 2;
        for (int row =0 ; row < numRows; row ++){
            for (int index = row; index < strLength; index +=cycleLength){
                zigzagString.append(s.charAt(index));

                int secondCharIndex = index + cycleLength - 2 * row;

                if(row != 0 && row != numRows-1 && secondCharIndex < strLength){
                    zigzagString.append(s.charAt(secondCharIndex));
                }
            }
        }

        return zigzagString.toString();
    }
}
