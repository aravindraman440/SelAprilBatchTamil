package week1.day2.assignment;

public class Palindrome {
	public static void main(String[] args) {
	
String txt="madamm";
String rev="";
char[] charArray = txt.toCharArray();
for (int i =charArray.length -1;i>=0; i--) {
	rev=rev+charArray[i]+"";
}
	System.out.println(rev);
	if(txt.equals(rev))
		System.out.println("the given String is palindrome");
	else
		System.out.println("the string not palindrome");


	}
	
}
