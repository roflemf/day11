package set_get;

import java.util.Scanner;

public class MainClass01 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TestClass01  member = new TestClass01();
		String name = null, addr = null;
		int age = 0, num;
		while (true) {
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch (num) {
			case 1: 
				System.out.print("이름 입력: ");
				name = input.next();
				System.out.print("주소 입력: ");
				addr = input.next();
				System.out.print("나이 입력: ");
				age = input.nextInt();
				
//				member.name = name;
				member.setName(name);
//				member.addr = addr;
				member.setAddr(addr);
//				member.age = age;
				member.setAge(age);
				System.out.println("등록 성공");
				break;
			case 2: 
//				System.out.println("이름 : " + member.name);
				System.out.println("이름 : " + member.getName());
//				System.out.println("주소 : " + member.addr);
				System.out.println("주소 : " + member.getAddr());
//				System.out.println("나이 : " + member.age());
				System.out.println("나이 : " + member.getAge());
				break;
			case 3: System.out.println("종료");return;
			}
		}
		
		
		
		
	}
}
