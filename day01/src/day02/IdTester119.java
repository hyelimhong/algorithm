package day02;

public class IdTester119 {

	public static void main(String[] args) {
		
		//Id a = new Id();
	}

}

class id {
	private static int counter = 0; // ��������
	private int id; //�ν��Ͻ� ���� new�� �ν��Ͻ�ȭ �� �Ŀ� �� �޸𸮿� �ö�
	
	public id( ) {
		id = ++counter;
	}
	
	public static int getcounter() { return counter;}
	public int getID() { return id;};
}
