import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean[] isAttended = new boolean[31]; // 1부터 30까지의 학생 번호를 나타내는 배열

        for (int i = 0; i < 28; i++) {
            int studentNumber = s.nextInt();
            isAttended[studentNumber] = true; 
        }

        for (int i = 1; i <= 30; i++) {
            if (!isAttended[i]) {
                System.out.println(i);
            }
        }
    }
}
