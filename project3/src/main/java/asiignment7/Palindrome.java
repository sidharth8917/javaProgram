package asiignment7;

public class Palindrome {
	String str1 = "Malayalam";
	String str2 = "java";
	public void  Checkpalindrome(String str){
		String s1= str.toLowerCase();
		String reversed="";
		for(int i=s1.length()-1;i>=0;i--) {
		reversed=reversed+s1.charAt(i);
		}
		if(s1.equals(reversed)) {
			System.out.println(str + " " +"is a Palindrome");
		}
		else {
			System.out.println(str + " " +"is not a Palindrome");
		}
		
	}

	public static void main(String[] args) {
		
		Palindrome obj = new Palindrome();
		obj.Checkpalindrome(obj.str1);
		obj.Checkpalindrome(obj.str2);
	}

}
