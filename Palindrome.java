package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String value="madam";
 int len=value.length();
 String rev="";
 for (int i=len; i>0;i--) {
	 rev=rev+value.charAt(i-1);
	System.out.println(rev);
}
 if(rev.equals(value)) {
	 System.out.println("The string is a palindrome.");
 }
 else
 {
	 System.out.println("String is not a palindrome.");
 }
 
	}

}
