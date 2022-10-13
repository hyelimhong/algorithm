package day01;

import java.util.Scanner;

public class 순서배열 {

	public static void main(String[] args) {
		String [][] a = new String[5][2];
		

		a[0][0] = "0397134";
		a[0][1] = "김효진";
		a[1][0] = "0465345";
		a[1][1] = "이종협";
		a[2][0] = "0427214";
		a[2][1] = "서상춘";
		a[3][0] = "0487342";
		a[3][1] = "배영미";
		a[4][0] = "0512478";
		a[4][1] = "김예진";
		
		
		//키보드로 입력받아 넣기
		//비어있는 인덱스 5를 구해서 넣기
		int i = 0, j = 0;
		boolean flag = false;
		for (; i < a.length; i++) {
			if (a[i][0] == (null))  break;
		}
//		Scanner	 sc = new Scanner(System.in);
//		System.out.println("학번은 ");
//		a[i-1][0] =sc.next();
//		System.out.println("이름은 ");
//		a[i-1][1] =sc.next();
//		
		
		for( String[] aa : a) {
			for( String aaa : aa) {
				System.out.println(aaa + "\t");
			}
			System.out.println();
		}
		
		//배영미를 삭제해라
		//1.배영미를 찾아라
		//2.배영미가 들어있는 배열에 값을 null로 바꾸기
//		String deleteName = "배영미";
//		int k = 0;
//		for (; k < a.length; k++) {
//			if(a[k][1].equals(deleteName)) break;
//		}
//		System.out.println(a[k][1] + " " + k);
//		a[k][0] = null;
//		a[k][1] = null;
//		System.out.println(a[k][1] + " " + k);
//		
//		//김예진 검색해보기
//		//우리반이면 학번과 이름 출력 아니면 우리반 아님 출력
//		String searchName = "김예진";
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
//			System.out.println("우리반이 아닙니다.");
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


