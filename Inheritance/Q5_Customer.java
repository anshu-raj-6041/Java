package Inheritance;

// 121
// Parent class/ Super class
class Customer {
    // Properties
    public int phNo;
    public String name;

    // Methods
    public void payBill() {
        System.out.println("Pay Bill");
    }

}

// Child class/ Sub Class
class Member extends Customer {
    public int cusId;
    public String address;
    public String dob;

    public void callBack() {
        System.out.println("Call Back");
    }

}

public class Q5_Customer {
    public static void main(String[] args) {
        Member m1 = new Member();

    }

}
