package day01;

import java.util.Iterator;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
	System.out.println("1���� n������ ���� " + sum);
	
	
		double sum2 = 0;
		sum2 = (1 + n) * (n/2.0);
		System.out.println("1���� n������ ���� " + (int)sum2);
		
	}

}
