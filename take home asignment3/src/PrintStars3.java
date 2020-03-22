import java.util.Scanner;
public class PrintStars3 {

	public static void main(String [] arg) {
		int n,i,j;
		System.out.print("please enter the number of stars of the base : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		for (i=1;i<=n;i++) {
			
			for (j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");	
		}
	}
}
