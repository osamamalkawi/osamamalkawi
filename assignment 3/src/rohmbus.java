import java.util.Scanner;

public class rohmbus {

	public static void main(String[] arg) {
		System.out.print("please enter the amount of stars : ");
		Scanner sc = new Scanner(System.in);

		int s;
		s = sc.nextInt();
		int space=s-1;
		for (int i = 1;i <= s;i++) {
			
			for(int j = 1;j <= space;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j <= i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
			space--;
		}
		space=0;
		
		for(int a=s;a>0;a--) {
			for(int b = 1;b <= space;b++) {
				System.out.print(" ");
		}
			for(int b = 1;b <= a;b++) {
				System.out.print("* ");
			}
				System.out.print("\n");
				space++;
			}
	}
}
