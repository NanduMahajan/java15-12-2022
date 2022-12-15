// WAP to  check entered password is correct 
package oops;

import java.util.Scanner;

public class product1 {

	public static void main(String[] args) {
		
        int pass = 1234;
        int count=0;
     
		Scanner scan = new Scanner(System.in);

	    //input marks from user 
		for(int i=1; i<=4; i++) {
		System.out.println("pass");
		pass=scan.nextInt();
		//logic
		
		if(pass==1234) {
		System.out.println("correct,welcome back");
		break;
		}else
		{System.out.println("incorrect password ");
		count++;
	
		 if(count>3) {
		    	System.out.println("you exceeded limit to enter pass");	
		    }
		}
		
		}
	
		scan.close();
	}
}