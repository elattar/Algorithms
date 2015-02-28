import java.util.Scanner;


public class Karatsuba {
	
	public int multiply(int num1 , int num2)
	{
		int len = Math.max(getLength(num1) , getLength(num2));
		
		if (len < 10)
			return (num1 * num2);
		
		len = (len/2) + (len%2) ;							// to make power 
		int xl, xr, yl, yr;	
		
		xr = (int) (num1 % (Math.pow(10, (double)len)) );	// to calculate remainder num1
		xl = num1 - xr;										// to calculate whole num1
		xl = (int) ( xl / (Math.pow(10, (double)len)) );
		yr = (int) (num2 % (Math.pow(10, (double)len)) );	// to calculate remainder num2
		yl = num2 - yr;										// to calculate whole num2
		yl = (int) ( yl / (Math.pow(10, (double)len)) );
		
		int z0 = multiply(xl , yl);
		int z1 = multiply(xr , yr);
		int z2 = ( multiply((xl+xr),(yl+yr)) - z0 - z1 );
		
		return z2;
	}
	public int getLength (int num)
	{
		int c = 0;
		while (num > 0)
		{
			num /= 10;
			c++;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Karatsuba k = new Karatsuba();
		int num1 , num2;
		System.out.print("Enter first number please : ");
		num1 = scan.nextInt();
		System.out.print("Enter second number please : ");
		num2 = scan.nextInt();
		System.out.println( "The Result is : " + k.multiply(num1 , num2));

	}

}
