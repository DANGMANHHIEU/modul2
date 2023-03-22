import java.util.Scanner;

public class usd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter usd ");
        float Usd = scanner.nextFloat();
        float Vnd = Usd * 23000;
        System.out.printf("%f VND",Vnd);

    }
}
