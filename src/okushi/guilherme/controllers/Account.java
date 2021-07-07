package okushi.guilherme.controllers;

public class Account {
    private int balance;
    private int previousTrasaction;
    private String clientID;
    private String clientName;

    public void balance(){
        System.out.println("Your balance is: " + this.balance);
    }

    void withdraw(int amount){
        if(this.balance > 0){
            this.balance -= amount;
            System.out.println("Operation successful");
            previousTrasaction = -amount;
        }else {
            System.out.println("Your balance is too low!");
        }
    }
    
    void deposit(int amount){
        this.balance += amount;
        this.previousTrasaction = amount;
        System.out.println("Operation successful");
    }

    void previousTransaction(){

    }

}
