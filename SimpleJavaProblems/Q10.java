import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1,c=1;
		System.out.print(a+"\t"+b+"\t"+c+"\t");
		for(int i=3;i<n;i++) {
			int temp=c;
			c=a+b+c;
			b=temp;
			a=c-a-temp;
			System.out.print(c+"\t");
		}
	}

}
