package com.codedifferently;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        String oneReplaced = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String twoReplaced = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        List<String> one = Arrays.asList(oneReplaced.split(""));
        List<String> two = Arrays.asList(twoReplaced.split(""));

        for(int i = 0; i < two.size(); i++) {
            if(!one.contains(two.get(i))) return false;
        }
        return true;
    }

//            String oneReplaced = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
//            String twoReplaced = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
//
//            String[] one = oneReplaced.split("");
//            String[] two = twoReplaced.split("");
//
//            Map<String, Integer> map = Stream.of(two)
//                    .collect(Collectors.toMap(
//                            str->str,
//                            num->1,
//                            Integer::sum
//                    ));
//
//            for(String val : one) {
//                System.out.println(val);
//                if(map.get(val) == null) return false;
//                else {
//                    Integer value = map.get(val);
//                    value -= 1;
//                    if(value < 0) return false;
//                }
//                System.out.println(Arrays.toString(one));
//            }
//            return true;
//    }

}


