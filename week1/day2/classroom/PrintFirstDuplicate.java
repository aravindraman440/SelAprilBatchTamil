package week1.day2.classroom;

public class PrintFirstDuplicate {
public static void main(String[] args) {
	String name = "amma";
	boolean palindrome=false;
	char[] charArray = name.toCharArray();
	//System.out.println(charArray);
	for (int i = 0; i < charArray.length; i++) {
		for (int j = i+1; j < charArray.length; j++) {
			if(charArray[i]==charArray[j])
				System.out.println("the duplicate char is:"+charArray[i]);
			palindrome=true;
			break;
		}
		if(palindrome)
			System.out.println("To print first dupllicate value:"+charArray[i]);
			break;
		
	}
	
}
}