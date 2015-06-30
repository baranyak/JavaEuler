/**
 * https://projecteuler.net/problem=5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package com.baraniak;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem5 {

    public static void main(String[] args) {
        ArrayList<Integer> dividers = new ArrayList<Integer>();
        dividers.addAll(Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        for (int i=20; i<=1000000000; i+=20){
            int flag = 0;
            for (int divider: dividers){
                if (i % divider != 0){
                    break;
                }
                else {
                    flag ++;
                }
            }
            if (flag == 10){
                System.out.println(i);
                break;
            }
        }
    }
}
