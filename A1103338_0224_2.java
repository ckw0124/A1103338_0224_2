import java.util.Scanner;

public class A1103338_0224_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("請輸入攝氏溫度：");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 5/9) + 32;
        
        System.out.printf("%.2f 攝氏溫度 = %.2f 華氏溫度", celsius, fahrenheit);
    }
}
