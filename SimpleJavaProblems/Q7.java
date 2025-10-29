
public class Q7 {

	public static void main(String[] args) {
		System.out.println("Q7(a) \n\n");
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch++ +" ");
			}
			System.out.println();
		}
		System.out.println("\n\n Q7(b) ");
		for(int i=1;i<=5;i++) {
			for(int j=i;j>0;j--) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		System.out.println("\n\n Q7(c) ");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}

