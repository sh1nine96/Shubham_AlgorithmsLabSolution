package com.gl.javafsd.paymoney.transaction;

import java.util.Scanner;

public class PayMoneyTransactionUI {
    private Scanner input;

    public  PayMoneyTransactionUI(){
        input = new Scanner(System.in);
    }
    public void init(){
        gatherInputsAndProcess();
    }

    private void gatherInputsAndProcess(){
        System.out.println("Enter the size of transaction array :");
        int transactionArraySize = input.nextInt();
        int[] transactions = new int[transactionArraySize];

        System.out.println("Enter the transaction array element(s): ");
        for(int i = 0; i < transactionArraySize; i++){
            transactions[i] = input.nextInt();
            input.nextLine();
        }
        System.out.println("Enter the number of transaction(instances) to be achieved");
        int transactionInstanceSize = input.nextInt();
        input.nextLine();

        for(int i = 1; i<= transactionInstanceSize; i++){
           // System.out.println();
            System.out.println("Enter the transaction/target Value :");
            int dailyTarget = input.nextInt();

            input.nextLine();

            System.out.println("Processing transaction with value -> " + dailyTarget);

            TargetAchievementCalculator calculator = new TargetAchievementCalculator(transactions, dailyTarget);
            calculator.calculate();

            calculator.printOutCome();
        }
    }

}
