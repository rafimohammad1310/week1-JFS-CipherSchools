import java.util.Scanner;

public class lecture3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic pay of Employee");
		double hra=0; double da=0;
		double num=sc.nextInt();
		if(num>=5000) {
			hra=0.1*num;
			da=0.2*num;
		}
		else{
			hra=0.2*num;
			da=0.3*num;
		}
		System.out.println(hra+" "+da);
		System.out.println("GrossPay= "+(hra+da));
		
		
	}

}
