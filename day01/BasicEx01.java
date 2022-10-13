package day01;

import java.util.Scanner;

public class BasicEx01 {

	public static void main(String[] args) {
		System.out.println("세 정수의 최대값을 구합니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값: ");
		int a = sc.nextInt();
		
		System.out.println("b의 값: ");
		int b = sc.nextInt();
		
		System.out.println("c의 값: ");
		int c = sc.nextInt();
		
		int min = a;
		
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		System.out.println("최소값은 " + min + "입니다.");
		
		int mid;
		
		if (a>=b)
			if (a>=b)
					mid=b;
			else if(a<=c)
					mid=a;
			else
					mid=c;
		else if(a>c)
			mid = a;
		else if(b>c)
			mid = c;
		else 
			mid = b;
		System.out.println("중앙값은 " + mid + "입니다.");
	}

}
