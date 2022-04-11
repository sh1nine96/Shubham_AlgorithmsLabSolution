package com.gl.javafsd.traveller.currencyspending;

import java.util.Scanner;

public class TravellerCurrencySpendingUI {
    private int[] denominations;
    private Scanner input;

    public TravellerCurrencySpendingUI(){
        input = new Scanner(System.in);
    }

    public void init(){
        gatherInputsAndProcess();
    }
    private  void gatherInputsAndProcess(){
        System.out.println("Enter the size of currency denominations");
        int denominationsArraySize = input.nextInt();
        denominations = new int[denominationsArraySize];

        System.out.println("Enter the currency denominations value(s) :");
        for(int index = 0; index < denominationsArraySize; index++){

            denominations[index] = input.nextInt();
            input.nextLine();
        }

        System.out.println("enter the pay amount: ");
        int payAmount = input.nextInt();

        CurrencyDenominationsDeterminator determinator = new CurrencyDenominationsDeterminator(denominations, payAmount);
        determinator.determine();
    }
}
