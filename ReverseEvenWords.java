package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am a software tester";
		String[] words=test.split("\\s");
		for(String s:words) {
			System.out.println(s);
		}
		
		String output="";

		for(int i=0;i<words.length;i++) {
			if((i+1)%2==0)
			{
				String rev="";
				char[] charArray=words[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--) {
				
					rev=rev+charArray[j];
				}
				output=output+rev+" ";
			}
			else {
				output=output+words[i]+" ";
			}
		}
System.out.println(output);
	}

}
