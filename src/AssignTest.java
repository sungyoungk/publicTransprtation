
public class AssignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus bus1 = new Bus();
			bus1.isDriving();
			bus1.switchCondition(5);
			bus1.getPassenger(20);
			bus1.getPassenger(6);
			bus1.getPassenger(31);
			
			
			System.out.println("====================");
			
		Taxi taxi1 = new Taxi();
			taxi1.startDriving(5);
			taxi1.startDriving(6);
			taxi1.takePassenger();
			taxi1.takePassenger();
			taxi1.changeSpeed(5);
			taxi1.changeSpeed(-5);
			taxi1.totalFare(4);

	}

}
