package day01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		
		int n = sc.nextInt();
		int cnt = 0; //������ 10�� �ݺ��� Ƚ���� ���ϴ� ������
		int o = n;
		while (n > 0) {
			n = n / 10; // n /= 10
			cnt++;
			
			
		}
		System.out.println("�Է��� ���ڴ� " + o);
		System.out.println(cnt + 
				"�ڸ� ���� �����Դϴ�. ");
		//=============================================================
		Scanner sc2 = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		String s = sc.next();
		System.out.println("�Է��� ���ڴ� " + s + "�Դϴ�.");
		System.out.println(s.length() + "�ڸ� ���� ���� �Դϴ�.");
	
		//��𸣰���Ģ
		boolean x =true, y = true;
		if (x && y) {
			System.out.println("��");
		} 
		if ( !(!x || !y)) {
			System.out.println("��");
		}		
	}

}
