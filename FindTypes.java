package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test="$$ Welcome to 2nd Class of Automation $$";
int letter=0, space=0, num=0, specialChar=0;
char[] charTest=test.toCharArray();
char ch;
for(int i=0;i<charTest.length;i++)
{
	ch=charTest[i];
	if(Character.isDigit(ch)) {
		num++;
	}
	else if(Character.isSpace(ch)) {
		space++;
	}
	else if(Character.isLetter(ch)) {
		letter++;
	}
	else
	{
		specialChar++;
	}
}
System.out.println("number of letters: "+letter);
System.out.println("number of space: "+space);
System.out.println("number of number: "+num);
System.out.println("number of special character: "+specialChar);
	}

}
