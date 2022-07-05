import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

class FileOdd
{
	public static void main(String args[])
	{
		int x;
		try
		{
			
			File ob=new File("oddoreven.txt");
			FileWriter o=new FileWriter("even.txt");
			FileWriter e=new FileWriter("odd.txt");
			
			
			Scanner sc=new Scanner(ob);
			while(sc.hasNextLine())
			{
				x=(int)sc.nextInt();
				if(x%2==0)
				{
					o.write(" ");
					o.write(String.valueOf(x));
				}
				else
				{
					e.write(" ");
					e.write(String.valueOf(x));
				}
			}
			o.close();
			e.close();
			
		}
	

		catch(Exception e)
		{

		}
	}
}