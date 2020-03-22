import java.util.Scanner;
public class PrintStars2 {

	public static void main(String [] arg) {
		int i,j,k,n;
		
		System.out.print("please enter the length :");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		System.out.print("plese enter the width :");
		n = sc.nextInt();
		
		for (i=1;i<=k;i++) {
			
			for(j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
