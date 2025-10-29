import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		double sum=0;
		for(int i=1;i<=a;i++)
			sum=sum+(1/(i*i));
		System.out.println(sum);
	}

}
