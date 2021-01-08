package com.codedifferently;

public class Solution {

    /**
     * String Scramble
     * Have the function StringScramble(str1,str2) take both parameters being passed and return the boolean true if
     * a portion of str1 characters can be rearranged to match str2, otherwise return the string false.
     * For example: if str1 is "rkqodlw" and str2 is "world" the output should return true.
     * Punctuation and symbols will not be entered with the parameters.
     * @param str1
     * @param str2
     * @return
     */
    public Boolean stringScramble(String str1, String str2) {
        // code goes here
        int counter = 0;
        char[] chArray = str2.toCharArray();
        for(int i = 0; i < chArray.length; i++){
            if(str1.contains(String.valueOf(chArray[i]))){
                counter++;
            }
        }
        return counter == chArray.length ? true : false;
    }

}

