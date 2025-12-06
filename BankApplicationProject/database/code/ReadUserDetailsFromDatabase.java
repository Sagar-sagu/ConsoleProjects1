package database.code;

//imported the dependencies packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUserDetailsFromDatabase
{
	//Login variables
	public static String LoginUserName;
	public static String UserID;
	public static String securityPIN;
	//UserBankRelated Variables
	public static String UserName;
	public static String UserFatherName;
	public static String UserAge;
	public static String UserDateOfBirth;
	public static String UserGender;
	public static String UserAddress;
	public static String UserPhoneNumber;
	//ProvideBankAccount Variables
	public static String UserAccountNumber;
	public static String UserCustomerID;
	public static String UserIFSCcode;
	public static String UserUPIid;
	public static String UserBalance;
	//BankFeatures Variables
	public static String UserSetMPINpin;
	public static String UserTransactionHistory;
	public static String UserSendPhoneNumber;
	public static String UserSendMoney;
	public static String UserSendAccountNumber;
	public static String UserSendIFSCcode;
	public static String UserTransactionDate;
	public static String UserTransactionTime;

	//Login Methods
	public static void readLoginUserName() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/LoginFiles/UserName.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        LoginUserName = bufferedReader.readLine();
        bufferedReader.close();
     }

     public static void readUserId() throws IOException
    {
			FileReader reader = new FileReader("database/databaseFolders/LoginFiles/UserID.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			UserID = bufferedReader.readLine();
			bufferedReader.close();
     }

     public static void readUserSecurityPIN() throws IOException
    {
			FileReader reader = new FileReader("database/databaseFolders/LoginFiles/SecurityPIN.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			securityPIN = bufferedReader.readLine();
			bufferedReader.close();
     }

		 //UserBankRelated Methods
     public static void readUserName() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/UserBankRelatedDetailesFiles/usrName.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        UserName = bufferedReader.readLine();
        bufferedReader.close();
     }

     public static void readUserFatherName() throws IOException
    {
			FileReader reader = new FileReader("database/databaseFolders/UserBankRelatedDetailesFiles/usrFatherName.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			UserFatherName = bufferedReader.readLine();
			bufferedReader.close();
     }

     public static void readUserDateOfBirth() throws IOException
    {
			FileReader reader = new FileReader("database/databaseFolders/UserBankRelatedDetailesFiles/usrDateOfBirth.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			UserDateOfBirth = bufferedReader.readLine();
			bufferedReader.close();
     }

     public static void readUserAge() throws IOException
    {
			FileReader reader = new FileReader("database/databaseFolders/UserBankRelatedDetailesFiles/usrAge.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			UserAge = bufferedReader.readLine();
			bufferedReader.close();
     }

     public static void readUserGender() throws IOException
    {
			FileReader reader = new FileReader("database/databaseFolders/UserBankRelatedDetailesFiles/usrGender.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			UserGender = bufferedReader.readLine();
			bufferedReader.close();
     }

     public static void readUserPhoneNumber() throws IOException
    {
			FileReader reader = new FileReader("database/databaseFolders/UserBankRelatedDetailesFiles/usrPhoneNum.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			UserPhoneNumber = bufferedReader.readLine();
			bufferedReader.close();
     }

     public static void readUserAddress() throws IOException
    {
			FileReader reader = new FileReader("database/databaseFolders/UserBankRelatedDetailesFiles/usrAddress.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			UserAddress = bufferedReader.readLine();
			bufferedReader.close();
     }

		 //ProvideBankAccount Methods
		 public static void readUserAccountNumber() throws IOException
		{
		 FileReader reader = new FileReader("database/databaseFolders/ProvideBankAccountDetailes/UserAccountNumber.txt");
		 BufferedReader bufferedReader = new BufferedReader(reader);
		 UserAccountNumber = bufferedReader.readLine();
		 bufferedReader.close();
		 }

		 public static void readUserCustomerID() throws IOException
		{
			FileReader reader = new FileReader("database/databaseFolders/ProvideBankAccountDetailes/UserCustomerID.txt");
 		 BufferedReader bufferedReader = new BufferedReader(reader);
 		 UserCustomerID = bufferedReader.readLine();
 		 bufferedReader.close();
		 }

		 public static void readUserIFSCcode() throws IOException
		{
			 FileReader reader = new FileReader("database/databaseFolders/ProvideBankAccountDetailes/UserIFSCcode.txt");
	 		 BufferedReader bufferedReader = new BufferedReader(reader);
	 		 UserIFSCcode = bufferedReader.readLine();
	 		 bufferedReader.close();
		 }

		 public static void readUserUPIid() throws IOException
		{
			 FileReader reader = new FileReader("database/databaseFolders/ProvideBankAccountDetailes/UserUPIid.txt");
	 		 BufferedReader bufferedReader = new BufferedReader(reader);
	 		 UserUPIid = bufferedReader.readLine();
	 		 bufferedReader.close();
		 }

		 public static void readUserBalance() throws IOException
		{
				FileReader reader = new FileReader("database/databaseFolders/ProvideBankAccountDetailes/UserBalance.txt");
				BufferedReader bufferedReader = new BufferedReader(reader);
				UserBalance = bufferedReader.readLine();
				bufferedReader.close();
		 }

		 //BankFeatures Methods
		 public static void readUserSetMPINpin() throws IOException
		{
			FileReader reader = new FileReader("database/databaseFolders/BankFeaturesDetailes/UserSetMPINpin.txt");
 		 BufferedReader bufferedReader = new BufferedReader(reader);
 		 UserSetMPINpin = bufferedReader.readLine();
 		 bufferedReader.close();
		 }

		 public static String readUserTransactionHistory() throws IOException
		{
		   FileReader reader = new FileReader("database/databaseFolders/BankFeaturesDetailes/UserTransactionHistory.txt");
	 		 BufferedReader bufferedReader = new BufferedReader(reader);
	 		 UserTransactionHistory = bufferedReader.readLine();
	 		 bufferedReader.close();
			 return UserTransactionHistory;
		 }

		 public static void readUserSendPhoneNumber() throws IOException
	 	{
		 FileReader reader = new FileReader("database/databaseFolders/BankFeaturesDetailes/UserSendPhoneNumber.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			UserSendPhoneNumber = bufferedReader.readLine();
			bufferedReader.close();
		}

		public static void readUserSendMoney() throws IOException
	 {
		FileReader reader = new FileReader("database/databaseFolders/BankFeaturesDetailes/UserSendMoney.txt");
		 BufferedReader bufferedReader = new BufferedReader(reader);
		 UserSendMoney = bufferedReader.readLine();
		 bufferedReader.close();
	 }

	 public static void readUserSendAccountNumber() throws IOException
		{
	 	FileReader reader = new FileReader("database/databaseFolders/BankFeaturesDetailes/UserSendAccountNumber.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		UserSendAccountNumber = bufferedReader.readLine();
		bufferedReader.close();
		}

		public static void readUserSendIFSCcode() throws IOException
	 {
		FileReader reader = new FileReader("database/databaseFolders/BankFeaturesDetailes/UserSendIFSCcode.txt");
		 BufferedReader bufferedReader = new BufferedReader(reader);
		 UserSendIFSCcode = bufferedReader.readLine();
		 bufferedReader.close();
	 }

		public static void readUserTransactionDate() throws IOException
	 {
		FileReader reader = new FileReader("database/databaseFolders/BankFeaturesDetailes/UserTransactionDate.txt");
		 BufferedReader bufferedReader = new BufferedReader(reader);
		 UserTransactionDate = bufferedReader.readLine();
		 bufferedReader.close();
	 }

	 public static void readUserTransactionTime() throws IOException
	{
	 FileReader reader = new FileReader("database/databaseFolders/BankFeaturesDetailes/UserTransactionTime.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		UserTransactionTime = bufferedReader.readLine();
		bufferedReader.close();
	}
}
