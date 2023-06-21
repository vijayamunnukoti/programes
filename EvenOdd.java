import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	int sum1=0,sum2=0;
	int result;
		Scanner obj=new Scanner(System.in);
	System.out.println("enter the first num");
	int a=obj.nextInt();
	System.out.println("enter the last num");
	int b=obj.nextInt();
	int i=a;
	for(i=a;i<=b;i++) {

	if( i%2==0)
	
		{
			sum1=sum1+i;
		}
	
 else
	 {
   sum2=sum2+i;
	 }
 	
}
	System.out.println("sum of  even numbers is"+sum1);
System.out.println("sum of  odd numbers is"+sum2);
result=sum1-sum2;
System.out.println("the result is "+result);
	}
	}
