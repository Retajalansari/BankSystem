// Name : Retaj Tayib Alansari
// Email : Ralansari.stu@uj.edu.sa
// Course Nunmber : 121
// Section Number : A2
// Assignment title : Bank Account System
// Date : 15 April 2020
package Assignment02;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApplication {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Creating a saving account for "Ahmad" with 10,000$
        Account Ahmed = new SavingAccount("Saving", "Ahmed", 10000, "43");
        // Print account info of "Ahmed"
        Ahmed.printInfo();
        System.out.printf("\n=====================================\n");
        // Deposit 50000 to ahmad account
        Ahmed.deposit(50000);
        // Print account info After depositing
        System.out.printf("Account Information after depositing:50000 %n");
        Ahmed.printInfo();
        System.out.printf("\n=====================================\n");
        // Creating a checking account for "Ali" with 20,000$
        Account Ali = new CheckingAccount("Checking", "Ali", 20000, "0021");
        // Creating a checking account for "Mona" with 15,000$
        Account Mona = new CheckingAccount("Checking", "Mona", 15000, "0033");
        // Printing the information of the checking account of Ali
        Ali.printInfo();
        System.out.printf("%s%n", "\n=====================================\n");
        // Deposite 70000 to Ali account 
        Ali.deposit(70000);
        // Print account info After depositing
        System.out.printf("Account Information after depositing:70000 %n");
        Ali.printInfo();
        System.out.printf("\n=====================================\n");
        // Withdraw(3000) from Ali account
        ((CheckingAccount) Ali).withdraw(3000);
        // Print account info After withdrawal
        System.out.printf("Account Information after withdrawl:3000 %n");
        Ali.printInfo();
        System.out.printf("\n=====================================\n");
        // Printing the information of the saving account
        Ahmed.printInfo();
        System.out.printf("\n=====================================\n");
        // Create an ArrayList of Account
        ArrayList<Account> Array = new ArrayList<>();
        // Add the accounts of Ahmad, Ali and Mona to the ArrayList
        Array.add(Ahmed);
        Array.add(Ali);
        Array.add(Mona);
        // Add a new SavingsAccount object for "Lama" with an amount of 1500$ and serialNo 64 to the ArrayList
        Array.add(new SavingAccount("Saving", "Lama", 1500, "64"));
        // Add a new SavingsAccount object for “Amani” with an amount of 1500$ and serialNo 55 to the ArrayList
        Array.add(new SavingAccount("Saving", "Amani", 1500, "55"));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++\n"
                + "Printing Information for all Objects in the ArrayList:\n");
        // Print all objects in the ArrayList
        for (Account a : Array) {
            a.printInfo();
            System.out.printf("\n");

            // Withdraw 100$ from all checking accounts
            if (a.getAccountType().equals("Checking")) {
                ((CheckingAccount) a).withdraw(1000);
            }
        } // end for loop 
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++\n"
                + "=====================================\n");
        // Printing the information of the checking account after withdrawl 
        System.out.printf("Account Information after withdrawl:1000 %n");
        Ali.printInfo();
        System.out.printf("\n=====================================\n");
        System.out.printf("Account Information after withdrawl:1000 %n");
        Mona.printInfo();
        System.out.printf("\n=====================================\n");
        Availability(Array);
        Report(Array);
    }

    // Create Static method to check the availability of clients by its ID
    static void Availability(ArrayList<Account> Array) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        // Ask the user if he want check about the availability
        System.out.println("Do you want to check the availability of client ID? (y\\n)");
        char Answer = input.next().toLowerCase().charAt(0);
        // Input validation
        while (Answer != 'y' & Answer != 'n') {
            System.out.println("Try Again!!! input must be (y//n)");
            Answer = input.next().toLowerCase().charAt(0);
        }
        if (Answer == 'y') {
            System.out.println("Enter ID to check about availability:");
            long IDs = input.nextLong();
            // Input validation
            while (!(IDs == 3000) && !(IDs == 3001) && !(IDs == 3002)
                    && !(IDs == 3003) && !(IDs == 3004) && !(IDs == 3005)) {
                System.out.println("Enter ID to check about availability:");
                IDs = input.nextLong();
            } // end while loop
            for (int i = 0; i < Array.size(); i++) {
                if (Array.get(i).getID() == IDs) {
                    System.out.printf("This ID is found and its information as follow: %n");
                    (Array.get(i)).printInfo();
                    System.out.printf("\n=====================================\n");

                    break;
                }

            } // end for loop

        }
    }

    // Create Static method to make report about the clients depending on their account type
    static void Report(ArrayList<Account> Array) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        // Ask the user if he want to print the report or not.
        System.out.println("Do you want to make report about the clinets?(y\\n)");
        char Answer = input.next().toLowerCase().charAt(0);
        // Input validation
        while (Answer != 'y' & Answer != 'n') {
            System.out.println("Try Again!!! input must be (y//n)");
            Answer = input.next().toLowerCase().charAt(0);
        }
        if (Answer == 'y') {
            System.out.println("Which clints do you want to print!\n1- saving account clients\n"
                    + "2- chacking account clients");
            int choice = input.nextInt();
            // Input validation
            while (choice < 1 || choice > 2) {
                System.out.println("Try Again!!! input must be 1 or 2");
                System.out.println("Which clints do you want to print!\n1- Saving account clients\n"
                        + "2- Checking account clients");
                choice = input.nextInt();
            } // end while loop

            for (Account t : Array) {
                if (choice == 1) {
                    if (t.getAccountType().equals("Saving")) {
                        ((SavingAccount) t).printInfo();

                    }
                }
                if (choice == 2) {
                    if (t.getAccountType().equals("Checking")) {
                        ((CheckingAccount) t).printInfo();

                    }
                }

            } // end for loop

        }

    }
}
