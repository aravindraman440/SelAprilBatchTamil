package week1.day2.classroom;

public class Pgm1 {
public static void main(String[] args) {
	String name="testleaf";
	boolean duplicate=true;
	char[] charArray = name.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		for (int j = i+1; j < charArray.length; j++) {
			if(charArray[i]==charArray[j]) {
			System.out.println(charArray[i]);
			duplicate=true;
				break;
				
				
			}	
		}
		if(duplicate== true)
			break;
	}
	
}
}
