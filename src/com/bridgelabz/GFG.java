package com.bridgelabz;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = (int) sc.nextLong();
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println(n + " is a perfect number");
        } else
            System.out.println(n + " is not a  perfect number");
    }
}



