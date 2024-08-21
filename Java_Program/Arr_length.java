package practice;
import java.util.Scanner;

public class Arr_length {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the size:");
	  int size=sc.nextInt();
	  size=size+1;
	  System.out.println("Enter the numbers:");
	  int[] arr= new int[size];
	  for(int i=0;i<size;i++) {
		  arr[i]=sc.nextInt();
	  }
	  System.out.println("The length of the array is:"+arr.length);
	  
  }
}
