import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x +b =c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        double a = scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();
        if(a != 0){
            double answer = (c-b)/a ;
            System.out.println("ket qua" + answer);
        }
        else {
            if(b==c){
                System.out.println("vo so nghiem");
            }
            else {
                System.out.println("vo nghiem1");
            }
        }

    }
}
