import java.sql.SQLOutput;
import java.util.Scanner;
public class tablaInmultirii {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i= in.nextInt();
        for (int j = 0; j <10 ; j++) {
            System.out.println(j + " X " + i + " = "+ i*j);

        }
    }
}
