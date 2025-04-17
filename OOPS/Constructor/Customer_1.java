package OOPS.Constructor;

class Customer {
    // Properties
    private String cusId;
    private String name;
    private String address;
    private String phNO;

    // Constructor

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
        return phNO;
    }
    // setter
    public void setAddress(String add) {
        add = address;
    }
    public void setPhNo(String pn) {
        pn = phNO;
    }
}

public class Customer_1 {
    public static void main(String[] args) {
        Customer C1 = new Customer();

    }

}
