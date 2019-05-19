package net.greet;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClassB {


    public void futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int years){

        for (int i = 1; i <=years; i++){

            monthlyInterestRate = monthlyInterestRate/100d;
            double totalInterest = investmentAmount * Math.pow((1 + monthlyInterestRate/12), years*12);
            double roundedValue = new BigDecimal(totalInterest).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
            System.out.println(i + " "+ roundedValue);
        }

    }
}








//
//3.1 Write a Java program that will compute the future investment value at a given interest rate for a
//        specified number of years. The java program should have a minimum of two classes.
//        3.1.1 classA
//         The main method (starting point)
//        (5)
//         The object of classB
//        (5)
//         Should also call the void method named futureInvestmentValue (double investment
//        Amount, double monthlyInterestRate, int years)
//        (15)
//        3.1.2 classB
//        
//        A get method named count_words(String str)
//        Expected Output:
//        Input the investment amount: 28000
//        Input the rate of interest: 7
//        Input number of years: 6
//        Years Future Value
//        1 30024.12
//        2 32194.57
//        3 34521.92
//        4 37017.51
//        5 39693.51
//        6 42562.95
