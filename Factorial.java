import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,fact=1;
		System.out.println("enter number from user");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		 {
				fact=fact*i;
		}
			System.out.println("the factorial of given num is "+fact);
			
	}

}
