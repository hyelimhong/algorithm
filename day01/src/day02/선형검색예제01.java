package day02;

public class �����˻�����01 {

	public static void main(String[] args) {
		//�׸� 3-2
		//�迭 �ȿ� ���� �ֱ�
		int[] a = {6, 4, 3, 2, 1, 2, 8};
		int key =6; //�˻��� Ű ��
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (a [i] == key) { flag = true; System.out.println("ã�Ҵ�"); break;
			}
			if (!flag) {
				System.out.println("�� ã�Ҵ�");
			} 
		}
		

	}

}
