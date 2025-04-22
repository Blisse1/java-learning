package mortgageCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        /*
        Simple Example Java Input

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:");
        byte age = scanner.nextByte(); // only parses byte values
        System.out.println("You're " + age + " years old!");

        */
        /**
         * This is my first Java program.
         * It calculates the mortgage based on values
         * introduced by the user through Java's input scanner
         *
         * @since 1.0
         */

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner loanScanner = new Scanner(System.in);
        System.out.print("Principal Loan Value: ");
        int principalLoanValue = loanScanner.nextInt();

        Scanner interestRate = new Scanner(System.in);
        System.out.print("Interest Rate: ");
        float interestRateValue = interestRate.nextFloat();

        Scanner period = new Scanner(System.in);
        System.out.print("Period (years): ");
        byte periodValue = period.nextByte();

        float monthlyInterestRate = interestRateValue / PERCENT / MONTHS_IN_YEAR; // Be careful with magic numbers!
        float operation = monthlyInterestRate + 1;
        int monthlyPayments = periodValue * 12;
        double mortgageCalculation = ((principalLoanValue * monthlyInterestRate * Math.pow(operation, monthlyPayments)) / (Math.pow(operation, monthlyPayments) - 1));
        // tener en cuenta los parentesis en las operaciones
        System.out.println(mortgageCalculation);
    }
    void asd(String name){

    }
}
