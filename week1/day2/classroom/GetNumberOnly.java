package week1.day2.classroom;

public class GetNumberOnly {

public static void main(String[] args) {
	
	String employee = "Amazon has more than 17,048 employees in chennai";
	
	//method1
//	char[] charArray = employee.toCharArray();
//	for (int i = 0; i < charArray.length; i++) {
//		if(Character.isDigit(charArray[i]))
//			System.out.print(charArray[i]+" ");
//	}
//	
	
//	method2
	String replaceAll = employee.replaceAll("[^0-9]", "");
	System.out.println(replaceAll);
	
}
}
