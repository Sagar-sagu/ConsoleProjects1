//imported dependencies packages
import java.util.Scanner;
import java.util.InputMismatchException;
import code.LogInFile;
import code.SignInFile;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		//global variable
		Scanner scan=new Scanner(System.in);
		//Entry point of This Project
		System.out.println("WELCOME TO BANK APPLICATION");
		System.out.println("");
		System.out.println("Get started......");
		try
		{
			while (true) // Assuming you have a condition to keep the loop running
			{
				System.out.println("");
				System.out.println("1.LogIn (if you have an account then press 1 for login)");
				System.out.println("2.SignIN (if you don't have an account then press 2 for signup)");
				System.out.println("3.Exit (if you want to exit then press 3)");
				System.out.println("");

				System.out.println("Enter your choice (1/2/3):");
				int choice=scan.nextInt();
				switch (choice)
				{
				case 1:LogInFile.LogInFunction();
								break;
				case 2:SignInFile.SigInFunction();
								break;
				case 3:System.out.println("Exiting the Application...");
								System.exit(0);
				default:System.out.println("Invalid choice, please try again.");
							break;
			  }
	    }
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input MissMatch, please try again.");
		}
	}
}
