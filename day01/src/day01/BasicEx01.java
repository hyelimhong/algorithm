package day01;

import java.util.Scanner;

public class BasicEx01 {

	public static void main(String[] args) {
		System.out.println("�� ������ �ִ밪�� ���մϴ�.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a�� ��: ");
		int a = sc.nextInt();
		
		System.out.println("b�� ��: ");
		int b = sc.nextInt();
		
		System.out.println("c�� ��: ");
		int c = sc.nextInt();
		
		int min = a;
		
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		System.out.println("�ּҰ��� " + min + "�Դϴ�.");
		
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
		System.out.println("�߾Ӱ��� " + mid + "�Դϴ�.");
	}

}
