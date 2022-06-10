import graphics.rect;
import graphics.circle;
import graphics.square;
import graphics.tri;
import java.util.Scanner;
public class package1{
	public static void main(String args[])
	{
		circle c=new circle();
		rect r=new rect();
		square s=new square();
		tri t=new tri();
		Scanner sc=new Scanner(System.in);
		int opt;
		do
		{
			System.out.println("\nEnter your choice\n1.Rectangle\n2.Circle\n3.Square\n4.Triangle\n5.exit");
			opt=sc.nextInt();                                                                       
			switch(opt)
			{
			case 1:r.read();
					r.area();
					
					break;
			case 2:	c.read();
					c.area();
					
					break;
			case 3:	s.read();
					s.area();
					
					break;
			case 4:	t.read();
					t.area();
					
					break;
			case 5:break;
			default: System.out.println("Invalid Input!!");

				}

		}while(opt!=5);
	}
}

