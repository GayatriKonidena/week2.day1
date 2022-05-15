package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1="stops";
String text2="potss";
if(text1.length()==text2.length())
{
	char[] arr1=text1.toCharArray();
	Arrays.sort(arr1);
	for(char ch1:arr1)
	{
		System.out.println(ch1);
	}
	
	char[] arr2=text2.toCharArray();
	Arrays.sort(arr2);
	//char[] ch2;
	for(char ch2:arr2)
	{
		System.out.println(ch2);
	}
	if(Arrays.equals(arr1, arr2))
	{
		System.out.println("matching");;
	}
	else
	{
		System.out.println("not matching");
	}
	
	
	
}
else {
	System.out.println("Length of both strings not matching.");
}

	}

}
