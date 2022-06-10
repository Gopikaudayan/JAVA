import java.util.Scanner;
class names
{
	String[] names=new String[10];
    Scanner sc=new Scanner(System.in);
	void read(int n)
		{
		int i;
		System.out.println("Enter the names:");
		for(i=0;i<n;i++)
			names[i]=sc.nextLine();
		}
	
	void sort(int n)
		{
		int i,j;
		String temp;
		for(i=0;i<n;i++)
			for(j=i+1;j<n;j++)
			{
			if((names[i].compareTo(names[j]))>0)
				{
				temp=names[i];
				names[i]=names[j];
				names[j]=temp;
				}
			}
		}
	
	void display(int n)
	{
		int i;
		for(i=0;i<n;i++)
			System.out.println(names[i]);
    }
 }




public class Sort
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter the number of strings:");
		n=sc.nextInt();
	    names s=new names();
	    s.read(n);
	    System.out.println("before Sorting:");
	    s.display(n);
	    s.sort(n);
	    System.out.println("after Sorting:");
	    s.display(n);
	}
}