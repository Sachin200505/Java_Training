package practice_java;
import java.util.Scanner;
public class train {
public static void main(String[] args) {
	System.out.println("Welcome to the Danish Express..!!!");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Seat Number:");
	int seatNo=sc.nextInt();
	if (seatNo<=72) {
	 
	    if(seatNo==72) {
			System.out.println("Your Room No is 9");
	  }
	    else {
	        int roomNo=(seatNo/8)+1;
		    System.out.println("Your Room No is "+roomNo);
	  }
	    int seat=seatNo%8;
	  switch(seat) {
	  case 1:
		  System.out.println("Left Upper Birth");
		  break;
	  case 2:
		  System.out.println("Left Middle Birth");
		  break;
	  case 3:
		  System.out.println("Left Lower Birth");
		  break;
	  case 4:
		  System.out.println("Right Upper Birth");
		  break;
	  case 5:
		  System.out.println("Right Middle Birth");
		  break;
	  case 6:
		  System.out.println("Right Lower Birth");
		  break;
	  case 7:
		  System.out.println("Side Upper Birth");
		  break;
	  case 8:
		  System.out.println("Side Lower Birth");
		  break;
	  case 0:
		  System.out.println("Side Lower Birth");
		  break;
		}
	}
	else {
		System.out.println("There are only 72 seats are available...");
	}
	
	System.out.println("Enjoy your day with Danish Express...!!!");
	}
}
