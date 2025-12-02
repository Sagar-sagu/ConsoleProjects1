package code;

//imported dependencies packages
import java.util.Scanner;
import java.io.IOException;
import database.code.ReadUserDetailsFromDatabase;

public class features
{
	static Scanner scan = new Scanner(System.in);

	public static void 	SendMoneyTruoghPhoneNumber() throws IOException
	{
		CheckingDetails.CheckSendPhoneNumber();
		CheckingDetails.CheckSendMoney();
		CheckingDetails.CheckMPINpin();
	}

	public static void SendMoneyTruoghAccountNumber() throws IOException
	{
		CheckingDetails.CheckAccountNumber();
		CheckingDetails.CheckIFSCcode();
		CheckingDetails.SendingAccountNumber();
		CheckingDetails.SendingIFSCcode();
		CheckingDetails.CheckSendMoney();
		CheckingDetails.CheckMPINpin();
	}

	public static void CheckBalance() throws IOException
	{
		System.out.println("");
		while (true)
		{
				System.out.println("Enter your MPIN pin ");
				String userMpinPin = scan.nextLine();
				if (userMpinPin.equals(ReadUserDetailsFromDatabase.UserSetMPINpin))
				{
					System.out.println("");
					System.out.println("Balance :- " + ProvideBankAccount.userBalance);
					break;
				}
				else
				{
					System.out.println("Invalid MPIN PIN");
				}
		}
	}

	public static void WaysToSendMoney() throws IOException
	{
        System.out.println("");
        System.out.println("Please select the type of Ways you want to Send for:");
        System.out.println("");

        running:
        while (true)
        {
            System.out.println("1.SendMoneyTruoghPhoneNumber");
            System.out.println("2.SendMoneyTruoghAccountNumber");
            System.out.println("3.Back");
            System.out.println("");
            System.out.println("Enter your choice (1,2,3) ");
            String scanChoice = scan.nextLine();

            switch (scanChoice)
            {
                case "1":SendMoneyTruoghPhoneNumber();
													ProvideBankAccount.userBalance = CheckingDetails.CheckSendMoney();
                        	break;
                case "2":SendMoneyTruoghAccountNumber();
													ProvideBankAccount.userBalance = CheckingDetails.CheckSendMoney();
                        	break;
                case "3":System.out.println("you are going back.......");
	                        System.out.println("");
	                        break running;
                default:System.out.println("Invalid choice, please try again.");
                        	break;
            }
        }
	}
}
