/**
 * https://projecteuler.net/problem=3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package com.baraniak;

public class Problem3 {

    public static void main(String[] args) {
        long numberToFactor = 600851475143L;
        long largestPrimeFactor = 2;
        for(long i=2; i<numberToFactor; i++){
            if (numberToFactor % largestPrimeFactor != 0){
                largestPrimeFactor ++;
            }
            else{
                numberToFactor = numberToFactor / largestPrimeFactor;
                largestPrimeFactor = 2;
            }
        }
        System.out.println(numberToFactor);
    }
}
