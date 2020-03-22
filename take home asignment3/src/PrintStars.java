import java.util.Scanner;
public class PrintStars {
	
	public static void main(String [] arg){
		
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter the number of stars :");
		n = sc.nextInt();
		for(i=1;i<=n;i++) {
			System.out.print("*");
		}
		
	}

}
