package practice_java;
import java.util.Scanner;
public class Problem_Solving {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length:");
     int a=sc.nextInt();
     int[] arr=new int[a];
     for(int i=0;i<a;i++) {
    	 arr[i]=sc.nextInt();     }

	
	for (int i=0;i<a;i++) {
   System.out.println("The output  is: 3"+arr[i]);
	}
	}
}
