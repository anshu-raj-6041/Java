package Interface;
// callBack method with the help of interface

class Store {
    Member mem[] = new Member[100];
    int count = 0;

    void register(Member m) {
        mem[count++] = m;
    }
    void inviteSale() {
        for(int i=0; i<count; i++) {
            mem[i].callBack();
        }
    }
}

interface Member {
    void callBack();
}

class Customer implements Member {
    String name;
    Customer(String n) {
        name = n;
    }

    @Override
    public void callBack() {
        System.out.println("Ok, I will visit");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Store S1 = new Store();

        Customer C1 = new Customer("Modi");
        Customer C2 = new Customer("Alakh");

        S1.register(C1);
        S1.register(C2);
        S1.inviteSale();
        
    }
    
}
