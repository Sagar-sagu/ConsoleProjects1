package database.code;

//imported the dependencies packages
import java.io.FileWriter;
import java.io.IOException;
import code.*;

public class WriteUserDetailsToDatabase
{
	//Login Methods
	public static void writeLoginUserName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/LoginFiles/UserName.txt");
        WriteDetailes.write(SignInFile.usrName);
        WriteDetailes.close();
    }

	public static void writeUserId() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/LoginFiles/UserID.txt");
        WriteDetailes.write(SignInFile.userID);
        WriteDetailes.close();
    }

	public static void writeUserSecurityPIN() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/LoginFiles/SecurityPIN.txt");
        WriteDetailes.write(SignInFile.securityPIN);
        WriteDetailes.close();
    }

		//UserBankRelated Methods
	public static void writeUserName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrName.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrName);
        WriteDetailes.close();
    }


	public static void writeUserFatherName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrFatherName.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrFatherName);
        WriteDetailes.close();
    }


	public static void writeUserDateOfBirth() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrDateOfBirth.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrDateOfBirth);
        WriteDetailes.close();
    }


	public static void writeUserAge() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrAge.txt");
        WriteDetailes.write(getUserBankRelatedDetailes.usrAge);
        WriteDetailes.close();
    }


	public static void writeUserGender() throws IOException
  {
      FileWriter WriteDetailes = new FileWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrGender.txt");
      WriteDetailes.write(getUserBankRelatedDetailes.usrGender);
      WriteDetailes.close();
  }


	public static void writeUserPhoneNumber() throws IOException
  {
    FileWriter WriteDetailes = new FileWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrPhoneNum.txt");
    WriteDetailes.write(getUserBankRelatedDetailes.phoneNum);
    WriteDetailes.close();
  }


	public static void writeUserAddress() throws IOException
  {
    FileWriter WriteDetailes = new FileWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrAddress.txt");
    WriteDetailes.write(getUserBankRelatedDetailes.usrAddress);
    WriteDetailes.close();
  }

	//ProvideBankAccount Methods
	public static void writeUserAccountNumber() throws IOException
	{
		FileWriter WriteDetailes = new FileWriter("database/databaseFolders/ProvideBankAccountDetailes/UserAccountNumber.txt");
		WriteDetailes.write(ProvideBankAccount.generatedAccontNum);
		WriteDetailes.close();
	}

	public static void writeUserCustomerID() throws IOException
	{
	 	FileWriter WriteDetailes = new FileWriter("database/databaseFolders/ProvideBankAccountDetailes/UserCustomerID.txt");
		WriteDetailes.write(ProvideBankAccount.generatedCustomerID);
		WriteDetailes.close();
	}

	public static void writeUserIFSCcode() throws IOException
	{
	 	FileWriter WriteDetailes = new FileWriter("database/databaseFolders/ProvideBankAccountDetailes/UserIFSCcode.txt");
		WriteDetailes.write(ProvideBankAccount.generatedIFSCcode);
		WriteDetailes.close();
	}

	public static void writeUserBalance() throws IOException
	{
		FileWriter WriteDetailes = new FileWriter("database/databaseFolders/ProvideBankAccountDetailes/UserBalance.txt");
		WriteDetailes.write(ProvideBankAccount.userBalance);
		WriteDetailes.close();
	}

	public static void writeUserUPIid() throws IOException
	{
		FileWriter WriteDetailes = new FileWriter("database/databaseFolders/ProvideBankAccountDetailes/UserUPIid.txt");
		WriteDetailes.write(ProvideBankAccount.generatedUPIid);
		WriteDetailes.close();
	}

	//BankFeatures Methods
	public static void writeUserSetMPINpin() throws IOException
	{
			FileWriter WriteDetailes = new FileWriter("database/databaseFolders/BankFeaturesDetailes/UserSetMPINpin.txt");
			WriteDetailes.write(SettingsFile.usrMPINpin);
			WriteDetailes.close();
	}

	public static void writeUserTransactionHistory() throws IOException
	{
		FileWriter WriteDetailes = new FileWriter("database/databaseFolders/BankFeaturesDetailes/UserTransactionHistory.txt");
		WriteDetailes.write(SettingsFile.sendMoney);
		WriteDetailes.close();
	}

	public static void writeUserSendPhoneNumber() throws IOException
	{
		FileWriter WriteDetailes = new FileWriter("database/databaseFolders/BankFeaturesDetailes/UserSendPhoneNumber.txt");
		WriteDetailes.write(CheckingDetails.sendPhoneNum);
		WriteDetailes.close();
	}

	public static void writeUserSendMoney() throws IOException
	{
		FileWriter WriteDetailes = new FileWriter("database/databaseFolders/BankFeaturesDetailes/UserSendMoney.txt");
		WriteDetailes.write(CheckingDetails.sendMoney);
		WriteDetailes.close();
	}

	public static void writeUserSendAccountNumber() throws IOException
	{
	  FileWriter WriteDetailes = new FileWriter("database/databaseFolders/BankFeaturesDetailes/UserSendAccountNumber.txt");
		WriteDetailes.write(CheckingDetails.sendAccNum);
		WriteDetailes.close();
	}

		public static void writeUserSendIFSCcode() throws IOException
		{
			FileWriter WriteDetailes = new FileWriter("database/databaseFolders/BankFeaturesDetailes/UserSendIFSCcode.txt");
			WriteDetailes.write(CheckingDetails.sendIfscCode);
			WriteDetailes.close();
		}

	public static void writeUserTransactionDate() throws IOException
	{
		FileWriter WriteDetailes = new FileWriter("database/databaseFolders/BankFeaturesDetailes/UserTransactionDate.txt");
		WriteDetailes.write(SettingsFile.date);
		WriteDetailes.close();
	}

	public static void writeUserTransactionTime() throws IOException
	{
		FileWriter WriteDetailes = new FileWriter("database/databaseFolders/BankFeaturesDetailes/UserTransactionTime.txt");
		WriteDetailes.write(SettingsFile.time);
		WriteDetailes.close();
	}
}
