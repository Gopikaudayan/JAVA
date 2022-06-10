import java.util.Scanner;

class cpu
{
Scanner sc=new Scanner(System.in);
int price;

void getcpu()
{
System.out.println("enter the price of cpu:");
price=sc.nextInt();
} 

class processor 
{
int ncore;
String manfac;

void getprocessor()
{
System.out.println("enter the no of cores of processor:");
ncore=sc.nextInt();
System.out.println("enter the manufacturer of processor");
manfac=sc.next();
}

void putprocessor()
{
System.out.println("no of cores of processor:"+ncore);
System.out.println("manufacturer of processor"+manfac);
}

}	

static class ram
{
int memory;
String manfac;
Scanner sc=new Scanner(System.in);
void getram()
{
System.out.println("enter the memory size of ram:");
memory=sc.nextInt();
System.out.println("enter the manufacturer of ram");
manfac=sc.next();
}
void putram()
{
System.out.println("memory size of ram:"+memory+"GB");
System.out.println("manufacturer of ram:"+manfac);
}

}

}


public class Computer {
public static void main(String args[])
{
cpu c=new cpu();
cpu.processor p=c.new processor();
cpu.ram r=new cpu.ram();

c.getcpu();
p.getprocessor();
r.getram();

System.out.println("details");
 p.putprocessor();
 r.putram();
}

}