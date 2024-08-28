package practice_java;
import java.util.Scanner;
public class bruteForce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of the Array:");
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<a-1;i+=2) {
			arr[i]=arr[i]^arr[i+1];
			arr[i+1]=arr[i]^arr[i+1];
			arr[i]=arr[i]^arr[i+1];
		}
		System.out.println("The swapped adjacent digits are...");
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]);
		}
	
		
	}

}

