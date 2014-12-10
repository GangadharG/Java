enum BatteryStatus { FULL, HALF, ZERO } // must be public or default similar to class (cannot be protected or private)

class Battery{
	BatteryStatus percent;
}

public class EnumOutsideClassTest {

	public static void main(String[] args){

		Battery laptop = new Battery();
		laptop.percent = BatteryStatus.FULL; // enum outside class
		System.out.println(laptop.percent);  // prints FULL
	}
}
