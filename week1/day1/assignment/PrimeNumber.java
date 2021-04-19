package week1.day1.assignment;

public class PrimeNumber {
public static void main(String[] args) {
	int num =13;
	int i=2;
	boolean prime =true;
	while(i<num){
	if(num%i==0) {
		System.out.println("Not prime");
		prime=false;
		i=i+1;
	}
	if(prime==true) {
		System.out.println("given num is prime");
	}
}
}
}