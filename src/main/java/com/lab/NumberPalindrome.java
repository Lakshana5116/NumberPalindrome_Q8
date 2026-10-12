package com.lab;

public class NumberPalindrome {

    public boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }

        int original = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        NumberPalindrome obj = new NumberPalindrome();

        System.out.println("121: " + obj.isPalindrome(121));
        System.out.println("123: " + obj.isPalindrome(123));
    }
}
