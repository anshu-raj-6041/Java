package Inheritance;

class Account {
    // Properties
    private int accNo;
    private String name;
    private String address;
    private int phNo;
    private String dob;
    private double balance;

    // Property Methods
    // getter
    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAd() {
        return address;
    }

    public int getPhNo() {
        return phNo;
    }

    public String getDOB() {
        return dob;
    }

    public double getBalance() {
        return balance;
    }

    // setter
    // public void setData(int accNo, String name, String dob) {
    // this.accNo = accNo;
    // this.name = name;
    // this.dob = dob;
    // }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    // Constructor
    public Account(int accNo, String name, String address, int phNo, String dob) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phNo = phNo;
        this.dob = dob;

    }
}

class SavingAc extends Account {
    // Properties
    // public double deposit;
    // public double withdraw;
    // public double FD;

    // Constructor
    public SavingAc(int accNo, String name, String address, int phNo, String dob) {
        super(accNo, name, address, phNo, dob);
    }

    public void deposit() {
        System.out.println("Money Deposit");
    }

    public void withdraw() {
        System.out.println("Money Withdraw");
    }

}

// Child class/ sub Class
class LoanAc extends Account {
    // public double payEMI;
    // public double topUpLoan;

    public LoanAc(int accNo, String name, String address, int phNo, String dob) {
        super(accNo, name, address, phNo, dob);
    }

    public void Account() {
        System.out.println("PayEMI");
    }

}

public class Q3_Account {
    public static void main(String[] args) {
        Account a1 = new Account(420, "Modi", "Gujarat", 9085, "17-09-1950");

    }

}
