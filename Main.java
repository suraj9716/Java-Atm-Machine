import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AtmOperation op = new AtmOperationImpl();
		
		int atmNumber = 12345;
		int atmPin = 123;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Suraj ATM");
		System.out.println("Enter ATM Number");
		int atmnum = sc.nextInt();
		
		System.out.println("Enter pin");
		int pin = sc.nextInt();
		
		if((atmNumber==atmnum) && (atmPin==pin)) {
		while(true) {
			System.out.println("***************************************");
			System.out.println("1. View Available balance");
			System.out.println("2. Withdraw money");
			System.out.println("3. Deposite amount");
			System.out.println("4. View Mini statement");
			System.out.println("5. Exit from application");
			
			System.out.println("***************************************");
			
			System.out.println("Enter choice");
			int ch = sc.nextInt();
			if(ch==1) {
				op.viewBalance();
			}
			else if(ch==2) {
				System.out.println("Enter Amount to Withdraw");
				double withdrawAmt = sc.nextDouble();
				op.withdrawAmount(withdrawAmt);
				
			}
           else if(ch==3) {
				System.out.println("Enter Amount to Deposit");
				double depositAmount = sc.nextDouble();
				op.depositAmount(depositAmount);
			}
           else if(ch==4) {
				op.viewMiniStatement();
			}
           else if(ch==5) {
				System.out.println("Collect you ATM CARD");
				System.out.println("Thankyou for chossing Suraj ATM");
				System.exit(0);
			}
           else {
        	   System.out.println("Please enter correct choice ");
           }
		}
		}
		else {
			System.out.println("Incorrect ATM Number or pin");
			System.exit(0);
		}
	}
}
