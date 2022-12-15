package oops;

import java.util.Scanner;

public class countdigits {

	public static void main(String[] args){
		int num;
        int count=0;
		Scanner scan = new Scanner(System.in);

	   // input number from user 
		
		System.out.println("enter number ");
		num=scan.nextInt();
		//logic
	 
		while(num>0)
		{
			  count++;
		      num =num/10;
		}
		System.out.println("count"+count);
		scan.close();
	}
}