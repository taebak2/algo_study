import java.util.Scanner;
public class Main {
    public static void main(String[] args){
           Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if(x>0 & y>0){
            System.out.println("1");
        }
        if(x<0 & y>0){ 
            System.out.println("2");
        }
        if(x>0 & y<0){
            System.out.println("4");
        }
        if(x<0 & y<0){
            System.out.println("3");
        }
    }
}
