
public class Q6 {

	public static void main(String[] args) {
		System.out.println("Q6(a) \n\n");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n\n Q6(b) ");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("\n\n Q6(c) ");
		for(int i=1,ctr=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((ctr++)+"\t");
			}
			System.out.println();
		}
		System.out.println("\n\n Q6(d) ");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
