// Name : Retaj Tayib Alansari
// Email : Ralansari.stu@uj.edu.sa
// Course Nunmber : 121
// Section Number : A2
// Assignment title : Bank Account System
// Date : 15 April 2020
package Assignment02;

public class CheckingAccount extends Account {

    private String CardNo;

    public CheckingAccount(String AccountType, String name, double amount, String CardNo) {
        super(AccountType, name, amount);
        this.CardNo = CardNo;
    }

    public void withdraw(double amount) {
        setAmount(getAmount() - amount);

    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public String getCardNo() {
        return CardNo;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("CardNo: %s%n", getCardNo());
    }

}
