import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		
			// 직사각형 좌표 찾는 방법.. 
			// 좌표가 1번만 나온것을 출력하면된다..
			// 1. 입력 3번을 받음
			// 출력에 1번만 입력된 숫자를 각각 출력 
			// x 좌표 : a,c,e  if a=b c출력, a=c b출력,  b=c 랑 같으면 a출력 
			// y 좌표 : b,d,f if d=e f출력, d=f e출력, e=f d출력
		
		int a = s.nextInt();
		int d = s.nextInt();
		int b = s.nextInt();
		int e = s.nextInt();
		int c = s.nextInt();
		int f = s.nextInt();
	
		
		if(a==b) {
			System.out.print(c + " ");
		}
		else if(a==c) {
			System.out.print(b + " ");
		}
		else if(b==c) {
			System.out.print(a + " ");
		}
		
		
		if (d==e) {
			System.out.print(f);
		}
		else if(d==f) {
			System.out.print(e);
		}
		else if(e==f) {
			System.out.print(d);
		}
		
		
	}
}
