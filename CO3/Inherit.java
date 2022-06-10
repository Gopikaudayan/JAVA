import java.util.Scanner;
class Inherit
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	 System.out.println("\nEnter the no.of teacher:");
	 n=sc.nextInt();
	 teacher t[]=new teacher[n];
	 for(int i=0;i<n;i++)
	 {
       t[i]=new teacher();
     }
      System.out.println("\ndetails of teacher");
      for(int i=0;i<n;i++)
      {
      	t[i].disp();
      }
  }
}
class employee
{
	int id,salary;
	String name,address;
	employee()
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("\nenter the employee number:");
      id=sc.nextInt();
      System.out.println("enter the name of employee :");
      name=sc.next();
      System.out.println("enter the address:");
      address=sc.next();
      System.out.println("enter the salary:");
      salary=sc.nextInt();
	}
}
class teacher extends employee
{
	String subject,department;
	teacher()
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter the subject");
      subject=sc.next();
      System.out.println("Enter the department");
	  department=sc.next();
    } 
    void disp()
    {
        System.out.println("id:"+id);
        System.out.println("teacher:"+name);
        System.out.println("address:"+address);
        System.out.println("salary:"+salary);
        System.out.println("subject:"+subject);
        System.out.println("department:"+department);
    }
}