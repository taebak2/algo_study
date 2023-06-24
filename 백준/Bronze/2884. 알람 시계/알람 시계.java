import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

 Scanner s = new Scanner(System.in);

        int H = s.nextInt(); int M = s.nextInt();

        if (M < 45) {
            H -= 1; M+=15;
        } else {
            M -= 45;
        }
        if (H < 0) {
            H += 24;
        }
        System.out.println(H + " " + M);
    }

}


