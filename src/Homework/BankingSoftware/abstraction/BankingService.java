package Homework.BankingSoftware.abstraction;
// banking interface define banking operations

public interface BankingService {
    void deposit(Double cashAmount);
    void withdrawal(Double cashAmount);
    void showBalance();
    //
    void convertDollarToRiel(Double dollar);
    void convertRielToDollar(Double riel);
    //
    void displayWelcomeMessage();
}
