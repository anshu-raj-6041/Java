package OOPS;

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
        Account A1 = new Account();

        A1.deposit(500);
        A1.withdraw(100);

    }

}
