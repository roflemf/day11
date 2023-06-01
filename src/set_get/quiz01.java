package set_get;

public class quiz01 {
	private String name = null, grade = null;
	private int kor=0, eng=0, math=0, sum =0, avg = 0;
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	public void sum() {
		sum = math + kor + eng;
	}	
	public void avg() {
		avg = sum/3;
	}
	public void grade() {
		if(avg>=90) {
			grade="A";
		}else if(avg>=80) {
			grade="B";
		}else {
			grade="C";
		}
	}

	public int getSum() {
		return sum;
	}
	public int getAvg() {
		return avg;
	}
	public String getGrade() {
		return grade;
	}
}
