package day01;

import java.util.Iterator;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
	System.out.println("1부터 n까지의 합은 " + sum);
	
	
		double sum2 = 0;
		sum2 = (1 + n) * (n/2.0);
		System.out.println("1부터 n까지의 합은 " + (int)sum2);
		
	}

}
