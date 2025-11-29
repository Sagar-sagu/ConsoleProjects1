package code;

import java.io.IOException;
import database.code.ReadUserDetailsFromDatabase;

public class viewUsrBankReletedDetailes
{
	public static void viewPassBookInterFace() throws IOException
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

	public static void viewLastTransactionInPassbook() throws IOException
	{
		ReadUserDetailsFromDatabase.readUserName();
		ReadUserDetailsFromDatabase.readUserPhoneNumber();
		ReadUserDetailsFromDatabase.readUserSendMoney();
		ReadUserDetailsFromDatabase.readUserTransactionDate();
		ReadUserDetailsFromDatabase.readUserTransactionTime();
		ReadUserDetailsFromDatabase.readUserSendPhoneNumber();
		  System.out.println("");
		//	System.out.println("Here you can See Last Transaction only");
			System.out.println("Debited From ");
			System.out.println(" Name :- " + ReadUserDetailsFromDatabase.UserName);
			System.out.println("PhoneNumber :- " + ReadUserDetailsFromDatabase.UserPhoneNumber);
			System.out.println("Amount :- " + ReadUserDetailsFromDatabase.UserSendMoney);
			System.out.println("TransactionTime :- " + ReadUserDetailsFromDatabase.UserTransactionTime );
			System.out.println("TransactionDate :- " + ReadUserDetailsFromDatabase.UserTransactionDate);
			System.out.println("");
			System.out.println("Credited To ");
			System.out.println("PhoneNumber :- " + ReadUserDetailsFromDatabase.UserSendPhoneNumber);
	}
}
