import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				sum=sum+j;
			}
		}
		System.out.println(sum);
	}

}
