import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int price = s.nextInt(); // 총 금액
        int thing = s.nextInt(); // 물건 개수
        int sum = 0;
        for (int i = 0; i < thing; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            sum += a * b;
        }
        if (sum == price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}