package mortgageCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner loanScanner = new Scanner(System.in);
        while(true){
            System.out.print("Principal Loan Value: ");
            int principalLoanValue = loanScanner.nextInt();
            if(principalLoanValue >= 1000 && principalLoanValue <= 1_000_000){
                break;
            }
            System.out.println("Enter a value between 1k and 1m");
        }

        Scanner interestRate = new Scanner(System.in);
        System.out.print("Interest Rate: ");
        float interestRateValue = interestRate.nextFloat();

        Scanner period = new Scanner(System.in);
        System.out.print("Period (years): ");
        byte periodValue = period.nextByte();

        float monthlyInterestRate = interestRateValue / PERCENT / MONTHS_IN_YEAR; // Be careful with magic numbers!
        float operation = monthlyInterestRate + 1;
        int monthlyPayments = periodValue * 12;
        //double mortgageCalculation = ((principalLoanValue * monthlyInterestRate * Math.pow(operation, monthlyPayments)) / (Math.pow(operation, monthlyPayments) - 1));
        // tener en cuenta los parentesis en las operaciones
        //System.out.println(mortgageCalculation);
    }
}
