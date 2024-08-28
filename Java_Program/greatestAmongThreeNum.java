package practice_java;
import java.util.Scanner;
public class greatestAmongThreeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int   a=100,b=40,c=30;
		System.out.println((a>b)?((a>c)?"a is max":"c is max"):((b>c)?"b is max":"c is max"));

	}

}
