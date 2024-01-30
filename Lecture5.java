import java.util.Scanner;

public class lecture5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your speed : ");
		int speed=sc.nextInt();
		System.out.println("Is toady is your birthday? : ");
		boolean isBirthDay=sc.nextBoolean();
		if(isBirthDay==true) {
			speed-=5;
		}
		if(speed>80) {
			System.out.println("High Ticket");
		}
		else if(speed>=60 && speed<=80) {
			System.out.println("Mid Ticket");
		}
		else {
			System.out.println("No Ticket");
		}
		
	}

}
