package com.company;

public class primeNumber {
    public static void main(String[] args) {
        int n, m, i, flag;

        n = 9;
        for (i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println("not a prime number");

            } else {
                System.out.println("prime");

            }

        }

    }

}


