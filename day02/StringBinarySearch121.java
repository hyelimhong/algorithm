package day02;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch121 {

	public static void main(String[] args) {
		Scanner	 stdid = new Scanner(System.in);
		
		String [] x = { "boolean", 	"byte", "char", "double", "floatint",
			      "long","short"  };
		System.out.println("ã����� ���ڴ�?");
		String key = stdid.next();
		int idx = Arrays.binarySearch(x, key);
		if (idx < 0 ) {
			System.out.println("�����ϴ�");
		}else System.out.println(idx + "�� �ֽ��ϴ�");
		
		
		
		Scanner	 stdid2 = new Scanner(System.in);
		
		double [] x2 = { 11.1, 22.2, 33.3, 44.4, 55.5  };
		System.out.println("ã����� �Ǽ���?");
		double key2 = stdid2.nextDouble();
		int idx2 = Arrays.binarySearch(x2, key2);
		if (idx2 < 0 ) {
			System.out.println("�����ϴ�");
		}else System.out.println(idx2 + "�� �ֽ��ϴ�");
		
		Scanner	 stdid3 = new Scanner(System.in);
		
		

	}

}
