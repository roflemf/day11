package variable;

class Ex07{
	
	static int num = 10000; // 기본 0 또는 null로 자동 초기화 된다
	public static void test() {
		System.out.println(num);
		System.out.println("test");
	}
	
	
}

public class MainClass07 {
	static int num = 11111;
	String msg = "연습중";
	public static void main(String[] args) {
		System.out.println(num);
		MainClass07 m = new MainClass07();
		
		
		Ex07.test();
		Ex07 e = new Ex07();
		e.test();

		
	}

}
