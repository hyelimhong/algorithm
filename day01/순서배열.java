package day01;

import java.util.Scanner;

public class �����迭 {

	public static void main(String[] args) {
		String [][] a = new String[5][2];
		

		a[0][0] = "0397134";
		a[0][1] = "��ȿ��";
		a[1][0] = "0465345";
		a[1][1] = "������";
		a[2][0] = "0427214";
		a[2][1] = "������";
		a[3][0] = "0487342";
		a[3][1] = "�迵��";
		a[4][0] = "0512478";
		a[4][1] = "�迹��";
		
		
		//Ű����� �Է¹޾� �ֱ�
		//����ִ� �ε��� 5�� ���ؼ� �ֱ�
		int i = 0, j = 0;
		boolean flag = false;
		for (; i < a.length; i++) {
			if (a[i][0] == (null))  break;
		}
//		Scanner	 sc = new Scanner(System.in);
//		System.out.println("�й��� ");
//		a[i-1][0] =sc.next();
//		System.out.println("�̸��� ");
//		a[i-1][1] =sc.next();
//		
		
		for( String[] aa : a) {
			for( String aaa : aa) {
				System.out.println(aaa + "\t");
			}
			System.out.println();
		}
		
		//�迵�̸� �����ض�
		//1.�迵�̸� ã�ƶ�
		//2.�迵�̰� ����ִ� �迭�� ���� null�� �ٲٱ�
//		String deleteName = "�迵��";
//		int k = 0;
//		for (; k < a.length; k++) {
//			if(a[k][1].equals(deleteName)) break;
//		}
//		System.out.println(a[k][1] + " " + k);
//		a[k][0] = null;
//		a[k][1] = null;
//		System.out.println(a[k][1] + " " + k);
//		
//		//�迹�� �˻��غ���
//		//�츮���̸� �й��� �̸� ��� �ƴϸ� �츮�� �ƴ� ���
//		String searchName = "�迹��";
//		int n = 0;
//		
//		boolean searchFlag = false;
//		System.out.println(a[4][1].equals(searchName));
//		try {
//			for (; n < a.length; n++) {
//				if (a[n][1].equals(searchName)) { searchFlag = true; break;
//				
//			}
//			}
//		}catch (NullPointerException e) {
//			System.out.println("�츮���� �ƴմϴ�.");
//		}
//			
//				System.out.println(a[n][0] + " " + a[n][1]);
//				
				String[][] so = new String[5][2];
				int hakbun = Integer.parseInt(a[0][0]);
				int minhakbun = hakbun;
				int minhakbunindex = 0;
				int soindex = 0;
				for (int i1 = 0; i1 < a.length; i1++) {
					if( minhakbun >  Integer.parseInt(a[i1][0]))
						minhakbun = Integer.parseInt(a[i1][0]);
					 minhakbunindex = i;
				}
		
		
	
	so[soindex][0] = String.valueOf(minhakbun);
	so[soindex][1] = a[minhakbunindex][1];
	
	System.out.println(so[soindex][0] + " " + so[soindex][1]);
	
	a[minhakbunindex][0] = " 9999999";
	soindex++;
	
}		
		
}	


