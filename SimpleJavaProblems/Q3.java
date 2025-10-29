import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		while(a<=b) {
			boolean f=true;
			for(int i=2;i<a/2 && f;i++) {
				if(a%i==0)
					f=false;
			}
			if(f)
				System.out.print(a+" ");
			a++;
		}
	}
}
