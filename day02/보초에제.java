package day02;

import java.util.Scanner;

public class ���ʿ��� {

	public static void main(String[] args) {
		
			Scanner	 stdIn = new Scanner(System.in);
			System.out.println("��ڼ�");
			int num = stdIn.nextInt();
			int [] x = new int [num = 1]; //���ʾ˰���
					
			for (int i = 0; i < num; i++) {
				System.out.print("x[" + i + "]:");
				x[i] = stdIn.nextInt();
			}
			System.out.print("�˻��� �� : ");
			int ky = stdIn.nextInt();
			
			 int idx = ���ʸ޼ҵ�(x, num , ky);
			 if(idx == -1) System.out.println("�� ���� ��Ұ� �����ϴ�");
	else 
		System.out.println(" �� ���� x [" + idx + "]�� �ֽ��ϴ�");
	
	}

	private static int ���ʸ޼ҵ�(int[] x, int num, int key) {
		int i = 0;
		x[num] = key; //ã�� ���� ������ ���� �־��ش�
		while (true) {
			if(x[i]==key) break;
			i++;
			
		}
		return i == num ? -1: i;
		
	}

}
