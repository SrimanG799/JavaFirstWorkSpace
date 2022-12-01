package com.kumar;
import java.util.Scanner;

public class NestedSWitch {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select ur language");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
		{ 
			System.out.println("ur selected for teluigu language");
			System.out.println("select ur service");
			System.out.println("1 for reacharge");
			System.out.println("2 for balance enquairy");
			System.out.println("3 for contact to costumer care");
			int opt=sc.nextInt();
			switch(opt)
			{
			case 1:
			{
				System.out.println("ur requst for reachrge is in process");
				int plan=sc.nextInt();
				switch(plan)
				{
				case 1:
				{
					System.out.println("ur selected unlimited calls option ");
					break;
				}
				case 2:
				{
					System.out.println("28 days callas and 1gb per day rs 249");
					break;
				}
				case 3:
				{
					System.out.println("28 days calls and 1.5 gb per day ra 299");
					break;
						
				}
				
			
			}
				break;
			}
			case 2:
			{
				System.out.println("Ur requesrt for balance enquery is in process");
				break;
			}
			case 3:
			{
				System.out.println("ur request for costomer care is in process");
			}
			}
			
			break;
			
			
			
		}
		case 2:
		{
			System.out.println("ur selected for hindhi language");
		
			System.out.println("select ur service");
			System.out.println("1 for reacharge");
			System.out.println("2 for balance enquairy");
			System.out.println("3 for contact to costumer care");
			int opt=sc.nextInt();
			switch(opt)
			{
			case 1:
			{
				System.out.println("ur requst for reachrge is in process");
				System.out.println("select reacharge plan");
				System.out.println("1 for unlimited calls for 28days 150rs");
				System.out.println("2 for 28 days callas and 1gb per day rs 249");
				System.out.println("3 for 28 days calls and 1.5 gb per day ra 299");
				System.out.println("4 for 56 dayas calls and 2 gb per day rs 459");
				
				int plan=sc.nextInt();
				switch(plan)
				{
				case 1:
				{
					System.out.println("ur selected unlimited calls option ");
					break;
				}
				case 2:
				{
					System.out.println("28 days callas and 1gb per day rs 249");
					break;
				}
				case 3:
				{
					System.out.println("28 days calls and 1.5 gb per day ra 299");
					break;
						
				}
				case 4:
				{
					
				}
				}
				break;
			}
			case 2:
			{
				System.out.println("Ur requesrt for balance enquery is in process");
				break;
			}
			case 3:
			{
				System.out.println("ur request for costomer care is in process");
			break;
			}
			}
		}
		case 3:
		{
			System.out.println("ur selected for english language");
	
			System.out.println("select ur service");
			System.out.println("1 for reacharge");
			System.out.println("2 for balance enquairy");
			System.out.println("3 for contact to costumer care");
			int opt=sc.nextInt();
			switch(opt)
			{
			case 1:
			{
				System.out.println("ur requst for reachrge is in process");
				break;
			}
			case 2:
			{
				System.out.println("Ur requesrt for balance enquery is in process");
				break;
			}
			case 3:
			{
				System.out.println("ur request for costomer care is in process");
			break;
		}
	
		}
			break;
		}
	}
	}
}

