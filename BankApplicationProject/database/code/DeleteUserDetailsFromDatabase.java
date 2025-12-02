package database.code;

import java.io.PrintWriter;
import java.io.IOException;

public class DeleteUserDetailsFromDatabase
{
  //Login Methods
	static void clearLoginUserName() throws IOException
  {
    PrintWriter clearDetails = new PrintWriter("database/databaseFolders/LoginFiles/UserName.txt");
    clearDetails.print("");
    clearDetails.close();
   }

   static void clearUserId() throws IOException
   {
     PrintWriter clearDetails = new PrintWriter("database/databaseFolders/LoginFiles/UserID.txt");
     clearDetails.print("");
     clearDetails.close();
   }

 	 static void clearUserSecurityPIN() throws IOException
   {
     PrintWriter clearDetails = new PrintWriter("database/databaseFolders/LoginFiles/SecurityPIN.txt");
     clearDetails.print("");
     clearDetails.close();
   }


 		//UserBankRelated Methods
 	 static void clearUserName() throws IOException
   {
     PrintWriter clearDetails = new PrintWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrName.txt");
		 clearDetails.print("");
	    clearDetails.close();
   }

 	 static void clearUserFatherName() throws IOException
 	 {
     PrintWriter clearDetails = new PrintWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrFatherName.txt");
		 clearDetails.print("");
	     clearDetails.close();
    }

	  static void clearDateOfBirth() throws IOException
		{
			PrintWriter clearDetails = new PrintWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrDateOfBirth.txt");
			clearDetails.print("");
	    clearDetails.close();
		}


	 		static void clearUserAge() throws IOException
			{
				PrintWriter clearDetails = new PrintWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrAge.txt");
				clearDetails.print("");
		    clearDetails.close();
			}

		  static void clearUserGender() throws IOException
	    {
        PrintWriter clearDetails = new PrintWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrGender.txt");
				clearDetails.print("");
		    clearDetails.close();
	    }


	   static void clearUserPhoneNumber() throws IOException
     {
        PrintWriter clearDetails = new PrintWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrPhoneNum.txt");
				clearDetails.print("");
		      clearDetails.close();
     }

		 static void clearUserAddress() throws IOException
	  	{
				PrintWriter clearDetails = new PrintWriter("database/databaseFolders/UserBankRelatedDetailesFiles/usrAddress.txt");
				clearDetails.print("");
	 	    clearDetails.close();
		  }

				//ProvideBankAccount Methods
			 static void clearUserAccountNumber() throws IOException
				{
					PrintWriter clearDetails = new PrintWriter("database/databaseFolders/ProvideBankAccountDetailes/UserAccountNumber.txt");
					clearDetails.print("");
			    clearDetails.close();
				}

				static void clearUserCustomerID() throws IOException
				{
					 PrintWriter clearDetails = new PrintWriter("database/databaseFolders/ProvideBankAccountDetailes/UserCustomerID.txt");
					 clearDetails.print("");
 			    clearDetails.close();
				}

				static void clearUserIFSCcode() throws IOException
				{
						PrintWriter clearDetails = new PrintWriter("database/databaseFolders/ProvideBankAccountDetailes/UserIFSCcode.txt");
						clearDetails.print("");
				    clearDetails.close();
				}

				static void clearUserBalance() throws IOException
				{
						PrintWriter clearDetails = new PrintWriter("database/databaseFolders/ProvideBankAccountDetailes/UserBalance.txt");
						clearDetails.print("");
				    clearDetails.close();
				}

				static void clearUserUPIid() throws IOException
				{
						PrintWriter clearDetails = new PrintWriter("database/databaseFolders/ProvideBankAccountDetailes/UserUPIid.txt");
						clearDetails.print("");
				    clearDetails.close();
				}

				//BankFeatures Methods
				static void clearUserSetMPINpin() throws IOException
				{
					PrintWriter clearDetails = new PrintWriter("database/databaseFolders/BankFeaturesDetailes/UserSetMPINpin.txt");
					clearDetails.print("");
			    clearDetails.close();
				}

				static void clearUserTransactionHistory() throws IOException
				{
					PrintWriter clearDetails = new PrintWriter("database/databaseFolders/BankFeaturesDetailes/UserTransactionHistory.txt");
					clearDetails.print("");
			    clearDetails.close();
				}

				static void clearUserSendPhoneNumber() throws IOException
				{
					PrintWriter clearDetails = new PrintWriter("database/databaseFolders/BankFeaturesDetailes/UserSendPhoneNumber.txt");
					clearDetails.print("");
			    clearDetails.close();
				}

				static void clearUserSendMoney() throws IOException
				{
					PrintWriter clearDetails = new PrintWriter("database/databaseFolders/BankFeaturesDetailes/UserSendMoney.txt");
					clearDetails.print("");
			    clearDetails.close();
				}

				static void clearUserSendAccountNumber() throws IOException
				{
			  	PrintWriter clearDetails = new PrintWriter("database/databaseFolders/BankFeaturesDetailes/UserSendAccountNumber.txt");
					clearDetails.print("");
			    clearDetails.close();
				}

				static void clearUserSendIFSCcode() throws IOException
				{
					PrintWriter clearDetails = new PrintWriter("database/databaseFolders/BankFeaturesDetailes/UserSendIFSCcode.txt");
					clearDetails.print("");
			    clearDetails.close();
				}

				static void clearUserTransactionDate() throws IOException
				{
				 PrintWriter clearDetails = new PrintWriter("database/databaseFolders/BankFeaturesDetailes/UserTransactionDate.txt");
				 clearDetails.print("");
 		    clearDetails.close();
				}


				static void clearUserTransactionTime() throws IOException
				{
				 PrintWriter clearDetails = new PrintWriter("database/databaseFolders/BankFeaturesDetailes/UserTransactionTime.txt");
				 clearDetails.print("");
				 clearDetails.close();
				}

	 public static void ClearUserDetails() throws IOException
	 {
		 clearLoginUserName();
		 clearUserId();
		 clearUserSecurityPIN();
		 clearUserName();
		 clearUserFatherName();
		 clearDateOfBirth();
		 clearUserAge();
		 clearUserGender();
		 clearUserPhoneNumber();
		 clearUserAddress();
		 clearUserAccountNumber();
		 clearUserCustomerID();
		 clearUserIFSCcode();
		 clearUserBalance();
		 clearUserUPIid();
		 clearUserSetMPINpin();
		 clearUserTransactionHistory();
		 clearUserSendPhoneNumber();
		 clearUserSendMoney();
		 clearUserSendAccountNumber();
		 clearUserSendIFSCcode();
		 clearUserTransactionDate();
		 clearUserTransactionTime();
	 }
}
