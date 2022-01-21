import java.util.regex.Pattern;

public class PlatinumTicket extends BookAMovieTicket{

	BookAMovieTicket b1=new BookAMovieTicket(getTicketId(), getCustomerName(), getMobileNumber(), getEmailId(), getMovieName());
	
	
	public PlatinumTicket(String ticketId, String customerName, long mobileNumber, String emailId, String movieName) {
		super(ticketId, customerName, mobileNumber, emailId, movieName);
		
	}
	
	public boolean validateTicketId()
	{
		String str=b1.getTicketId();
		boolean f= Pattern.matches("[PLATINUM000-999]{11}", str);
		return f;
	}
	
	public int calculateTicketCost(int noOfTickets,String acFacility)
	{
		int ac=750;
		int nonac=600;
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
