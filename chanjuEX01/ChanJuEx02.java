package chanjuEX01;
//차 브랜드 마다의 바퀴의 전체 넓이를 구하는 객체를 생성후 출력

class CarCircle{
	int r;
	String carName;
	
	CarCircle(int r, String carName){
		this.r = r;
		this.carName = carName;
	}
	
	void call() {
		double result = 3.14*r*r;
		System.out.println(carName + "의 바퀴 넓이는" + result + "입니다");
	}
	
}

public class ChanJuEx02 {

	public static void main(String[] args) {
		
		CarCircle Bmw = new CarCircle(10, "BMW");
		Bmw.call();

	}

}
