import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {

	public static void main(String[] args) throws Exception {
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("****Welcome to Threatre Portal********");
			System.out.println("Enter ticket Id:");
			String t_id=b1.readLine();
			System.out.println("Enter your Name:");
			String name=b1.readLine();
			System.out.println("Enter your Mobile Number:");
			long mobile=Long.parseLong(b1.readLine());
			System.out.println("Enter your EmailId:");
			String email=b1.readLine();
			System.out.println("Enter Movie Name:");
			String movie=b1.readLine();
			
			SilverTicket s1=new SilverTicket(t_id, name, mobile, email, movie);
			boolean silver= s1.validateTicketId();
			System.out.println(silver);
			
			GoldTicket g1=new GoldTicket(t_id, name, mobile, email, movie);
		 	boolean gold= g1.validateTicketId();
		 	System.out.println(gold);
		 	
			PlatinumTicket p1=new PlatinumTicket(t_id, name, mobile, email, movie);
			boolean platinum= p1.validateTicketId();
			System.out.println(platinum);
			
			System.out.println("Enter Number of tickets you want:");
			int userTicket=Integer.parseInt(b1.readLine());
			System.out.println("Enter which type you want");
			System.out.println("Non AC Facility:100"+":"+"With AC Facility:250");
			System.out.println("Choose AC Or NonAC");
			String userInput=b1.readLine();
			
			if(silver)
			{
				
				System.out.println(s1.calculateTicketCost(userTicket, userInput));
			}else if(gold)
			{
				
				System.out.println(g1.calculateTicketCost(userTicket, userInput));
			}else {
				System.out.println(p1.calculateTicketCost(userTicket, userInput));
			}
			
		}
	}

}
