import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int hour = s.nextInt(); // 0 ~ 23
		int minute = s.nextInt(); // 0 ~ 59 
		int time = s.nextInt(); // 0 ~ 1000 , ex 80 = 1: 20, 140 = 2: 20
		
		minute +=time;
		hour += minute/60;
		minute %= 60;
		hour %= 24;
		
		System.out.println(hour+" "+ minute);}
}

