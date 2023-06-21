import java.util.Scanner;

public class SumOfNum {

	public static void main(String args[])
	{
		int i=1,n,sum=0;
		System.out.println("enter number from user");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
			System.out.println("the sum of numbers is "+sum);
			
		}
	}

