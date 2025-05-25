package Lab.Lab_8;

public class Q3 {
    public static void main(String[] args) {
        int Math = 90;
        int OOPs = 100;
        int PSIR = 12;

        try {
            if(Math>100 || OOPs>100 || PSIR>100) {
                throw new Exception();
            }
            int r = (Math+OOPs+PSIR);
            System.out.println("Total => " + r);
        }
        catch(Exception e) {
            System.out.println("Invalid Marks");
        }
    }
    
}
