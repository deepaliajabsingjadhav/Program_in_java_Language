// Accept string from user and calculate number of words
// Input : "HeLLo _ INdiA"
// Output : 2
// Input : "_ _India_Demo"
// Output : 2
// Input : "_ _ __India _ _ _ Demo _ _"
// Output : 2
// Input : "_ _a _ _ b _ _"
// Output : 2

import java.lang.*;
import java.util.*;
class DemoString
{
	int WordFrequency(String str)
	{
		char arr[] = str.toCharArray();
		int size = arr.length;
		int i = 0, iCnt= 0;
		// 0 1234 56 7 8 9	
		// _ ACC_ AD _ _ ewe
		// i 	0	1	2	3	4	5	6	7	8	9	10
		// size 10
		// icnt 0	1	2	3

		while(i < size)
		{
			if(arr[i] == ' ') // Space occurs
			{
				while( (i <size) && (arr[i] == ' '))// Skip all white spaces
				{
					i++;
				}
			}
			if((i < size) && (arr[i] != ' '))	// Non space character occur
			{	
				iCnt++;		// Increnet the word count
				while((i < size) && (arr[i] != ' ')) // skip non space charcter
				{
					i++;
				}
			}
		}
		return iCnt;
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");

		String str = sobj.nextLine();
		DemoString dobj = new DemoString();

		int ret = dobj.WordFrequency(str);
		System.out.println("Total no of words are :"+ret);
	}
}







