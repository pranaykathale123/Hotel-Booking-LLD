
public class Booking {
	private int  bookingId;
    private int UserId;
    private int hotelId;
    private int amount;
	
    public Booking(int bookingId, int userId, int hotelId, int amount) {
		super();
		this.bookingId = bookingId;
		UserId = userId;
		this.hotelId = hotelId;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
    
   
    
    

}
