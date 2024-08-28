package practice_java;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,s=0;
		for(int i=n;i>0;i=i/10) {
			int r=i%10;
			rev=rev*10+r;
		}
		for(int i=rev;i>0;i=i/100) {
			int r=i%100;
			s=s*100+r;
		}
		System.out.print(s);
	}

}
