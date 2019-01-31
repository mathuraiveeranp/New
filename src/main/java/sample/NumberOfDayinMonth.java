package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfDayinMonth {

	public static void main(String[] args) {
		int month, year = 0;
		String monthName =" ";
		
		boolean flag = false;
		
		System.out.println("To find the number of days of a month in any year\n");
				
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the year :\n");
		year = scan.nextInt();
		System.out.println("Enter the month :\n");
		month = scan.nextInt();
		
		System.out.println("month: "+month);
		
		switch (month) {
		
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		/*default:
			System.out.println("Enter a valid month \n");*/
			
		}
		
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 ==0)
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
			}
			else
			{
				flag = true;
			}
		}
		
		/*List <Integer> monthList = new ArrayList<Integer>();
		monthList.add(month);*/
				
		List <Integer> evenMonth = new ArrayList<Integer>();
		evenMonth.add(4);
		evenMonth.add(6);
		evenMonth.add(9);
		evenMonth.add(11);
		//evenMonth.add(12);
		//evenMonth.add(11);
		
		List <Integer> oddMonth = new ArrayList<Integer>();
		//oddMonth.add(2);
		oddMonth.add(1);
		oddMonth.add(3);
		oddMonth.add(5);
		oddMonth.add(7);
		oddMonth.add(8);
		oddMonth.add(10);
		oddMonth.add(12);
		
		
		if (oddMonth.contains(month))
		{
			System.out.println(monthName+ " " +year+" has  31 days \n");
			
		}
		else if(evenMonth.contains(month))
		{
			System.out.println(monthName+ " " +year+" has  30 days \n");
		}
		
		
		if (month == 2)
		{
			if (flag == true)
			{
				System.out.println(monthName+ " " +year+" has  29 days \n");
						
			}
			else
			{
				System.out.println(monthName+ " " +year+" has  28 days \n");
			}
			
		}

	}

}

