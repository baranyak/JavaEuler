/**
 * https://projecteuler.net/problem=6
 * The sum of the squares of the first ten natural numbers is,
 *      1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *      (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the
 * square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 */

package com.baraniak;

public class Problem6 {

    public static void main(String[] args) {
        int n = 100;
        long sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;
        int sum = n * (1 + n) / 2;
        long squareOfSum = (long)Math.pow(sum, 2);

        System.out.println(squareOfSum - sumOfSquares);
    }
}
