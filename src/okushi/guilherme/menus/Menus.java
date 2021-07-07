package okushi.guilherme.menus;

import java.util.Scanner;

/**
 * Class that represents the Menu element
 */
public class Menus {
    private Scanner scanner;

    /**
     * Returns the user option from the Menu
     * @param id ID of the user
     * @param name Name of the user
     * @return
     */
    public int menuSystem(String id,String name){
        int option;
        scanner = new Scanner(System.in);
        System.out.println("############## Welcome to the BankSys #############");
        System.out.println("User: " + name + "\t" + "id: " + id);
        System.out.println("Select one of the options below");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Previous transaction");
        System.out.println("0 - Exit");
        System.out.println("Insert your option: ");
        option = scanner.nextInt();
        System.out.println("\n");
        return option;
    }
}
