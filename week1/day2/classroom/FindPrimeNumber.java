package week1.day2.classroom;

public class FindPrimeNumber {
public static void main(String[] args) {
	int num =20;
	int i=2;
	boolean prime =false;
	while(i<num) {
		if(num%i==0)
			System.out.println("the num is not prime");
		prime=true;
		i++;
	}
	if(prime==true)
	System.out.println("the given string is prime:"+num);
}
}
