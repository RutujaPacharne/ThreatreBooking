import java.util.regex.Pattern;

public class SilverTicket extends BookAMovieTicket {

	BookAMovieTicket b1=new BookAMovieTicket(getTicketId(), getCustomerName(), getMobileNumber(), getEmailId(), getMovieName());
	
	
	public SilverTicket(String ticketId, String customerName, long mobileNumber, String emailId, String movieName) {
		super(ticketId, customerName, mobileNumber, emailId, movieName);
		
	}

	public boolean validateTicketId()
	{
		String str=b1.getTicketId();
		boolean f=Pattern.matches("[SILVER000-999]{9}", str);
		return f;
	}
	
	
	public int calculateTicketCost(int noOfTickets,String acFacility)
	{
		int ac=250;
		int nonac=100;
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
