package variable;

class Ex03{
	int num = 100; // 인스턴스 변수
	
	public void test1() {
		System.out.println("test1 num : " + num);
		num = 200; 
	}
	public void test2() {
		System.out.println("test22 num : " + num);
	}

}

public class MainClass03 {
	public static void main(String[] args) {
		Ex03 e = new Ex03();
		e.test1();
		e.test2();
		
		
	}
}

/*
지역변수; 메소드에서 만듬(메소드 다 실행되면 사라짐)
인스턴스변수; 메소드 바깥에서 만듬 (객체화 될때 생성, 모든코드 실행되면 사라짐; 더 오래 쓸 수 있음)

한번 쓰고 말 변수는 공간 절약을 위해 지역변수,
공통적으로 오래 쓸 변수는 인스턴스 변수를 활용
*/
