import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int m=a>b?a:b;
		for(int i=a+b-m;i<=m;i++) {
			int p=1;
			for(int t=i;t>0;t--) {
					p=p*t;
			}
			System.out.println("The Factorial of "+i + " is "+p);
		}
	}

}
