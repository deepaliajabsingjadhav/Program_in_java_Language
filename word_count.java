// Accept string from user and count the frequency of word.

// Input : Hello World Demo Pune university
// Output : 2

import java.lang.*;
import java.util.*;

class word_count
{
	public static void main(String arg[])
	{
		try
		{
			Scanner sobj = new Scanner(System.in);

			System.out.println("Enter first string");
			String str = sobj.nextLine();

			System.out.println("enter word");
			String word=sobj.nextLine();

			MyString mobj = new MyString();

			int iret = mobj.CountWords(str,word);
			
		
			System.out.println("Strings contains "+ iret + " times words");
		
		}
		catch(Exception obj)
		{}
	}
}

class MyString
{
	int CountWords(String str,String Word) throws Exception
	{
		String arr[] = str.split(" ");
		
		int icnt = 0;

		for(String s : arr)
		{
			if(s.equals(Word))
			{
				icnt++;
			}
		}

		return icnt;
	}
}






