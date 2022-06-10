import java.util.*;
class p1
{
	int pcode,price;
	String pname;
	
}
class product
{
 	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		p1 ob1=new p1();
		p1 ob2=new p1();
		p1 ob3=new p1();
		System.out.println("enter 1st record ");
		System.out.print("pcode: ");
		ob1.pcode=sc.nextInt();
		System.out.print("name: ");
		ob1.pname=sc.next();
		System.out.print("price:");
		ob1.price=sc.nextInt();
                                    System.out.println("enter 2nd record ");
		System.out.print("pcode: ");
		ob2.pcode=sc.nextInt();
		System.out.print("name: ");
		ob2.pname=sc.next();
		System.out.print("price:");
		ob2.price=sc.nextInt();
                                    System.out.println("enter 3rd record ");
		System.out.print("pcode: ");
		ob3.pcode=sc.nextInt();
		System.out.print("name: ");
		ob3.pname=sc.next();
		System.out.print("price:");
		ob3.price=sc.nextInt();
		if(ob1.price<ob2.price && ob1.price<ob3.price)
		{
			System.out.println(ob1.pname+" has lowest price");
		}
		else if(ob2.price<ob1.price && ob2.price<ob3.price)
		{
			System.out.println(ob2.pname+" has the lowest price");
		}
		else
		{
			System.out.println(ob3.pname+" has the lowest price");
		}
	}
}