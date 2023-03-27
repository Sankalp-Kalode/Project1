package day_3_cop;
import java.util.Scanner;


public class checkPassword {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		
		int password = 123;
				
		for(int i = 1; i<=3; i++)
		{
			
			System.out.println("Enter the password: ");
			
			int n = s.nextInt();
			
			if(n==password)
			{
				System.out.println("Accepted");
				break;
			}
			
			if(i==3)
			{
				System.out.println("Wrong password. Card blocked");
			}
			
		}
		

	}

}
