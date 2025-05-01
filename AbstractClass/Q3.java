package AbstractClass;

abstract class KFC {
    public KFC() {
        System.out.println("KFC");

    }

    public void makeItem() {
        System.out.println("Make with chicken");

    }

    abstract public void billing();

    abstract public void offer();
}

class MyKFC extends KFC {
    public MyKFC() {
        System.out.println("MyKFC");

    }

    public void billing() {
        System.out.println("Billing => MyKFC");
    }

    public void offer() {
        System.out.println("Offer => MyKFC");
    }

    public void festiveOffer() {
        System.out.println("festiveOffer => MyKFC");
    }
}

public class Q3 {
    public static void main(String[] args) {
        KFC K1 = new MyKFC();
        K1.billing();
        K1.makeItem();

    }

}
