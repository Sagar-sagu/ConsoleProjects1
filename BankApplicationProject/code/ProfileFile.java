package code;

//imported dependencies packages
import java.io.IOException;
import java.util.Scanner;
import database.code.ReadUserDetailsFromDatabase;

public class ProfileFile
{
	public static void ProfileFunction() throws IOException
	{
		Scanner scan = new Scanner(System.in);

			System.out.println("");
			System.out.println("Welcome to your profile");
			System.out.println("Here you can view and update your details.");
			System.out.println("Except UPI Id");
			System.out.println("");
			//call read Methodes
			ReadUserDetailsFromDatabase.readLoginUserName();
			ReadUserDetailsFromDatabase.readUserId();
			ReadUserDetailsFromDatabase.readUserSecurityPIN();
			ReadUserDetailsFromDatabase.readUserUPIid();
			System.out.println("Name :- " + ReadUserDetailsFromDatabase.LoginUserName);
			System.out.println("UserID :- " + ReadUserDetailsFromDatabase.UserID);
			System.out.println("SecurityPIN :- " + ReadUserDetailsFromDatabase.securityPIN);
			System.out.println("UPI Id :- " + ReadUserDetailsFromDatabase.UserUPIid);
			System.out.println("");
			System.out.println("you can Edit your profile details ");
			while (true)
			{
					System.out.println("Enter E for Edit or Enter B for Back...");
					String choice=scan.nextLine();
					if (choice.equalsIgnoreCase("E"))
					{
						//used flag to break switch case while loop
							running:
							while (true)
							{
									System.out.println("");
									System.out.println("which one update");
									System.out.println("1.Name");
									System.out.println("2.UserID");
									System.out.println("3.SecurityPIN");
									System.out.println("4.Back");
									System.out.println("Enter your choice (1/2/3/4)");
									int choose=scan.nextInt();

									switch(choose)
									{
											case 1:SignInFile.getUserName();
															System.out.println(" Updated Name Successfully!");
															System.out.println("");
															break running;
											case 2:SignInFile.getUserID();
															System.out.println(" Updated UserID Successfully!");
															System.out.println("");
															break running;
											case 3:SignInFile.getSecurityPIN();
															System.out.println(" Updated SecurityPIN Successfully!");
															System.out.println("");
															break running;
											case 4:System.out.println("your are going back.......");
															break running;
											default:System.out.println("invalid choice.....");
															break;
									}
							}
					}
					else if (choice.equalsIgnoreCase("B"))
					{
							System.out.println("you are going back.....");
							break;
					}
					else
					{
							System.out.println("Enter valid choice....");
					}
			}
	}
}
