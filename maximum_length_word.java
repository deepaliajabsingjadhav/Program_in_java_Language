//accept string and return the maximum length word in that string
//

import java.util.*;
import java.lang.*;
class maximum_length_word
{
	public static void main(String args[])
	{
		try
		{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter string");
		String str=sobj.nextLine();
		maxLength mobj=new maxLength();
		mobj.MaxWord(str);
		}
		catch(Exception obj)
		{
		}
	}
}

class maxLength
{
	void MaxWord(String str) throws Exception
	{
	int iMax=0;
	String temp=null;
	String  arr[]= str.split(" ");
	for(String s : arr)
	{
		if(s.length() > iMax)
		{
			iMax=s.length();

			temp=s;
		}
	}

	System.out.println("String os Maximum length is:");

	System.out.println(temp);

	}


}
