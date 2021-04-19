package week1.day2.classroom;

public class ReverseString {
public static void main(String[] args) {
	String name="tester";
	char[] charArray = name.toCharArray();
	for (int  i=charArray.length-1;i>=0; i--) {
		System.out.println(charArray[i]);
	}
}
}
