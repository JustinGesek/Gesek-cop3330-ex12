package ex12;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
//Enter the principal: 1500
//Enter the rate of interest: 4.3
//Enter the number of years: 4
//After 4 years at 4.3%, the investment will be worth $1758.
//A = P(1 + rt)
public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        long principal = scanner.nextLong();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble() / 100.0;

        System.out.print("Enter the number of years: ");
        long years = scanner.nextLong();

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.\n", years, rate * 100.0, principal * (1 + rate * years));

    }
}
