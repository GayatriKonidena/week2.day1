package week2.day1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Chennai";
		int count=0;
		char[] stringArray=str.toCharArray();
		int len=stringArray.length;
		for(int i=0;i<len;i++)
		{
			if(stringArray[i]=='n')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
