import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result = s.nextInt();
        for (int i = 1; i <= result; i++) {
            int a = s.nextInt();
            int b = s.nextInt(); 
            String c = "Case #" + i;
            System.out.println(c+ ": " + (a + b));
        }

    }

}
