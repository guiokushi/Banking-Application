package okushi.guilherme.controllers;

import okushi.guilherme.menus.Menus;
import java.util.Scanner;

/**
 * Main system for the application
 */
public class BankSystem {
    Menus menus;
    Account account;
    Scanner scanner;

    /**
     * Constructor for the BankSystem
     */
    public BankSystem() {
        menus = new Menus();
        scanner = new Scanner(System.in);
    }

    /**
     * Keeps the application running, while managing the system
     */
    public void run(){
        int option;
        int amount;
        System.out.println("Insert your name: ");
        String name = scanner.nextLine();
        System.out.println("Insert your ID: ");
        String ID = scanner.nextLine();
        account = new Account(ID,name);
        do {
            option = menus.menuSystem(ID,name);
            switch (option){
                case 0:
                    break;
                case 1:
                    account.balance();
                    break;
                case 2:
                    System.out.println("How much do you want to deposit?");
                    amount = scanner.nextInt();
                    account.deposit(amount);
                    break;
                case 3:
                    System.out.println("How much do you want to withdraw?");
                    amount = scanner.nextInt();
                    account.withdraw(amount);
                    break;
                case 4:
                    account.previousTransaction();
                    break;
                default:
                    java.lang.System.out.println("Invalid input, try again!");
            }
        }while (option != 0);
        System.out.println("Thank you for using our services!");
    }
}
