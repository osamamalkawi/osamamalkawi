import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		int op1,op2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first operand : ");
		op1 = sc.nextInt();
		System.out.print("enter the second operand : ");
		op2 = sc.nextInt();
		
		
		System.out.println("1-addition");
		System.out.println("2-subtraction");
		System.out.println("3-multiplication");
		System.out.println("4-division");
		
		int opp,ans;
		System.out.print("enter the no. of opperation you want :");
		opp = sc.nextInt();
		
		switch(opp) {
		case 1:
			ans=op1+op2;
			System.out.print("ans :"+ans);
			break;
		case 2:
			ans=op1-op2;
			System.out.print("ans :"+ans);
			break;
		case 3:
			ans=op1*op2;
			System.out.print("ans :"+ans);
			break;
		case 4:
			ans=op1/op2;
			System.out.print("ans :"+ans);
			break;
			default :
			System.out.print("in valid opperation");
		}

		
		
	}
}
