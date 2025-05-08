package com.GitHubProject2;
import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		AtmOperationImpl impl=new AtmOperationImpl();
		Scanner sc=new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.println("ENTER THE ATM NUMBER");
		int atmnum2=sc.nextInt();
		System.out.println("ENTER THE ATM PIN");
		int atmpin2=sc.nextInt();
		if(atmnumber==atmnum2 && atmpin==atmpin2) {
			while(true) {
				System.out.println(" 1.viewAvailable Balance\n 2.WithdrawAmount\n 3.DepositAmount\n 4.ViewMiniStatement\n 5.exit");
				System.out.println("Enter choice :");
				int ch=sc.nextInt();
				if(ch==1)
				{
					impl.viewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter the amount to withdraw");
					double wihtdrawamount=sc.nextDouble();
					impl.withdrawAmount(wihtdrawamount);
				}
				else if(ch==3) {
					System.out.println("Enter the amount to deposit");
					double depositAmount=sc.nextDouble();
					impl.depositAmount(depositAmount);
				}
				else if(ch==4) {
					impl.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("Collect you ATM card \n Thank you");
					System.exit(status);
				}
			}
		}
		else {
			System.out.println("INCORRECT ATM NUMBER OR PIN");
		}

	}

}
