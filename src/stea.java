package src;

public class stea {
    public static void main(String[] args) {
        int poz;
        for (poz=0;poz<80;poz++){

            System.out.print("\r");
            for (int i = 0; i <poz ; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
