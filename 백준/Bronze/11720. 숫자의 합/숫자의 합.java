import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        String sn = s.next();
        s.close();

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum+=sn.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}

