package week1.day2.classroom;

public class ReverseWords {
public static void main(String[] args) {
	String reverse="today a is beautiful day";
	String[] split = reverse.split(" ");
	
	for (int i = split.length-1;i>=0; i--) {
		System.out.println(split[i]);
	}
}
}
