package week1.day2.assignment;

public class RemoveDuplicate {
public static void main(String[] args) {
	//String text="We learn java basics as part of java sessions in java week1";
	String str = "We learn java basics as part of java sessions part in java week1 learn";
	
	String[] eachWords = str.split("\\s+");
	int length = eachWords.length;
	System.out.println(length);
	for (int i =0; i <eachWords.length; i++) {
		
		for (int j = i+1; j <eachWords.length; j++) {
	
			if((eachWords[i].equals(eachWords[j]))){

				eachWords[j]="";			}
		
	}
		System.out.print(eachWords[i]+" ");	
}

}
}

