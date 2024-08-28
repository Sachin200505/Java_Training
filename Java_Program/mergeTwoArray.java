package practice_java;
import java.util.Arrays;
import java.util.Scanner;
public class mergeTwoArray {

	public static void main(String[] args) {
		Scanner aakash=new Scanner(System.in);
		System.out.println("Enter the length:");
		int n=aakash.nextInt();
		int m=aakash.nextInt();
		int varuna[]=new int[n];
		int keerthana[]=new int[m];
		for(int i=0;i<n;i++) {
			varuna[i]=aakash.nextInt();
		}
		for(int i=0;i<m;i++) {
			keerthana[i]=aakash.nextInt();
		}
		int o=n+m;
		int Santhoshh[]=new int[o];
		int c=0; 
		for(int i=0;i<n;i++) {
			Santhoshh[c++]=varuna[i];
		}
		for(int i=0;i<m;i++) {
			Santhoshh[c++]=keerthana[i];
		}
		Arrays.sort(Santhoshh);
	    int soni[]=new int[100];
        for(int i=0;i<o;i++) {
       	 soni[Santhoshh[i]]++;
        }
        for(int i1=0;i1<o;i1++) {
       	 if(soni[Santhoshh[i1]]>0)
       		 System.out.print(Santhoshh[i1]);
       	 soni[Santhoshh[i1]]=0;
        }
	}
}
