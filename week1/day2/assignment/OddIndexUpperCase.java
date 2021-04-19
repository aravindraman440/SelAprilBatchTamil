package week1.day2.assignment;

public class OddIndexUpperCase {
public static void main(String[] args) {
	String  text="changeme";
	//method1
//	char[] charArray = text.toCharArray();
//	for (int i = 0; i < charArray.length; i++) {
//		//if(charArray[i]%2!=0)
//		if(i%2==0) {
//			System.out.print(Character.toUpperCase(charArray[i]));
//		}else {
//			System.out.print(charArray[i]);
//	}}
//     
	 //method2
	for (int i = 0; i < text.length(); i++) {
		
	
		char charAt = text.charAt(i);
		if(charAt%2!=0) {
			System.out.print(Character.toUpperCase(charAt));
		}else {
			System.out.print(charAt);
		}
	}

}
}
