package day02;

public class �����˻� {

	public static void main(String[] args) {
		int[] a= {5, 7, 15, 28, 29, 31, 39, 58, 68, 70, 95};
		int key = 39;
		
		int idx = �����˻��޼ҵ�( a, a.length, key);
		if(idx == -1) System.out.println("�� ���� ��Ұ� �����ϴ�");
		else 
			System.out.println(" �� ���� a [" + idx + "]�� �ֽ��ϴ�");
		
		
		
	}

	private static int �����˻��޼ҵ�(int[] a, int length, int key) {
		//��������
		int pl = 0; // 0
		int pr = length -1 ; //9
		do {
			int pm = ( pl + pr) / 2; // 4
			if( a[pm] == key) return pm;
			else if(a[pm] > key) pr = pm -1;
			else if(a[pm] < key) pl = pm + 1;
			
		} while(pl <= pr );
		
		return -1;
	}

}
