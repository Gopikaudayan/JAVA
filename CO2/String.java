import java.util.Scanner;
public class String
{
	public static void main(String args[]){
	String s1,s2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string1 : ");
	s1=sc.next();
	System.out.println("enter string2 : ");
	s2=sc.next();
	System.out.println("1.uppercase of string1 : "+s1.toUpperCase());
	System.out.println("2.lowercase of string1 : "+s1.toLowerCase());
	System.out.println("3.substring of string1 from index 2 to 5 : "+s1.substring(2,5));
	System.out.println("4.length of string1 : "+s1.length());
	System.out.println("5.index of 't' in string1 : "+s1.indexOf('t'));
	System.out.println("6.replace 'n' by 'm' in string2 : "+s2.replace('n','m'));
	System.out.println("7.concatenate string2 to string1 : "+s1.concat(s2));
	System.out.println("8.compareTo function :"+s1.compareTo(s2));
	System.out.println("9.whether both the strings are equal : "+s1.equals(s2));
	System.out.println("10.whether the string2 contains 'nga' : "+s2.contains("nga"));
	System.out.println("11.character at index 0 of string1 : "+s1.charAt(0));
	
}
}