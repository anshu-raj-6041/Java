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

    public double getbalance() {
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

class savingAc extends Account {
    // Properties
    public double deposit;
    public double withdraw;
    public double FD;

    public savingAc(int accNo, String name, String address, int phNo, String dob) {
        super(accNo, name, address, phNo, dob);
    }

}

// Child class/ sub Class
class loanAc extends Account {
    public double payEMI;
    public double topUpLoan;

    public loanAc(int accNo, String name, String address, int phNo, String dob) {
        super(accNo, name, address, phNo, dob);
    }

}

public class Q3_Account {
    public static void main(String[] args) {
        Account A1 = new Account(420, "Modi", "Gujarat", 9085, "17-09-1950");

    }

}
