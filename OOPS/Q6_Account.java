package OOPS;
// jb properties private hoga tb getter setter use krna hai

class Account {
    // Properties
    public long accNo;
    public String name;
    public double balance;

    // Methods
    public void deposit(int amountD) {
        System.out.println(amountD + " Amount Deposited");

    }

    public void withdraw(int amountW) {
        System.out.println(amountW + " Amount withdraw");

    }
}

public class Q6_Account {
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.deposit(500);
        a1.withdraw(100);

    }

}
