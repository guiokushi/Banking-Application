package okushi.guilherme.controllers;

import okushi.guilherme.menus.Menus;



public class BankSystem {
    Menus menus = new Menus();
    public BankSystem() {
    }

    public void run(){
        int option;
        do {
            option = menus.menuSystem();
            switch (option){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    java.lang.System.out.println("Invalid input, try again!");
            }
        }while (option != 0);
    }
}
