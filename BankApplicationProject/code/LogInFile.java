package code;

import java.util.Scanner;
import java.io.IOException;
import database.code.ReadUserDetailsFromDatabase;

public class LogInFile
{
	static Scanner scan=new Scanner(System.in);

	public static void checkUserName() throws IOException
	{
		System.out.println("");
		ReadUserDetailsFromDatabase.readLoginUserName();
		while (true)
		{
			System.out.println("Enter Your Name As Given IN Account Created Time");
			System.out.println("For Security Purpose");
			String userName = scan.nextLine();
			if (userName.equals(ReadUserDetailsFromDatabase.LoginUserName))
			{
				System.out.println("");
				break;
			}
			else
			{
				System.out.println("InValid Name ");
			}
		}
	}

	public static void checkUserID() throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Enter your UserID");
			String userID = scan.nextLine();
			if (userID.equals(ReadUserDetailsFromDatabase.UserID))
			{
				System.out.println("");
				break;
			}
			else
			{
				System.out.println("enter valid UserID");
			}
	 }
	}

	public static void checkSecurityPIN() throws IOException
	{
		System.out.println("");
		while(true)
		{
			System.out.println("Enter SecurityPIN");
			String userID = scan.nextLine();
			if (userID.equals(ReadUserDetailsFromDatabase.securityPIN))
			{
				System.out.println("");
				break;
			}
			else
			{
				System.out.println("enter valid SecurityPIN");
			}
	 }
	}

	public static String ForgetUserID() throws IOException
	 {
			 String forgetUserID = ReadUserDetailsFromDatabase.UserID;
			 return forgetUserID;
	 }

	 public static String ForgetSecurityPIN() throws IOException
	 {
			 String forgetSecurityPIN = ReadUserDetailsFromDatabase.securityPIN;
			 return forgetSecurityPIN;
	 }


    public static void RetriveDetailes() throws IOException
    {
        running:
         while (true)
            {
                String showUserID= ForgetUserID();
                String showSecurityPIN= ForgetSecurityPIN();
                System.out.println("");
                System.out.println("What do you want to retrive ?");
                System.out.println("");
                System.out.println("1.UserId");
                System.out.println("2.SecurityPIN");
                System.out.println("3.Both");
                System.out.println("Choose (1/2/3)");
                int choose = scan.nextInt();

                switch(choose)
                {
                    case 1:System.out.println("UserID: "+ showUserID);
                    		System.out.println("");
                            break running;
                    case 2:System.out.println("SecurityPIN: "+ showSecurityPIN);
	                    		System.out.println("");
	                    		 break running;
                    case 3:System.out.println("UserID: " + showUserID);
                           System.out.println("SecurityPIN: " + showSecurityPIN);
                           System.out.println("");
                           break running;
                    default:System.out.println("Invalid choice, Enter valid choice");
                        	break;
                }
            }
    }

	public static void CheckProvideBankAccountOrNot() throws IOException
	{
		ReadUserDetailsFromDatabase.readUserAddress();
		if(ReadUserDetailsFromDatabase.UserAddress == null || ReadUserDetailsFromDatabase.UserAddress.isEmpty())
		{
			System.out.println("");
			System.out.println("You Must Create An Bank Account");
			System.out.println("So, You are give your Bank Related Detailes");
			getUserBankRelatedDetailes.openBankAccount();
		}
		else
		{
			HomeFile.HomeFunction();
		}
	}

	public static void LogInFunction() throws IOException
	{
	  ReadUserDetailsFromDatabase.readLoginUserName();
	  ReadUserDetailsFromDatabase.readUserId();
      ReadUserDetailsFromDatabase.readUserSecurityPIN();
      System.out.println("Note: If in Case Forget Your UserId and SecurityPIN You can Retrive it.....");
      System.out.println("");

      while (true)
      {
          System.out.println("Enter R for Retrive detailes OR else, Enter C for continue If you Remember all detailes");
          String choice = scan.nextLine();
          if (choice.equalsIgnoreCase("R"))
          {
						 checkUserName();
             RetriveDetailes();
          }
          else if (choice.equalsIgnoreCase("C"))
          {
              checkUserID();
              checkSecurityPIN();
							System.out.println("Login Succesfully");
							CheckProvideBankAccountOrNot();
              break;
          }
          else
          {
              System.out.println("Invalid choice, Enter valid choice");
          }
      }
	}
}
