package Homework.BankingSoftware.model;
// implements banking service and provides account functionality

import Homework.BankingSoftware.abstraction.BankingService;

import java.util.ArrayList;
import java.util.List;

public class Account implements BankingService {
    private String accountName;
    private Double balance = 0.0;
    private List<String> transactionHistory = new ArrayList<>();

    public Account (String accountName){
        this.accountName= accountName;
    }
@Override
    public void deposit (Double cashAmount){
        if(cashAmount<0){
            System.out.println("Invalid Amount");
        }else{
            balance+=cashAmount;
            System.out.println( accountName);
            System.out.println("Amount: " + cashAmount + " has been deposited.");
            System.out.println("Current Balance: " + balance);
            System.out.println("Thank you for using our service!");
        }
    }
@Override
    public void withdrawal (Double cashAmount){
        if(cashAmount> balance){
            System.out.println("Insufficient Balance!");
        }else{
            balance-=cashAmount;

            System.out.println(accountName);
            System.out.println("Amount: " + cashAmount + " has been withdrawn from account " + accountName);
            System.out.println("Current Balance: " + balance);
        }
    }
@Override
    public void showBalance(){
        System.out.println("-".repeat(20));
        System.out.println( " Remaining Balance: " + balance);
    }
    public void viewTransactionHistory(){
        System.out.println("-".repeat(20));
        System.out.println("View Transactions for account " + accountName);
        if(transactionHistory.isEmpty()){
            System.out.println("No Transactions yet.");
        }else{
            for (String transaction : transactionHistory){
                System.out.println(transaction);
            }
        }
    }
    public void displayWelcomeMessage(){
        System.out.println("Welcome To Banking Service!");
        System.out.println();
    }
@Override
    public void convertDollarToRiel(Double dollar){
        Double result = dollar * 4000;
    System.out.println(dollar + " USD = " + result + " Riel");
    }
    @Override
    public void convertRielToDollar(Double riel){
        Double result = (riel/4000);
        System.out.println(riel + " Riel = " + result + " USD");
    }


}
