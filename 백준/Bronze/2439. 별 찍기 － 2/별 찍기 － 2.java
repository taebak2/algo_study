import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int star = s.nextInt(); // int 선언
        for (int i = 0; i < star; i++) { // 총 5줄 
            for (int j = star; j-1>i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
