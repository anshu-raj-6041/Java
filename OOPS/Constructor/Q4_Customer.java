package OOPS.Constructor;

class Customer {
    // Properties
    private String cusId;
    private String name;
    private String address;
    private String phNo;

    // Constructor
    public Customer() {
        cusId = "A24";
        name = "Anshu";
    }
    public Customer(String cId, String n) {
        cusId = cId;
        name = n;
    }
    public Customer(String cId, String n, String add, String p) {
        cusId = cId;
        name = n;
        address = add;
        phNo = p;
    }

    // property methods
    // getter
    public String getCusId() {
        return cusId;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhNo() {
        return phNo;
    }
    // setter (always void hota hai)
    public void setAddress(String add) {
        address = add;
    }
    public void setPhNo(String pn) {
        phNo = pn;
    }
}

public class Q4_Customer {
    public static void main(String[] args) {
        // object creation
        Customer C1 = new Customer();

    }

}
