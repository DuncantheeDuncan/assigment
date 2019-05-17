package net.greet;

public class ClassA {
//    MUST BE INCLUDED
//    main method
//    object of classb
//    void method --name---

    public static void main(String[] args){

        ClassB classB = new ClassB();

double investment = 28000;
double mointhly =  7*0.01;
int years = 6;
// double answer = investment *Math.pow(1, mointhly) years *12;

        System.out.println(investment * Math.pow(1 + mointhly, years * 12)+" check 2");
        double full = investment * Math.pow((1 + mointhly/100),years );
        System.out.println(full + " check");


        float invest = (float)(investment * Math.pow(1 + mointhly,years));
        System.out.println(invest);
       double k = investment * Math.pow(1 + mointhly,years)  * 12;
        System.out.println(k + " k");


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