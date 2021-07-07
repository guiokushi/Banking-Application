package okushi.guilherme.controllers;

/**
 * Class that represents the Account element
 */
public class Account {
    private int balance;
    private int previousTrasaction;
    private String clientID;
    private String clientName;

    /**
     * Constructor for the account class
     * @param clientID Id of the client
     * @param clientName Name of the client
     */
    public Account(String clientID, String clientName) {
        this.clientID = clientID;
        this.clientName = clientName;
    }

    /**
     * Shows the client balance
     */
    public void balance(){
        System.out.println("Your balance is: " + this.balance);
    }

    /**
     * Executes the withdraw function
     * @param amount Amount to be withdrawn
     */
    public void withdraw(int amount){
        if(this.balance > 0){
            this.balance -= amount;
            System.out.println("Operation successful");
            previousTrasaction = -amount;
        }else {
            System.out.println("Your balance is too low!");
        }
    }

    /**
     * Executes the deposit function
     * @param amount Amount to be deposited
     */
    public void deposit(int amount){
        this.balance += amount;
        this.previousTrasaction = amount;
        System.out.println("Operation successful");
    }

    /**
     * Show the previous transaction of the account
     */
    public void previousTransaction(){
        if (previousTrasaction > 0){
            System.out.println("Deposited: " + previousTrasaction);
        }else if (previousTrasaction < 0){
            System.out.println("Withdrawn: " +Math.abs(previousTrasaction));
        }else {
            System.out.println("No transaction occured");
        }
    }

}
