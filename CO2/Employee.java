
import java.util.Scanner;
class emp
{
String eno,ename;
int esalary;
Scanner sc=new Scanner(System.in);
void getdata()
{
System.out.println("\nEnter the employee no:");
eno=sc.next();
System.out.println("Enter the employee name:");
ename=sc.next();
System.out.println("Enter the salary:");
esalary=sc.nextInt();
}

void putdata()
{
System.out.println("Employee no:"+eno);
System.out.println("Employee name:"+ename);
System.out.println("Employee salary:"+esalary);
}
}


class Employee
{
	public static void main(String args[])
	{
	int n,c=0,i;
	Scanner sc=new Scanner(System.in);
	String x;
 System.out.println("Enter the no of employees:");
 n=sc.nextInt();
 emp e[]=new emp[n];

 for(i=0;i<e.length;i++)
 {
 	e[i]=new emp();
 e[i].getdata();
 }
 System.out.println("\nSearching ");
System.out.println("Enter the employee no to search:");
x=sc.next();
for(i=0;i<e.length;i++)
{
if(e[i].eno.equals(x))
{ 
   c=1;
	e[i].putdata();

	break;
}
}
if(c==0)
System.out.println("Employee not found");
}
}
