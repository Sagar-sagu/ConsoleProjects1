package code;

//imported dependencies packages
import java.io.IOException;
import java.util.Scanner;
import database.code.*;

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
						System.out.println("1.Profile");
						System.out.println("2.SendMoney");
						System.out.println("3.CheckBalance");
						System.out.println("4.TranscationHistory");
						System.out.println("5.ViewPassBook");
						System.out.println("6.Settings");
						System.out.println("7.ClearData(means Delete Entire All Detailes)");
						System.out.println("8.Exit");
						System.out.println("9.Back");
						System.out.println("");
						System.out.println("Enter your choice(1,2,3,4,5,6,7,8,9) : ");
						int choice = input.nextInt();

						switch (choice)
						{
								case 1:ProfileFile.ProfileFunction();
												break;
								case 2:features.WaysToSendMoney();
												break;
								case 3:features.CheckBalance();
												break;
								case 4:viewUsrBankReletedDetailes.ViewTransactionHistory();
												break;
								case 5:viewUsrBankReletedDetailes.ViewPassBookInterFace();
											  viewUsrBankReletedDetailes.ViewLastTransactionInPassbook();
												break;
								case 6: SettingsFile.settings();
												break;
								case 7:DeleteUserDetailsFromDatabase.ClearUserDetails();
                        System.out.println("Delete all Details Successfully...");
												System.exit(0);
								case 8:System.out.println("Exiting the Application...");
												System.exit(0);
								case 9:System.out.println("you are going back.....");
												System.out.println("");
											 	break running;
								default:System.out.println("Invalid choice. Please try again.");
												break;
					   }
			}
	}
}
