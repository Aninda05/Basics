import java.util.*;
class Tollboothcall{
	int count;
	double price;
	
	Tollboothcall(){
		count=0;
		price=0;
	}
	
	public void payingcar(){
		
		count++;
		price=count*.5;
	}
	public void nonpaycar(){
		count++;
		
	}
	public void display()
	{
		System.out.println("The number of cars are= "+count);
		System.out.println("The fund collected is= "+price);
	}
}
class Tollbooth{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int c,i=1;
		System.out.println("Enter number of cars");
		int car=sc.nextInt();
	        Tollboothcall to=new Tollboothcall();

		while(i<=car){
			System.out.println("1.Paying");
			System.out.println("2.Non Paying");
			System.out.println("3.Price");
			System.out.println("4.Exit");
			System.out.println("Give the option");
			c=sc.nextInt();
			switch(c){
				case 1:
					to.payingcar();
					break;
				case 2:
					to.nonpaycar();
					break;
				case 3:
					to.display();
					System.out.println("Bye...");
					break;
				case 4:
					return;
				default:
					System.out.println("Invalid choice");
				}
			i++;
			}
		}
	}
	
	

		
