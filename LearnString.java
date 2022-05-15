package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "testleaf";
		int count=0;
		char[] charArray = text.toCharArray();
		for (int i=0; i< text.length(); i++)
		{
			char charAt = text.charAt(i);
			char e='e';
			if (e==charAt) {
				count=count+1;
			}


		}
		System.out.println("e ="+count);

		String text2="Testleaf is situated in twin towers teynampet.";
		String[] split = text2.split(" ");
		for (int a=0; a < split.length; a++)
		{
		
		if(split[a].toLowerCase().startsWith("t"))
			System.out.println(split[a]);
		}
	}
}