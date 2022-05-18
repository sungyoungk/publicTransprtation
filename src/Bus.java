public class Bus {
	
	final int busNum;
	
	int maxPassenger;
	int currentPassenger;
	int fare;
	
	int fuel;
	int currentSpeed;
	boolean condition;
	
	
	public void isDriving() {
		System.out.println("버스가 달립니다");	
	}
	
	public void switchCondition() {
		if(fuel < 10 || condition == false ) {
			System.out.println("차고지에 있습니다 ");
		} else {
			System.out.println("운행 중입니다");	
		}
	}
	
	public int getPassenger () {
		currentPassenger++;
	}
	
	public int changeSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
		
		if(fuel >= 10) {
			condition = true;
		} else {
			System.out.println("주유량을 체크해주세요");
		}
	}
	
}
