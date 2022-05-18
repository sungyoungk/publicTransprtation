public class Taxi {
	
	final int taxiNum = 2;
	
	int fuel;
	int currentSpeed;
	String destination;
	int defaultDistance = 1;
	int distanceToDestin;
	int defaultFare = 3000;
	int farePerDistance = 500;
	int totalFare;
	int totalDistance;
	boolean condition = true;
	
	
	
	public void startDriving(int fuelGive) {
		if((this.fuel += fuelGive)<= 10) {
			System.out.println("연료주입!");
		}
		else 
		{
		System.out.println("현재 연료랑은"+ fuel + "운행을 시작합니다");
			}
			
	}
	
	public void takePassenger() {
		if(condition == false) {
				System.out.println("탑승불가");
		} else {
			System.out.println("승객이 탑승했습니다");
			condition = false;
		} 
	}
	
	public void changeSpeed(int speed) {
		currentSpeed += speed;
		if (currentSpeed <= 0) {
			System.out.println("정차중입니다");
		} else {
			System.out.println("현재 속도는 " + currentSpeed + "km/h");
		}
	}
	
	public void totalFare(int distance) {
		totalFare += defaultFare;
		if (distance <= defaultDistance) {
			totalFare += 0;
		} else if (distance > defaultDistance) {
			totalFare += farePerDistance * (distance - 1);
		}
		System.out.print("총 주행거리는" + distance + "km 이고, 요금은" + totalFare + "원 입니다");
	}
	
		
	}
	
