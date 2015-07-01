/**
 * https://projecteuler.net/problem=7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

package com.baraniak;

import java.util.ArrayList;

public class Problem7 {

    public static ArrayList<Integer> primeList = new ArrayList<Integer>();

    public static void main(String[] args) {
        primeList.add(2);
        int i = 3;
        while (primeList.size()<10001){
            if (isPrime(i)){
                primeList.add(i);
            }
            i += 2;
        }
        System.out.println(primeList.get(primeList.size() - 1));
    }

    private static boolean isPrime(long number){
        boolean result = true;
        for (Integer prime: primeList){
            if (number % prime == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
