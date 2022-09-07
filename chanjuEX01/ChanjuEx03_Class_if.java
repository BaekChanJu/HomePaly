package chanjuEX01;

class Month{
	int i;
	
	void printMonth (int i) {
		if(i<0 || i>12) {
			System.out.println("잘못된 입력");
			return;
		}else {
			System.out.println("입력한 달은 " + i + "달 입니다.");
		}
	}
	
	
}

public class ChanjuEx03_Class_if {

	public static void main(String[] args) {
		
		Month inputMonth = new Month();
		
		inputMonth.printMonth(10);

	}

}
