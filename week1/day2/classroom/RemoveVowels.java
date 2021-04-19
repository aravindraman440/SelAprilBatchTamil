package week1.day2.classroom;

public class RemoveVowels {
	public static void main(String[] args) {

		String input = "TestLeaf";
		/*method1
		 * char[] charArray = input.toCharArray(); for (int i = 0; i < charArray.length;
		 * i++) {
		 * if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'
		 * ||charArray[i]=='u') { System.out.print(charArray[i]); }else {
		 * System.out.print(charArray[i]); } }
		 */ 
		
		//method2
//		String replace = input.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
//		System.out.println(replace);

		
		  String replaceAll = input.replaceAll("[aeiouAEIOU]", "");
		  System.out.println(replaceAll);
		 
	}

}
