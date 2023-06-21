import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            String B = s.next();

            s.close();

            System.out.println(a * (B.charAt(2)-'0'));
            System.out.println(a * (B.charAt(1)-'0'));
            System.out.println(a * (B.charAt(0)-'0'));
            System.out.println(a * Integer.parseInt(B));


        }


    }

}
