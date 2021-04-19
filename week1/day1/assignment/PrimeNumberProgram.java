package week1.day1.assignment;

public class PrimeNumberProgram {
public static void main(String[] args) {
	int num =13;
	int divide=2;
	boolean prime=false;
	for (int i = 2; i <=num/2; i++) {

		if(num %divide ==0)
			
		   prime=true;
		   divide=divide+1;
	}
		
	
	
	if(!prime)
		System.out.println("the given num is not prime "+num);
	else
		System.out.println("the num is prime"+num);
}
}
