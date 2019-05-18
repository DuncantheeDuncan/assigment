package net.greet;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ClassA {
    public static void main(String[] args){


        ClassB classB = new ClassB();
        Scanner scanner = new Scanner(System.in);
        classB.futureInvestmentValue(28000,7,8);

        while (true){
            System.out.println("please enter pv i n or help ");



        }











    }
}
//
//3.1 Write a Java program that will compute the future investment value at a given interest rate for a
//        specified number of years. The java program should have a minimum of two classes.
//        3.1.1 classA
//         The main method (starting point)
//        (5)
//         The object of classb
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
//        1 30 024.12
//        2 32 194.57
//        3 34 521.92
//        4 37 017.51
//        5 39 693.51
//        6 42 562.95