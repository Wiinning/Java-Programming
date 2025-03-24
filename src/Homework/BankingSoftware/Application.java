package Homework.BankingSoftware;
// Runs the program and tests the account operations

import Homework.BankingSoftware.model.Account;

public class Application {
    public static void main(String[] args) {

        Account savingAccount = new Account("Testing");
        savingAccount.displayWelcomeMessage();
        savingAccount.deposit(10.2);
        savingAccount.withdrawal(5.2);
        savingAccount.showBalance();
        savingAccount.viewTransactionHistory();
        System.out.println("\n" + "=".repeat(40) + "\n");

        Account creditCardAccount = new Account ("CreditCard");
        creditCardAccount.displayWelcomeMessage();
        creditCardAccount.viewTransactionHistory();
        creditCardAccount.showBalance();

    }
}
