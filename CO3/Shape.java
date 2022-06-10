class shapes
{
void area(double r)
{
System.out.println("Area of circle="+3.14*r*r);
}
void area(int l,int b)
{
System.out.println("Area of rectangle="+l*b);
}
void area(int a)
{
System.out.println("Area of square="+a*a);
}
void area(double b,double h)
{
System.out.println("Area of Triangle="+0.5*b*h);
}

}



class Shape
{
public static void main(String args[])
{
shapes s=new shapes();
s.area(2.0);
s.area(3,4);
s.area(5);
s.area(5.0,4.0);
}

}