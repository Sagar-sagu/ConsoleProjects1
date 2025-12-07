package code;

import java.util.Scanner;
import java.io.IOException;
import database.code.WriteUserDetailsToDatabase;


public class getUserBankRelatedDetailes
{
	//global level variable
	static Scanner scan = new Scanner(System.in);
	public static String phoneNum;
	public static String usrName;
	public static String usrFatherName;
	public static String usrDateOfBirth;
	public static String usrAge;
	public static String usrGender;
	public static String usrAddress;

	static void getUserName() throws IOException
	{
		System.out.println("");
		System.out.println("Enter your Full Name");
		usrName = scan.nextLine();
		WriteUserDetailsToDatabase.writeUserName();
	}

	static void getUserFatherName() throws IOException
	{
		System.out.println("");
		System.out.println("Enter your Father Name");
		usrFatherName = scan.nextLine();
		WriteUserDetailsToDatabase.writeUserFatherName();
	}

	static void getUserDateOfBirth() throws IOException
	{
		System.out.println("");
		System.out.println("Enter your Date Of Birth");
		usrDateOfBirth = scan.nextLine();
		WriteUserDetailsToDatabase.writeUserDateOfBirth();
	}

	static void getPhoneNumber() throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("This PhoneNumber Linked to Your Bank Account");
			System.out.println("Enter your PhoneNumber");
			phoneNum = scan.nextLine();
			if (phoneNum.length()==10)
			{
				WriteUserDetailsToDatabase.writeUserPhoneNumber();
				break;
			}
			else
			{
				System.out.println("");
				System.out.println("Enter valid PhoneNumber");
			}
		}
	}

	static void getUserAge() throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Enter your Age");
			usrAge = scan.nextLine();
			int TypeCastusrAge = Integer.parseInt(usrAge);
			if (TypeCastusrAge>=0)
			{
				WriteUserDetailsToDatabase.writeUserAge();
				break;
			}
			else
			{
				System.out.println("");
				System.out.println("Age greater than Zero");
			}
		}
	}

	static void getGender() throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Enter your Gender");
			System.out.println("1.Male");
			System.out.println("2.FeMale");
			usrGender = scan.nextLine();
			if (usrGender.equalsIgnoreCase("Male") || usrGender.equalsIgnoreCase("FeMale"))
			{
				WriteUserDetailsToDatabase.writeUserGender();
				break;
			}
			else
			{
				System.out.println("");
				System.out.println("Enter valid Gender");
			}
		}
	}

	static void getAddress() throws IOException
	{
		System.out.println("");
		System.out.println("Enter your Address");
		usrAddress = scan.nextLine();
		WriteUserDetailsToDatabase.writeUserAddress();
	}

	public static void openBankAccount() throws IOException
	{
		getUserName();
		getUserFatherName();
		getUserDateOfBirth();
		getPhoneNumber();
		getUserAge();
		getGender();
		getAddress();
		try {
					 ProvideBankAccount.ProvideAccountNumber();
					 ProvideBankAccount.ProvideIFSCcode();
					 ProvideBankAccount.ProvideCustomerID();
					 ProvideBankAccount.ProvideUPIid();
					 ProvideBankAccount.ProvideSavingAccount();
			 } catch (Exception e) {
					 System.out.println("");
			 }

			 System.out.println("");
			 System.out.println("Your are Succesfully Create An Account");
			 System.out.println("So, You can Select Option ViewPassBook for ");
			 System.out.println("See Account Related Details");
			 System.out.println("");
			 System.out.println("If You Send Money OR View Balance");
			 System.out.println("First You Set MPIN Pin");
			 System.out.println("So, Select Settings Option");
			 HomeFile.HomeFunction();
	}
}
