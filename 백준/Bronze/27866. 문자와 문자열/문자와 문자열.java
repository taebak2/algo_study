import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 수험번호, 시험장소 숫자6,문자1

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int b = sc.nextInt();

        System.out.println(A.charAt(b-1));

    }

}
