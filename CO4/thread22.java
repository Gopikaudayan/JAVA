import java.util.Scanner;
class fib implements Runnable
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for fibonacci number : ");
		int n=sc.nextInt();
		int a=1,b=1,c=(a+b),i;
		System.out.println("Fibonacci numbers : ");
		for(i=1;i<=n;i++)
		{
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		}
	}
}

class even implements Runnable
{
	public void run()
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}		
		}
	}
}

class thread22
{
	public static void main(String args[])
	{
		fib f=new fib();
		Thread t1=new Thread(f);
		even e=new even();
		Thread t2=new Thread(e);
		t2.start();
		t1.start();
		
	}
}