package day02;

public class IdTester119 {

	public static void main(String[] args) {
		
		//Id a = new Id();
	}

}

class id {
	private static int counter = 0; // 정적변수
	private int id; //인스턴스 변수 new로 인스턴스화 한 후에 힙 메모리에 올라감
	
	public id( ) {
		id = ++counter;
	}
	
	public static int getcounter() { return counter;}
	public int getID() { return id;};
}
