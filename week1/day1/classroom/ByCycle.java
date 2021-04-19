package week1.day1.classroom;

public class ByCycle {
public void getCycleColor() {
	String name="Blue";
	System.out.println("cycle color is blue");
}
public void isPuncture() {
	boolean isPuncture=true;
	System.out.println("the cycle is Puncture");
}

public void isPunctur(boolean isPuncture) {
	if(isPuncture)
		System.out.println("the cycle is Punctre true");
	else
		System.out.println("cycle not puncture");
}


public static void main(String[] args) {
	ByCycle cycle =new ByCycle();
	cycle.getCycleColor();
	cycle.isPuncture();
	cycle.isPunctur(false);
}
}
