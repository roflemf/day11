package variable;

class Ex05{
	static int num;  //class 변수(static변수); 객체 생성 없이 코드가 읽힐때 먼저 만든다(한번만 만듬), 설정관련해서 많이씀
	
	
	
}

public class MainClass05 {
	public static void main(String[] args) {
	Ex05.num = 100;
	Ex05 e = new Ex05();
	System.out.println( e.num );
	System.out.println( Ex05.num );
		
		
		
	}
}
