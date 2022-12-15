package oops;

import java.util.Scanner;

public class newprogram {

	public static void main(String[] args) {
	
		int firstNum;
		int secondNum;
		int evensum=0;
		int oddsum=0;
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		
		//input number
		System.out.println("firstNum");
		firstNum=scan.nextInt();
		
		System.out.println("secondNum");
		secondNum=scan.nextInt();
		
		//logic
		while(firstNum<=secondNum) 
		{
			if(firstNum%2==0) {
			
				evensum=evensum+firstNum;
				firstNum++;
						}
		       else
					{oddsum=oddsum+firstNum;
			       firstNum++;
					}
		} 
		sum=evensum+oddsum;
		
		System.out.println("sum of even digits"+evensum);
		System.out.println("sum of odd digits"+oddsum);
		System.out.println("sum of digits"+ sum);
	}

}
