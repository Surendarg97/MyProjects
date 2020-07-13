package com.company;

import java.util.Scanner;

public class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String customerID;
    Scanner scanner=new Scanner(System.in);

    public BankAccount(String customerName1, String customerID1) {
        customerName = customerName1;
        customerID = customerID1;
    }

    public void deposit(int amount){

        if(amount>0){
            balance=balance+amount;
            previousTransaction=amount;
        }else
            System.out.println("Please enter valid amount to do deposit");
    }

    public void withdrawal(int amount){

        if (amount>0){
            balance=balance-amount;
            previousTransaction=-amount;
        }else
            System.out.println("Please enter valid amount to do withdrawal");
    }

    public void getPreviousTransaction(){

        if(previousTransaction>0){
            System.out.println("Amount deposited : "+previousTransaction);
        }else if(previousTransaction<0){
            System.out.println("Amount withdrawn : "+Math.abs(previousTransaction));
        }else
            System.out.println("No transaction occurred");
    }

    public void showMenu(){

        char option;
        int amount;

        System.out.println("Welcome "+ customerName+" to the jana bank and Your ID is "+customerID);
        System.out.println("\n");
        System.out.println("****************************************************");
        System.out.println("A.To check balance");
        System.out.println("B.To deposit amount");
        System.out.println("C.To withdraw amount");
        System.out.println("D.To check previous transaction");
        System.out.println("E.To exit");
        System.out.println("****************************************************");

        do {
            System.out.println("Please select your option");
            option = scanner.next().charAt(0);

            switch (option){
                case 'A':
                    System.out.println("Selected option is : " + option+" and the balance is "+balance);
                    break;
                case 'B':
                    System.out.println("Selected option is : " + option+" and the please enter the amount to deposit ");
                    amount=scanner.nextInt();
                    deposit(amount);
                    System.out.println(amount+" is deposited to your account");
                    break;
                case 'C':
                    System.out.println("Selected option is : " + option+" and the please enter the amount to withdraw ");
                    amount=scanner.nextInt();
                    withdrawal(amount);
                    System.out.println(amount+" is withdrawn from your account");
                    break;
                case 'D':
                    getPreviousTransaction();
                    break;
                case 'E':
                    System.out.println("****************************************************");
                    break;
            }
        }while(option!='E');


        System.out.println("Thanks for using jana bank atm");

    }



}
