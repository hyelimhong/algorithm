package day01;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 1번 문제
		int[] a = new int[10]; // stack -> aa에는 정수가 담김 heap -> 정수가 들어감
		for (int i = 0; i < a.length; i++) {
			a[i] = 100 * i + 100;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for( int n : a) {
			System.out.println(n + " 찍어보자 \t");
			
		}
		System.out.println();
		// 2번 문제
		
		int[][] b = new int[2][3];
		int number = 100;
		int[] sum = new int[2];
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = number;
				sum[i] += b[i][j];
				number -= 5;
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j] + "\t");
			}
			System.out.print(sum[i]);
			System.out.println();
		}
		
		for( int[] bb : b) {
			for( int bbb : bb) {
				System.out.println( bbb + "\t");
			}
			System.out.println();
		}
		//3번 문제
		
		String[][][] c = {{{"a","b"}, {"c","d"}, {"e","f"}},
							{{"f","g"}, {"h","i"}, {"j","k"} }
									};
		System.out.println("면의 갯수" + c.length);
		System.out.println("면의 갯수" + c[0].length);
		System.out.println("면의 갯수" + c[0][0].length);
		
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					System.out.println(c[i][j][j2] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		for(String[][] cc : c) {
			for(String[] ccc : cc) {
				for(String cccc : ccc) {
					System.out.println(cccc + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
