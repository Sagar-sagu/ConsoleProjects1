package code;

import java.io.IOException;
import database.code.ReadUserDetailsFromDatabase;

public class viewUsrBankReletedDetailes
{
	public static void ViewPassBookInterFace() throws IOException
	{
		ReadUserDetailsFromDatabase.readUserName();
		ReadUserDetailsFromDatabase.readUserFatherName();
		ReadUserDetailsFromDatabase.readUserAccountNumber();
		ReadUserDetailsFromDatabase.readUserIFSCcode();
		ReadUserDetailsFromDatabase.readUserCustomerID();
		ReadUserDetailsFromDatabase.readUserDateOfBirth();
		ReadUserDetailsFromDatabase.readUserAge();
		ReadUserDetailsFromDatabase.readUserAddress();
		System.out.println("");
		System.out.println("Name :- " + ReadUserDetailsFromDatabase.UserName);
		System.out.println("Father Name :- " + ReadUserDetailsFromDatabase.UserFatherName);
		System.out.println("Account Number :- " + ReadUserDetailsFromDatabase.UserAccountNumber);
		System.out.println("IFSC code :- " + ReadUserDetailsFromDatabase.UserIFSCcode);
		System.out.println("Customer ID :- " + ReadUserDetailsFromDatabase.UserCustomerID);
		System.out.println("Date of Birth :- " + ReadUserDetailsFromDatabase.UserDateOfBirth);
		System.out.println("Age :- " + ReadUserDetailsFromDatabase.UserAge);
		System.out.println("Address :- " + ReadUserDetailsFromDatabase.UserAddress);
	}

	public static void ViewLastTransactionInPassbook() throws IOException
	{
		ReadUserDetailsFromDatabase.readUserSendIFSCcode();
		if(ReadUserDetailsFromDatabase.UserSendIFSCcode == null || ReadUserDetailsFromDatabase.UserSendIFSCcode.isEmpty())
		{
			System.out.println("Your not Sending any Money Through AccountNumber");
		}
		else
		{
			ReadUserDetailsFromDatabase.readUserName();
			ReadUserDetailsFromDatabase.readUserSendMoney();
			ReadUserDetailsFromDatabase.readUserSendAccountNumber();
			ReadUserDetailsFromDatabase.readUserSendIFSCcode();
			ReadUserDetailsFromDatabase.readUserTransactionDate();
			ReadUserDetailsFromDatabase.readUserTransactionTime();
		  System.out.println("");
			System.out.println("Debited From ");
			System.out.println(" Name:- " + ReadUserDetailsFromDatabase.UserName);
			System.out.println("Amount:- " + ReadUserDetailsFromDatabase.UserSendMoney);
			System.out.println("");
			System.out.println("Credited To ");
			System.out.println("AccountNumber:- " + ReadUserDetailsFromDatabase.UserSendAccountNumber);
			System.out.println("IFSCcode:- " + ReadUserDetailsFromDatabase.UserSendIFSCcode);
			System.out.println("TransactionTime:- " + ReadUserDetailsFromDatabase.UserTransactionTime );
			System.out.println("TransactionDate:- " + ReadUserDetailsFromDatabase.UserTransactionDate);
		}
	}

	public static void ViewLastTransaction() throws IOException
	{
		ReadUserDetailsFromDatabase.readUserName();
		ReadUserDetailsFromDatabase.readUserPhoneNumber();
		ReadUserDetailsFromDatabase.readUserSendMoney();
		ReadUserDetailsFromDatabase.readUserTransactionDate();
		ReadUserDetailsFromDatabase.readUserTransactionTime();
		ReadUserDetailsFromDatabase.readUserSendPhoneNumber();
		System.out.println("");
		System.out.println("Debited From ");
		System.out.println(" Name :- " + ReadUserDetailsFromDatabase.UserName);
		System.out.println("PhoneNumber :- " + ReadUserDetailsFromDatabase.UserPhoneNumber);
		System.out.println("Amount :- " + ReadUserDetailsFromDatabase.UserSendMoney);
		System.out.println("");
		System.out.println("Credited To ");
		System.out.println("PhoneNumber :- " + ReadUserDetailsFromDatabase.UserSendPhoneNumber);
		System.out.println("TransactionTime :- " + ReadUserDetailsFromDatabase.UserTransactionTime );
		System.out.println("TransactionDate :- " + ReadUserDetailsFromDatabase.UserTransactionDate);
	}

	public static void ViewTransactionHistory() throws IOException
	{
		ReadUserDetailsFromDatabase.readUserSendMoney();
		if(ReadUserDetailsFromDatabase.UserSendMoney == null || ReadUserDetailsFromDatabase.UserSendMoney.isEmpty())
		{
			System.out.println("Your not Sending any Money Yet");
		}
		else
		{
			System.out.println("Here you can See Last Transaction only");
			ReadUserDetailsFromDatabase.readUserTransactionHistory();
			System.out.println("Amount:- " + ReadUserDetailsFromDatabase.UserTransactionHistory);
		}
	}
}
