import java.util.Scanner;

public class numbertext {
    // ham tu 0 den 19
    public static final String[] oneToNineteen = { "", "One", "Two", "Three", "Four", "five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    // ham tu 20 den 90
    public static final String[] twentyToNinety = { "", //0
            "", //1
            "Twenty",  // 20
            "Thirty",  // 30
            "Forty",   // 40
            "Fifty",   // 50
            "Sixty",   // 60
            "Seventy", // 70
            "Eighty",  // 80
            "Ninety" };  // 90
    // ham tach phan nguyen va phan du cua 2 mang
    public static String numberToText(int number){
        if(number <0){
            return "da nhap gia tri am";
        }
        if(number<20){
            return oneToNineteen[number];
        }
        if(number<100){
            return twentyToNinety[number/10]+ " "+oneToNineteen[number%10];
        }
        if(number<1000){
            return oneToNineteen[number/100]+ " hundred " + numberToText(number%100);
        }
        return "ko doc >=1000";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("so can doc");
        int n = scanner.nextInt();
        System.out.println(numberToText(n));
    }
}
