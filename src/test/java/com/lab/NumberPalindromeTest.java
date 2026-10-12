package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NumberPalindromeTest {

    @Test
    public void testPalindrome() {
        NumberPalindrome obj = new NumberPalindrome();
        assertTrue(obj.isPalindrome(121));
    }

    @Test
    public void testNotPalindrome() {
        NumberPalindrome obj = new NumberPalindrome();
        assertFalse(obj.isPalindrome(123));
    }

    @Test
    public void testNegativeNumber() {
        NumberPalindrome obj = new NumberPalindrome();
        assertFalse(obj.isPalindrome(-121));
    }
}