package code;

import java.io.IOException;
import java.util.Scanner;

public class HomeFile
{
	public static void HomeFunction() throws IOException
	{
		Scanner input = new Scanner(System.in);
		running:
			 while (true)
			 {
						System.out.println("");
						System.out.println("Select Option What You Want ");
						System.out.println("");
						System.out.println("1.Profile");
						System.out.println("2.SendMoney");
						System.out.println("3.CheckBalance");
						System.out.println("4.TranscationHistory");
						System.out.println("5.ViewPassBook");
						System.out.println("6.Settings");
						System.out.println("7.LogOut(means Delete Entire BankAccount Detailes)");
						System.out.println("8.Exit");

						System.out.println("Enter your choice(1,2,3,4,5,6,7) : ");
						int choice = input.nextInt();

						switch (choice)
						{
								case 1:ProfileFile.ProfileFunction();
												break;
								case 2:features.WaysToSendMoney();
												break;
								case 3:features.CheckBalance();
												break;
								case 4:System.out.println("Here you can See Last Transaction only");
												viewUsrBankReletedDetailes.viewLastTransactionInPassbook();
												break;
								case 5:viewUsrBankReletedDetailes.viewPassBookInterFace();
											  viewUsrBankReletedDetailes.viewLastTransactionInPassbook();
												break;
								case 6:System.out.println("you are going back.....");
												System.out.println("");
											 	break running;
								case 7:Settings.LogOutmethod();
												break;
								case 8:System.out.println("Exiting the Application...");
												System.exit(0);
								default:System.out.println("Invalid choice. Please try again.");
												break;
					}
			}
			//input.close();
	}
}
