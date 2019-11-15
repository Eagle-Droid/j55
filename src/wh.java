public class wh {
    public static void main(String[] args) {
        int w=10,h=20;
        for (int i = 0; i <w ; i++) {
            for (int j = 0; j <h ; j++) {
                if(i==0 || i==9 || j==0 || j==19) System.out.print("#");
                else System.out.print("0");

            }
            System.out.println();
        }

        }
    }

