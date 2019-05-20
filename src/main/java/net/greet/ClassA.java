package net.greet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassA {
    public static void main(String[] args){
        ClassB classB = new ClassB();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("pv\t--> future investment\ni\t--> investment rate\nn\t--> number of years");
            System.out.println("please enter pv i n  \n");
            double investmentAmount = scanner.nextDouble();
            double monthlyIntrestRAte =scanner.nextDouble();
            int years = scanner.nextInt();
            System.out.println("investment amount: R"+ investmentAmount +"\ninterest rate: "+ monthlyIntrestRAte+"%"+"\nnumber of years: "+ years);

            classB.futureInvestmentValue(investmentAmount, monthlyIntrestRAte,years);
        }
    }
}
//        A get method named count_words(String str)
//        Years Future Value
//        1 30 024.12
//        2 32 194.57
//        3 34 521.92
//        4 37 017.51
//        5 39 693.51
//        6 42 562.95