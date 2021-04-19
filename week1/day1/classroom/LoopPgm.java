package week1.day1.classroom;

public class LoopPgm {
public static void main(String[] args) {
	//int num =100;
	for (int i = 1; i <= 100; i++) {
		//System.out.println(i);
		 if(i%3==0 && i%5==0)
		{
			System.out.println("TanPan"+i);
		}
		 else if(i%3 ==0) {
			System.out.println("Pan"+i);
		}
		else if(i%5==0) {
			System.out.println("Tan"+i);
		}
		
		else {
			System.out.println("nothing");
		}
	}
}
}
