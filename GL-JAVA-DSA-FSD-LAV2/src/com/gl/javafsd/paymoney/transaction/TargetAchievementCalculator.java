package com.gl.javafsd.paymoney.transaction;
import com.gl.javafsd.common.DataStructureUtils;
import java.util.Arrays;

public class TargetAchievementCalculator {
    private final int[] transactions;
    private final int dailyTarget;
    private boolean dailyTargetAchieved;
    private int transactionCounter;

    public TargetAchievementCalculator(int[] transactions, int dailyTarget){
        this.transactions = transactions;
        this.dailyTarget = dailyTarget;
        this.dailyTargetAchieved = false;
        this.transactionCounter = 0;
    }

    public  void calculate(){
        int tempCounter = 0;

        for(int i = 0; i < transactions.length; i++){
            int targetValue = transactions[i];
            tempCounter = tempCounter + targetValue;

            transactionCounter++;

            if(tempCounter >= dailyTarget){
                dailyTargetAchieved = true;
                break;
            }
        }
    }

    public void printOutCome() {
        if (dailyTargetAchieved) {
            System.out.println("Daily target of [" + dailyTarget + "] achieved after [" + transactionCounter + "] transactions");
        } else {
            System.out.println("Daily target of [" + dailyTarget + "] yet to be achieved");
        }
    }

    public static void main(String[] args) {

        test(new int[]{20, 12, 31}, 21);
       // System.out.println("Result of Test Case1 for target1 is above");

        test(new int[]{20,12,31}, 19);
       // System.out.println("Result of Test Case1 for target2 is above");

        test(new int[]{100},101);
       // System.out.println("Result of Test Case2 is above");
    }

    private static void test(int[] transactions, int dailyTarget) {
        System.out.println("****************************");

        TargetAchievementCalculator calculator = new TargetAchievementCalculator(transactions, dailyTarget);
        DataStructureUtils.print(transactions);
      //  System.out.println(Arrays.toString(transactions));
        calculator.calculate();
        calculator.printOutCome();

    }
}
