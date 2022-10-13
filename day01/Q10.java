package day01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요 : ");
		
		int n = sc.nextInt();
		int cnt = 0; //나누기 10을 반복한 횟수를 구하느 ㄴ변수
		int o = n;
		while (n > 0) {
			n = n / 10; // n /= 10
			cnt++;
			
			
		}
		System.out.println("입력한 숫자는 " + o);
		System.out.println(cnt + 
				"자리 양의 정수입니다. ");
		//=============================================================
		Scanner sc2 = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요 : ");
		String s = sc.next();
		System.out.println("입력한 숫자는 " + s + "입니다.");
		System.out.println(s.length() + "자리 양의 정수 입니다.");
	
		//드모르간법칙
		boolean x =true, y = true;
		if (x && y) {
			System.out.println("참");
		} 
		if ( !(!x || !y)) {
			System.out.println("참");
		}		
	}

}
