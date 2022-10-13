package day02;

import java.util.Scanner;

public class SeqSearch {
	
	private static int SeqSearch(int[] a, int n, int key) {
		int i = 0;
		while (true) {
			
			if(i == n) return -1; //빈 배열인 것 처리
			if(a[i] == key ) return i;
			i++;
		}
		
	}

	public static void main(String[] args) {
		Scanner	 stdIn = new Scanner(System.in);
		System.out.println("요솟수");
		int num = stdIn.nextInt();
		int [] x = new int [num];
				
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		int idx = SeqSearch(x, num, ky);
		
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다");
		}else {
			System.out.println(" 그 값은 x [" + idx + "]에 있습니다");
		}
				
	
	}

	

}
