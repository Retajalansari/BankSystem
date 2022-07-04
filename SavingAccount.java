// Name : Retaj Tayib Alansari
// Email : Ralansari.stu@uj.edu.sa
// Course Nunmber : 121
// Section Number : A2
// Assignment title : Bank Account System
// Date : 15 April 2020
package Assignment02;

public class SavingAccount extends Account {

    private String SerialNo;

    public SavingAccount(String AccountType, String name, double amount, String SerialNo) {
        super(AccountType, name, amount);
        this.SerialNo = SerialNo;

    }

    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    public String getSerialNo() {
        return SerialNo;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Serial: %s%n", getSerialNo());
    }

}
