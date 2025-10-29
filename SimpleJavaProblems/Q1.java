import java.util.*;
class Q1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.next Int();
		int m=a>b?a:b;
		int s1=0,s2=0;
		for(int i=1;i<m/2;i++) {
			if(a%i==0)
				s1=s1+i;
			if(b%i==0)
				s2=s2+i;
		}
		if(s1==b && s2==a)
			System.out.println("Amicable Pair");
		else
			System.out.println("Not Amicable pair");
	}

}
