package net.greet;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClassB {

    public void futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int years){

        try {
            for (int i = 1; i <=years;i++ ){
                monthlyInterestRate = monthlyInterestRate/100d;
                double totalInterest = investmentAmount * Math.pow((1 + monthlyInterestRate/12), years*12);
                double roundedValue = new BigDecimal(totalInterest).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
                System.out.println(i + " "+ roundedValue);

            }

        }catch (Exception e){
            System.out.println("Make sure you follow the correct sequence pv i n");
        }

    }
}

//        1 30024.12
//        2 32194.57
//        3 34521.92
//        4 37017.51
//        5 39693.51
//        6 42562.95
