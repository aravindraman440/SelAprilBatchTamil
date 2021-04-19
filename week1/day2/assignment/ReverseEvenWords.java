package week1.day2.assignment;

public class ReverseEvenWords {
public static void main(String[] args) {
	String value="I am A Softwere Engineer";
	String[] split = value.split(" ");
	for (int i = 0; i < split.length; i++) {
		//System.out.print(split[i]);
		if(i %2==0) {
			System.out.print(" ");
		System.out.print(split[i]);	
		}
		if(i%2!=0) {
			char[] charArray = split[i].toCharArray();
			for (int j = charArray.length-1;j>=0; j--) {
				System.out.print(" ");
				System.out.print(charArray[j]);
					
			}
		}	
		
		

	}
}
}

