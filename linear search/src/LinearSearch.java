import java.util.Arrays;
public class LinearSearch {
	public static void main(String[] args) {
		int arr[]=new int[1000];
		int x;
		
		for(int i=0;i<=999;i++) {
			x=(int) (Math.random()*100)+1;
			arr[i]= x;
			
		}
		
		System.out.print(Arrays.toString(arr));
		System.out.print("\n");
		System.out.print("the value nuber 5 = ");
		System.out.print(arr[5]);
		System.out.print("\n");
		System.out.print("the value nuber 50 = ");
		System.out.print(arr[50]);
		System.out.print("\n");
		System.out.print("the value nuber 200 = ");
		System.out.print(arr[200]);

	}

}
