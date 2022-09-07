package chanjuEX01;

class Student {
	int korScore;
	int engScore;
	int mathScore;
	int japScore;
	String name;
	
	Student(int korScore, int engScore, int mathScore, int japScore, String name){
		this.korScore =korScore;
		this.engScore =engScore;
		this.mathScore =mathScore;
		this.japScore =japScore;
		this.name =name;
	}
	
	
	void call() {
		int sum;
		sum = korScore + engScore +  mathScore +  japScore;
		double avg;
		avg = sum/4.0;
		System.out.println(name + "의 총 점수 : " + sum);
		System.out.println(name + "의  평균 : " + avg);
	}
}

public class ChanJuEx01 {

	public static void main(String[] args) {
		
		Student Chanju = new Student(99,100,34,56, "ChanJu");
		Chanju.call();
		
		

	}

}
