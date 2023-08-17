
import java.util.Scanner;
class DominosReturn03
{
	public static void m()
	{
		System.out.println("--------------------Welcome to Java Food Court :--------------------");
		System.out.println("For Vegetarian:--=> press 1");
		System.out.println("For Non-Vegetarian:--=> press 2");
		System.out.println("Enter Choice");
	}
	public static void m1(int n)
	{

		switch(n)
		{	case 1:
				System.out.println(" for Margerita--=> press A:");
				System.out.println(" for Chinese--=> press B:");
				System.out.println(" for Double Cheese Margerita--=> press C:");
				System.out.println(" for FarmHouse--=> press D:");
				System.out.println(" for Deluxe Veggie--=> press E:");
				System.out.println(" for Mexican Green Wave--=> press F:");
				System.out.println(" for Peppy Paneer--=> press G:");
				break;
			case 2:
				System.out.println(" for Chicken Sausage--=> press A:");
				System.out.println(" for Pepper Barbecue Chicken--=> press B:");
				System.out.println(" for Chicken Golden Delight--=> press C:");
				System.out.println(" for Chicken Fiesta--=> press D:");
				System.out.println(" for Chicken Dominator--=> press E:");
				System.out.println(" for Non-Veg Supreme--=> press F:");
				System.out.println(" for Indi-Chicken Thikka--=> press G:");
		}
	}
	public static int m2(int vegDish)
	{
		int a=0;
		switch(vegDish)
					{
					case 'A':
						a=200;
						System.out.println("Margerita : 200/- ");break;
					case 'B':
						a=150;
						System.out.println("Chinese : 150/- ");break;
					case 'C':
						a=250;
						System.out.println("Double Cheese Margerita : 250/- ");break;
					case 'D':
						a=350;
						System.out.println("FarmHouse : 350/- ");break;
					case 'E':
						a=220;
						System.out.println("Deluxe Veggie : 220/- ");break;
					case 'F':
						a=230;
						System.out.println("Mexican Green Wave : 230/- ");break;
					case 'G':
						a=130;
						System.out.println("Peppy Paneer : 130/- ");break;
					}
		return a;
	}
	public static int m3(int nonVeg)
	{
		int b=0;
		switch(nonVeg)
					{
					case 'A':
						b=180;
						System.out.println("Chicken Sausage : 180/- ");break;
					case 'B':
						b=250;
						System.out.println("Pepper Barbecue Chicken : 250/- ");break;
					case 'C':
						b=320;
						System.out.println("Chicken Golden Delight : 320/- ");break;
					case 'D':
						b=230;
						System.out.println("Chicken Fiesta : 230/- ");break;
					case 'E':
						b=270;
						System.out.println("Chicken Dominator : 270/- ");break;
					case 'F':
						b=380;
						System.out.println("Non-Veg Supreme : 380/- ");break;
					case 'G':
						b=350;
						System.out.println("Indi-Chicken Thikka : 350/- ");
					}
		return b;
	}
	public static int reorder()
	{
		int bil=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------Do you want to Order one More..--------------------");
		System.out.println("Press 1 for reorder..");
		System.out.println("press 2 for continue to bill...");
		int p = scan.nextInt();
		switch(p)
		{
			case 1:
				m();
				int choice=scan.nextInt();
				m1(choice);
				{
					switch(choice)
					{
						case 1:
							System.out.println(" Enter Your Option:");
							char veg = scan.next().charAt(0);
							bil=m2(veg);
							break;
						case 2:
							System.out.println(" Enter Your Option:");
							char nonV = scan.next().charAt(0);
							bil=m3(nonV);
							break;
					}
				}
							
			case 2:
				break;	
		}
		return bil;
	}
	public static void cool()
	{
		System.out.println("--------------------Do you want Drinks/Icecreams : --------------------");
		System.out.println("for Yes--=> Y");
		System.out.println("for No--=>X");
	}
	public static void icecool()
	{
				System.out.println("Cool Drinks--=>press 1");
				System.out.println("Ice Creams--=>press 2");

	}
	public static void cooldrinks()
	{

				System.out.println("Thumpsup--=>press 1");	
				System.out.println("Sprite--=>press 2");
				System.out.println("Maaza--=>press 3");	
				System.out.println("Pulpy Orange--=>press 4");
	}
	public static void icecream()
	{
		System.out.println("Venilla--=>press 1");	
		System.out.println("Chocolate--=>press 2");
		System.out.println("Darkcream--=>press 3");	
		System.out.println("Pineapple--=>press 4");
	}
	
