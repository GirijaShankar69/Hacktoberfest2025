import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int rev=0;
		for(int i=a;i!=0;i=i/10) {
			rev=rev*10+i%10;
		}
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				System.out.println("NOT TWISTED PRIME");
				System.exit(0);
			}
			
		}
		for(int i=2;i<rev;i++) {
			if(rev%i==0) {
				System.out.println("NOT TWISTED PRIME");
				System.exit(0);
			}
		}
		System.out.println("Twisted Prime ");

	}

}
