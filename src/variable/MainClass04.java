package variable;
class Ex04{
	
	private String name;	// private; 변수의 은닉화
	
	public void input() {
		name = "홍길동";
		
	}
	
	public void print() {
		System.out.println( "당신 이름 : "+ name );
		
		
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		Ex04 e = new Ex04();
		e.input(); e.print();
//		e.name = "aaaa";
	}

}
