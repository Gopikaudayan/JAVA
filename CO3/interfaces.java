import java.util.Scanner;
public class interfaces
{
public static void main (String args[])
{
    int op;
    Scanner sc =new Scanner(System.in);
    System.out.println("1.CIRCLE \n 2.RECTANGLE ");
		System.out.println("\n Choose an option: ");
        op=sc.nextInt();
        switch(op)
        {                                            
            case 1:
            circle ob =new circle();
            ob.area();
            ob.perimeter();
            break;
            case 2:
            rectangle ob1= new rectangle();
            ob1.area();
            ob1.perimeter();
            break;
            default:
            System.out.println("invalid option");


        }

}
}

interface result
{
    public void area();
    public void perimeter();
}
class circle implements result{
    Scanner sc =new Scanner(System.in);
    double ar,per,r;
    public void area()
    {
    System.out.println("enter the radius of circle");
    r=sc.nextDouble();
    ar=3.14*r*r;
    System.out.println("area of circle:"+ar);
    }
    public void perimeter()
    {
        per=2*3.14*r;
        System.out.println("perimeter of circle:"+per);
    }

}
class rectangle implements result{

     Scanner sc =new Scanner(System.in);
     int l,b,ar,per;
	
	public void area()
	{
		System.out.println("Enter Length");
		l=sc.nextInt();
		System.out.println("Enter Breadth");
		b=sc.nextInt();
		ar=l*b;
		System.out.println("Area of Rectangle is: "+ar);
	}

	public void perimeter()
	{
		per=2*(l+b);
		System.out.println("Perimeter of Rectangle is: "+per);
	}

}

