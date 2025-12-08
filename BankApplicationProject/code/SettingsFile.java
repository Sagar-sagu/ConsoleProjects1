package code;

//imported dependencies packages
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import database.code.WriteUserDetailsToDatabase;

public class SettingsFile
{
	public static String date;
	public static String time;
	public static String usrMPINpin;
	static Scanner scan=new Scanner(System.in);

	public static void settings() throws IOException
	{
		System.out.println("");
		while (true)
		{
			System.out.println("Here you can Set Your MPIN PIN");
			System.out.println("Create 6 Digite Pin");
			usrMPINpin=scan.nextLine();
			if (usrMPINpin.length()==6)
			{
				System.out.println("Created MPIN pin Succesfully");
				WriteUserDetailsToDatabase.writeUserSetMPINpin();
				break;
			}
			else
			{
				System.out.println("Create 6 Digite Pin. Please try again ");
			}
		}
	}

    public static void getCurrentDate() throws IOException
		{
         LocalDate Date = LocalDate.now();
				 date = Date + "";
    }

    public static void getCurrentTime() throws IOException
		 {
         LocalTime Time = LocalTime.now();
				 DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss a");
				 time = Time.format(formatterTime) + "";
    }
}
