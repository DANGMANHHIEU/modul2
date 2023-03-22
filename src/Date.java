import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang");
        int month = scanner.nextInt();
        switch (month) {
            case 2 -> System.out.println("28 hoac 29 ngay");
            case 1, 3, 5, 7, 8, 12 -> System.out.println("thang" + month + "co 31 ngay");
            case 4, 6, 9, 10, 11 -> System.out.println("thang" + month + "co 30 ngay");
        }

    }
}
