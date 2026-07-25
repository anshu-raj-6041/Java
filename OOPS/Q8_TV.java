package OOPS;
// void me return nhi hota hai

class Tv {
    // Properties
    public String name;
    public int channelNo;
    public int vol;

    // Methods
    public void switchOn() {
        
    }
    public void switchOff() {

    }
    public void changeChannel() {

    }
    public void increaseVol() {
        System.out.println("Increase the volume");

    }
}

public class Q8_TV {
    public static void main(String[] args) {
        // Object creation
        Tv t1 = new Tv();

        t1.name = "Samsung";

        t1.increaseVol();

    }

}
