import java.util.Scanner;
class search{
	public static void main(String args[]){
		int f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements : ");
		int n=sc.nextInt();
		int number[] = new int[n];
		System.out.println("enter the elements : ");
		for(int i = 0; i < n; i++)
        {
            number[i] = sc.nextInt();
        }
		
		System.out.println("enter the element to search : ");
		int e=sc.nextInt();
		
		for (int i=0;i<number.length;i++){
			if(number[i]==e)
				f=1;
		}
		if(f==1)
			System.out.println("element found");
		else
			System.out.println("element not found");
	}

}