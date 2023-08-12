import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            String pr = s.next();
            System.out.print(pr.charAt(0));
            System.out.println(pr.charAt(pr.length()-1));
        }

    }
}

