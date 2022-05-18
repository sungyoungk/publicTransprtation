public class Bus {
	
	final int busNum = 1;
	
	int maxPassenger = 30;
	int currentPassenger;
	int fare;
	
	int fuel;
	int currentSpeed;
	boolean condition = true;
	
	
	public void isDriving() {
		System.out.println("버스가 달립니다");	
	}
	
	public void switchCondition(int fuel) {
		if (fuel < 10) {
			System.out.println("주유가 필요합니");
		} else if (condition == false) {
			System.out.println("차고지행");
		}else {
			System.out.println("운행중");
		}
	}
	
	public void getPassenger (int num) {
		if (condition == false) {
			System.out.println("현재 운행중이지 않습니다");
		} else if ((currentPassenger += num) > 30 || num > 30) {
				System.out.println("승객수 초과");
			} else {
				System.out.println("현재 승객 수는 " + currentPassenger +"명입니다");
			}
			

		
	}
	
	public void changeSpeed(int speed) {
		
		if (fuel < 10) {
			System.out.println("주유량을 확인하세요");
		} else {
			currentSpeed += speed;
		}
		
		
		
	}
	
}
