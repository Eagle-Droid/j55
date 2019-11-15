public class bucle {
    public static void main(String[] args) {
        int money = 0;
        int chocolates = 0;
        int chocolatePrice = 1;
       do {
            chocolates++;
            money -= chocolatePrice;
        }while(money > chocolatePrice);
        System.out.println("I have " + chocolates + " chocolates");
    }
}
