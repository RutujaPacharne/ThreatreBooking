import java.util.regex.Pattern;

public class GoldTicket extends BookAMovieTicket {

	BookAMovieTicket b1=new BookAMovieTicket(getTicketId(), getCustomerName(), getMobileNumber(), getEmailId(), getMovieName());
	
	
	public GoldTicket(String ticketId, String customerName, long mobileNumber, String emailId, String movieName) {
		super(ticketId, customerName, mobileNumber, emailId, movieName);
		
	}

	public boolean validateTicketId()
	{
		String str=b1.getTicketId();
		boolean f= Pattern.matches("[GOLD000-999]{7}", str);
		return f;
	}
	
	public int calculateTicketCost(int noOfTickets,String acFacility)
	{
		int ac=500;
		int nonac=350;
		int Amount=0;

		
		if(acFacility.equals("AC"))
		{
			Amount=ac*noOfTickets;
		}else {
			Amount=nonac*noOfTickets;
		}
		return Amount;
		
		
	}
}
