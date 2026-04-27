import java.util.Date;

public class App {
    static int unusedField = 0;

    public static void main(String[] args) {
        Date date = new Date(2024, 1, 1);
        int a = Integer.parseInt(args[0].trim());
        int b = Integer.parseInt(args[1].trim());
        System.out.println("Somme = " + (a + b));
        System.out.println("Produit = " + (a * b));
    }
}
