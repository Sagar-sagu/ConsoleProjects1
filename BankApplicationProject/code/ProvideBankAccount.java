package code;

//import dependencies packages
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import database.code.WriteUserDetailsToDatabase;

public class ProvideBankAccount
{
	//global variables
	public static String generatedAccontNum;
	public static String generatedIFSCcode;
	public static String generatedCustomerID;
	public static String generatedUPIid;
	public static String userBalance;

	public static void ProvideAccountNumber() throws IOException
	{
        int length = 13;
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder usrAccountNum = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(characters.length());
            usrAccountNum.append(characters.charAt(index));
        }
        generatedAccontNum = usrAccountNum.toString();
				WriteUserDetailsToDatabase.writeUserAccountNumber();
	}

	public static void ProvideIFSCcode() throws IOException
	{
				int length = 4;
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder usrIFSCcode = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(characters.length());
            usrIFSCcode.append(characters.charAt(index));
        }
        generatedIFSCcode = usrIFSCcode.toString();
				WriteUserDetailsToDatabase.writeUserIFSCcode();
	}

	public static void ProvideCustomerID() throws IOException
	{
				int length = 8;
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder usrCustomerID = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(characters.length());
            usrCustomerID.append(characters.charAt(index));
        }
        generatedCustomerID = usrCustomerID.toString();
				WriteUserDetailsToDatabase.writeUserCustomerID();
	}

	public static void ProvideUPIid() throws IOException
	{
			int length = 3;
			String characters = "abcdefghijklmnopqrstuvwxyz";
			Random random = new Random();
			StringBuilder usrUPIid = new StringBuilder();
			for (int i = 0; i < length; i++)
			{
					int index = random.nextInt(characters.length());
					usrUPIid.append(characters.charAt(index));
			}
			generatedUPIid = usrUPIid.toString();
			WriteUserDetailsToDatabase.writeUserUPIid();
	}

	public static void ProvideSavingAccount() throws IOException
	{
		float UserBalance = 1000f;
		userBalance = String.valueOf(UserBalance);
		WriteUserDetailsToDatabase.writeUserBalance();
	}
}
