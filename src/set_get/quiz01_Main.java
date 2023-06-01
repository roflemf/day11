package set_get;

import java.util.Scanner;

public class quiz01_Main {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		quiz01 e = new quiz01();
		String name = null, grade = null;
		int kor=0, eng=0, math=0, sum =0, avg = 0;
		
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("국어 점수 : ");
		kor = input.nextInt();
		System.out.print("영어 점수 : ");
		eng = input.nextInt();		
		System.out.print("수학 점수 : ");
		math = input.nextInt();
		
		//set
		e.setKor(kor);
		e.setEng(eng);
		e.setMath(math);

		//연산
		e.sum();
		e.avg();
		e.grade();
		
		//get
		sum = e.getSum();
		avg = e.getAvg();
		grade = e.getGrade();
		
	
		
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ math);
		System.out.println("총 합계 : "+ sum);
		System.out.println("평균 : "+ avg);
		System.out.println("등급 : "+ grade);
		
		
		
	}
	
	
	
	
	

}
