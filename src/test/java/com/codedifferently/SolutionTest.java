package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test01(){
        Solution solution = new Solution();
        String str1 = "cdore";
        String str2 = "coder";

        Boolean actual = solution.stringScramble(str1,str2);
        Assert.assertTrue(actual);

        System.out.println(actual);
    }

    @Test
    public void test02(){
        Solution solution = new Solution();
        String str1 = "h3llko";
        String str2 = "hello";

        Boolean actual = solution.stringScramble(str1,str2);
        Assert.assertFalse(actual);

        System.out.println(actual);
    }

    @Test
    public void test03(){
        Solution solution = new Solution();
        String str1 = "rkqodlw";
        String str2 = "world";

        Boolean actual = solution.stringScramble(str1,str2);
        Assert.assertTrue(actual);

        System.out.println(actual);
    }
}
