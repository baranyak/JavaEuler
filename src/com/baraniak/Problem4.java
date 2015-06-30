/**
 * https://projecteuler.net/problem=4
 * A palindromic number reads the same both ways. The largest palindrome made from the product
 * of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * */

 package com.baraniak;

import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {

    public static void main(String[] args) {
        ArrayList<Integer> palindromeList = new ArrayList<Integer>();
        for (int i=101; i<=999; i++){
            for (int j=101; j<=999; j++){
                int product = i * j;
                if (!palindromeList.contains(product) && isPalindrome(product)){
                    palindromeList.add(product);
                }
            }
        }
        System.out.println(Collections.max(palindromeList));
    }
    private static boolean isPalindrome (Integer inputNumber){
        String inputNumberAsString = inputNumber.toString();
        if (inputNumberAsString.length() % 2 != 0){
            return false;
        }
        else{
            StringBuffer head = new StringBuffer(inputNumberAsString.substring(0, inputNumberAsString.length()/2));
            StringBuffer tail = new StringBuffer(inputNumberAsString.substring(inputNumberAsString.length()/2));
            tail.reverse();
            return head.toString().equals(tail.toString());
        }
    }

}
