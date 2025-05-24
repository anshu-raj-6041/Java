package OOPS;
// jb properties private hoga tb getter setter use krna hai

class Account {
    // Properties
    public long accNo;
    public String name;
    public double balance;

    // Methods
    public void deposit(int amount) {
        System.out.println(amount + " Amount Deposited");

    }

    public void withdraw(int amount) {
        System.out.println(amount + " Amount withdraw");

    }
}

public class Q6_Account {
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.deposit(500);
        a1.withdraw(100);

    }

}
