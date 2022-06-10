import java.util.Scanner;
class person
{
String name,gen,add;
int age;
Scanner sc=new Scanner(System.in);
person()
{
System.out.println("Enter the name:");
name=sc.next();
System.out.println("Enter the gender:");
gen=sc.next();
System.out.println("Enter the address:");
add=sc.next();
System.out.println("Enter the age:");
age=sc.nextInt();
}
}

class employee extends person
{
String empid,cmpname,quali;
int sal;
employee()
{
super();
System.out.println("Enter the employee id:");
empid=sc.next();
System.out.println("Enter the company name:");
cmpname=sc.next();
System.out.println("Enter the qualification:");
quali=sc.next();
System.out.println("Enter the salary:");
sal=sc.nextInt();
}
}

class teacher extends employee
{
String sub,dept,tid;
teacher()
{
super();
System.out.println("Enter the subject");
sub=sc.next();
System.out.println("Enter the department");
dept=sc.next();
System.out.println("Enter the teacher id");
tid=sc.next();
System.out.println("\n");
}
void display()
{
System.out.println("Name:"+name);
System.out.println("Gender:"+gen);
System.out.println("Address:"+add);
System.out.println("Age:"+age);
System.out.println("Empid:"+empid);
System.out.println("Company name:"+cmpname);
System.out.println("Qualification:"+quali);
System.out.println("Salary:"+sal);
System.out.println("Subject:"+sub);
System.out.println("Department:"+dept);
System.out.println("Teacher id:"+tid);
System.out.println("\n");
}
}

class Persons
{
	public static void main(String args[])
	{
	int n,i;
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of teachers");
n=sc.nextInt();
teacher t[]=new teacher[n];
	for(i=0;i<t.length;i++)
 	t[i]=new teacher();
 	for(i=0;i<t.length;i++)
 	t[i].display();
	}
}