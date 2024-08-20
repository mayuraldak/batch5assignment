import java.util.Scanner;

public class CheckEven{
	
		public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number : ");
		int userInput = sc.nextInt();
		
		if(userInput % 2 == 0) {
<<<<<<< HEAD
			System.out.println("The number : " + userInput + " Is even.");
		}else {
			System.out.println("The number : " + userInput + " is odd.");			
		}
		
	
=======
			System.out.println("The number: " + userInput + " Is even.");
		}else {
			System.out.println("The number: " + userInput + " is odd.");			
		}
>>>>>>> ef2eddfb08f7c733152ceb0448c2c24109855b3e
	
	}
}