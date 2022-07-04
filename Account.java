// Name : Retaj Tayib Alansari
// Email : Ralansari.stu@uj.edu.sa
// Course Nunmber : 121
// Section Number : A2
// Assignment title : Bank Account System
// Date : 15 April 2020
package Assignment02;

public class Account {

    private String AccountType;
    private String name;
    private double amount;
    private long ID = 3000;
    private static long count;

    public Account(String AccountType, String name, double amount) {
        // Input validation
        if (amount < 0.0) {
            throw new IllegalArgumentException(
                    "Ammount must be > 0.0");
        }

        this.AccountType = AccountType;
        this.name = name;
        this.amount = amount;
        this.ID = ID + count++;
    }

    public void deposit(double amount) {
        this.amount += amount;
    }

    public String getName() {
        return name;
    }

    public String getAccountType() {
        return AccountType;
    }

    public double getAmount() {

        return amount;
    }

    public long getID() {
        return ID;

    }

    public void setAmount(double amount) {
        if (amount < 0.0) {
            throw new IllegalArgumentException(
                    "Ammount must be > 0.0");
        }
        this.amount = amount;
    }

    public void printInfo() {
        System.out.printf("Name: %s%nID: %d%nAccount Type: %s%nAmmount: %d$%n ", getName(), getID(),
                getAccountType(), (int) getAmount());
    }

}
