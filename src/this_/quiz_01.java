package this_;

import java.util.Scanner;

/*
 입력, 연산, 출력 기능 만들기
 입력 : 이름, 국, 영, 수
 연산 : 합, 평균, 등급을 구하는 기능 각각
 출력 : 이름, 국, 영, 수, 합, 평균, 등급
 등급 : 평균이 90이상 A, 80이상 B, 나머진 C
 */
class TestClass02{
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public void in_put(){
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name=input.next();
		System.out.print("국어 점수 입력 : ");
		kor=input.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng=input.nextInt();
		System.out.print("수학 점수 입력 : ");
		math=input.nextInt();
		
		//in_put();//재귀호출
		cal_();

	}// 입력
	
	public void cal_(){
		// 합 구하기
		this.sum = (kor + eng + math );
		
		// 평균 구하기
		
		this.avg = sum /3 ;
		
		// 등급 구하기
		if (avg >=90) {
			grade = "A";
		}else if(avg >=80) {
			grade = "B";
		}else {
			grade = "C";
		}
		
		print_out();
		
	}// 연산
	
	public void print_out() {
		System.out.printf("%s님\n합: %d\n평균: %f\n등급: %s\n\n",this.name,this.sum,this.avg,this.grade);
		
		//in_put(); 다시입력받기
	}// 출력
	
}

public class quiz_01 {
	public static void main(String[] args) {
		TestClass02 e  = new TestClass02();	
		e.in_put();
	}


	
	
	
}

