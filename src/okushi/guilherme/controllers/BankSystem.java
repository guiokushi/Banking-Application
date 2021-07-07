package okushi.guilherme.controllers;

import okushi.guilherme.menus.Menus;

import java.util.Scanner;


public class BankSystem {
    Menus menus;
    Account account;
    Scanner scanner;
    public BankSystem() {
        menus = new Menus();
        account = new Account();
        scanner = new Scanner(System.in);
    }

    public void run(){
        int option;
        int amount;
        do {
            option = menus.menuSystem();
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
