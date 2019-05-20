package net.greet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassA {
    public static void main(String[] args){
        ClassB classB = new ClassB();
        Scanner scanner = new Scanner(System.in);
//        Class2 class2 = new Class2(scanner.nextLine());
//        class2.getCount_words();



            try {

                while (true){
                    System.out.println("pv\t--> future investment\ni\t--> investment rate\nn\t--> number of years");
                    System.out.println("please enter pv i n  \n");
                    double investmentAmount = scanner.nextDouble();
                    double monthlyIntrestRAte =scanner.nextDouble();
                    int years = scanner.nextInt();
                    System.out.println("investment amount: R"+ investmentAmount +"\ninterest rate: "+ monthlyIntrestRAte+"%"+"\nnumber of years: "+ years);
                    classB.futureInvestmentValue(investmentAmount, monthlyIntrestRAte,years);
                }
                    }catch (InputMismatchException e){
                        System.out.println("make sure you enter valid Numbers\n"+ e);
            }
    }
}
//        A get method named count_words(String str)

//        1 30 024.12
//        2 32 194.57
//        3 34 521.92
//        4 37 017.51
//        5 39 693.51
//        6 42 562.95