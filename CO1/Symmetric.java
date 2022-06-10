import java.util.Scanner;
class Symmetric
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int r=sc.nextInt();
		System.out.println("Enter the number of cols: ");
		int c=sc.nextInt();
		if(r!=c)
		{
			System.out.println("not possible ");
			return;
		}
		int m[][]=new int[r][r];
		System.out.println("Enter elements of the matrix : ");
		for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < r; j++)
        {
            m[i][j] = sc.nextInt();
        }
        }
		System.out.println("Transpose matrix : ");
		int n[][]=new int[r][r];
		for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < r; j++)
        {
            n[i][j] = m[j][i];
        }
        }
		for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < r; j++)
        {
            System.out.print(n[i][j]+" ");
        }
		System.out.println();
        }
		for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < r; j++)
        {
            if(m[i][j]==n[i][j])
				flag=flag+1;	
        }
        }
		if(flag==r*r)
			System.out.println("This is a symmetric matrix");
		else
			System.out.println("This is not a symmetric matrix");
}
}