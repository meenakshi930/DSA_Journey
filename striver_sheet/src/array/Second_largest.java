package array;
import java.util.Scanner;

public class Second_largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();		}
		int max=arr[0];
		int s_max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>s_max && arr[i]<max) {
				s_max=arr[i];
			}
		}
		sc.close();
		System.out.print("second largest number:"+s_max);
	}

}
