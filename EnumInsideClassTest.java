class Battery2{
	
	enum BatteryStatus { FULL, HALF, ZERO }; // semicolon is optional
											                     // enums has to be declared in class not in methods
	BatteryStatus percent;
}

public class EnumInsideClassTest {
	
	public static void main(String[] args) {

		Battery2 laptop2 = new Battery2();
		laptop2.percent = Battery2.BatteryStatus.HALF;
		System.out.println(laptop2.percent); // prints HALF
	}
}
