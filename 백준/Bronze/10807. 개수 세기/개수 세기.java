import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int []arr = new int[num]; // 배열 지정 
        for (int i = 0; i < num; i++) {
                arr[i] = s.nextInt();
        }
        int count=0;
        int num1 = s.nextInt();
        for (int i = 0; i < num; i++) {
            if(arr[i]==num1){
                count++;

            }
        }
        System.out.println(count);
    }
}

