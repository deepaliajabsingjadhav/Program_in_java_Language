/*
 * Accept two string fron user and check whether the string is anagram or not
 *
 * input : cat,atc
 *
 * output : true
 */

import java.util.Arrays;
import java.util.Scanner;
class AnagramString
{
static boolean isAnagrams(String str1,String str2)
{
// step 1
if(str1.length()!=str2.length())
{
return false;
}
// step 2
char[] strArray1 = str1.toCharArray();
char[] strArray2 = str2.toCharArray();
// step 3
Arrays.sort(strArray1);
Arrays.sort(strArray2);
// step 4
String sortedStr1 = new String(strArray1);
String sortedStr2 = new String(strArray2);
// step 5
if(sortedStr1.equals(sortedStr2))
{
return true;
}
else
{
return false;
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter String1 : ");
String str1 = sc.next();
System.out.println("Enter String2 : ");
String str2 = sc.next();

if(isAnagrams(str1,str2))
{
System.out.println("Anagram Strings !!");
}
else
{
System.out.println("Strings are not Anagram !!");
}
}
}
