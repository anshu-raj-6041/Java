package Interface;

class Phone {
    public void call() {
        System.out.println("Phone call");
    }

    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface ICamera {
    void click();
    void record();

}

interface IMusicPlayer {
    void play();
    void stop();

}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void videoCall() {
        System.out.println("Video Call");
    }

    public void click() {
        System.out.println("Click");
    }

    public void record() {
        System.out.println("Record");
    }

    public void play() {
        System.out.println("Play");
    }

    public void stop() {
        System.out.println("Stop");
    }
}

public class Q2 {
    public static void main(String[] args) {
        // jiska ref hoga whi call hoga
        // SmartPhone S1 = new SmartPhone();
        // S1.click();
        // S1.play();

        // Phone S1 = new SmartPhone();
        // S1.call();

        // ICamera S1 = new SmartPhone();
        // S1.click();
        // S1.record();

        IMusicPlayer S1 = new SmartPhone();
        S1.play();

    }

}