	public static int m4(int n)
	{
		int bill4=0;
		switch(n)
		{
			case 1:
				System.out.println("Thumpsup 500ml : 50/- ");
				bill4=50;
				break;
			case 2:
				System.out.println("Sprite 500ml : 40/- ");
				bill4=40;
				break;
			case 3:
				System.out.println("Maaza 500ml : 50/- ");
				bill4=50;
				break;
			case 4:
				System.out.println("Pulpy Orange 500ml : 40/- ");
				bill4=40;
				break;
		}
		return bill4;
	}
	public static int m5(int n)
	{
		int bill5=0;
		switch(n)
		{
			case 1:
				System.out.println("Venilla 50g : 50/- ");
				bill5=50;
				break;
			case 2:
				System.out.println("Chocolate 50g : 40/- ");
				bill5=40;
				break;
			case 3:
				System.out.println("Darkcream 50g : 50/- ");
				bill5=50;
				break;
			case 4:
				System.out.println("Pineapple 50g : 40/- ");
				bill5=40;
				break;
		}
		return bill5;
	}
	public static int recool()
	{
		int billc=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------Do you want to Order One More icecream/cooldrink..--------------------");
		System.out.println("Press 1 for reorder..");
		System.out.println("press 2 for continue to bill...");
		int p = scan.nextInt();
		switch(p)
		{
			case 1:
				icecool();
				{
					int cool2=scan.nextInt();
					switch(cool2)
					{
						case 1:
							cooldrinks();
							int cool3=scan.nextInt();
							billc=m4(cool3);
							break;
						case 2:
							icecream();
							int cool4=scan.nextInt();
							billc=m5(cool4);
							break;
					}
			
				}
			case 2:
				break;
		}
		return billc;

	}
	public static void payment()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Please Select payment mode");
		System.out.println(" for Credit/ Debit card---=>Press 1");
		System.out.println(" for Upi payment---=>Press 2");
		System.out.println(" for Cash---=>Press 3");
		int pay=scan.nextInt();
		switch (pay)
		{
			case 1:
				System.out.println("please Give Us your card details");
				System.out.println("Enter your card details:");
				System.out.println("Enter your card number:");
				int card=scan.nextInt();
				System.out.println(card);
				System.out.println("Enter your card four digit pin:");
				int cardpin=scan.nextInt();
				System.out.println("* * * *");
				System.out.println("Your payment is Processing.....");
				System.out.println("please wait a for a minute----");
				System.out.println("Your Payment is Successfull....ThankYou...");
				break;
			case 2:
				System.out.println("Enter UPI number:");
				String upi = scan.next();
				System.out.println("Your UPI number is:"+ upi);
				System.out.println("Press=> 1 for Confirm");
				System.out.println("Press=> 2 for Re-enter upi number");
				int upiVer=scan.nextInt();
				switch (upiVer)
				{
					case 1:
						System.out.println("----Thank You----:");
						System.out.println("Your payment is Processing.....");
						System.out.println("please wait a for a minute----");
						System.out.println("Your Payment is Successfull....ThankYou...");
						break;
					case 2:
						String upi0 = scan.nextLine();
						String upi1 = scan.nextLine();
						System.out.println("Your UPI number is:"+upi1);
				
						System.out.println("Your payment is Processing.....");
						System.out.println("please wait a for a minute----");
						System.out.println("Your Payment is Successfull....ThankYou...");
						break;
				}
				break;
				
			case 3:
				System.out.println("Please pay the cash at counter");
				System.out.println("ThankYou Sir");
				break;
		}
	}
	public static void rating()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Could You give us the Rating ----");
		System.out.println();
		System.out.println("Excellent - Press 1");
		System.out.println("Very Good- Press 2");
		System.out.println("Good- Press 3");
		System.out.println("Not Bad- Press 4");
		System.out.println("Very Bad- Press 5");
		int rat=scan.nextInt();
		switch (rat)
		{
		case 1:
			System.out.println("Thanks For Giving the Excellent Rating----Have a Good Day");break;
		case 2:
			System.out.println("Thanks For Giving the Very Good Rating----Have a Good Day");break;
		case 3:
			System.out.println("Thanks For Giving the Good Rating----Have a Good Day");break;
		case 4:
			System.out.println("Thanks For Giving the Rating----Have a Good Day");break;
		case 5:
			System.out.println("Sorry for the inconvinience.. we will improve the Service---Have a Good Day");break;

		}
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		m();
		int bill=0;
		int choice=scan.nextInt();
		m1(choice);
		{
			switch(choice)
			{
			case 1:
				System.out.println(" Enter Your Option:");
				char veg = scan.next().charAt(0);
				bill=m2(veg);
				
				break;
			case 2:
				System.out.println(" Enter Your Option:");
				char nonV = scan.next().charAt(0);
				bill=m3(nonV);
				
				break;
			}	
		}
		int bill2=reorder();
		cool();
		int billcool=0;
		char cool1=scan.next().charAt(0);
		switch (cool1)
		{
		case 'Y':
			icecool();
			{
				int cool2=scan.nextInt();
				switch(cool2)
				{
					case 1:
						cooldrinks();
						int cool3=scan.nextInt();
						billcool=m4(cool3);
						break;
					case 2:
						icecream();
						int cool4=scan.nextInt();
						billcool=m5(cool4);
						break;
				}
			
			}
		case 'X':
			break;
		}
		int billcool2=recool();
		int bill3=bill+bill2+billcool+billcool2;
		double totalbill=(bill3+(bill3*0.24));
		System.out.println();
		System.out.println("----------The Bill is =   " +bill3);
		System.out.println();
		System.out.println("----------SGST : "+(bill3/12));
		System.out.println();
		System.out.println("----------CGST : "+(bill3/12));
		System.out.println();
		System.out.println("----------Total Bill is =   "+totalbill);
 
		payment();
		rating();
	}
}
