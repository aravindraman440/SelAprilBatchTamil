package week1.day2.classroom;

public class TwoSumPblm {
public static void main(String[] args) {
	int[] a= {2,3,4,5};
	int sum = 5;
	boolean check=false;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]+a[j]==sum)
				System.out.println("true:"+sum);
			check=true;
			break;
		}
		if(check)
			break;
	}//System.out.println("condition is wrong:"+sum);

}


}
