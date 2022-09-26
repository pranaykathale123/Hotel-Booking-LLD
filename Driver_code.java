import java.util.*;

public class Driver_code {
	
	public static void main(String[] args) {
		int i=1;
		Scanner sc= new Scanner(System.in);
	    System.out.println("please enter your name");
		String name = sc.nextLine();
		System.out.println("please enter your Mob_No");
		String Mob_no = sc.nextLine();
		System.out.println("please enter your mail address");
		String mail_id = sc.nextLine();
		System.out.println("please enter your gender");
		String sex = sc.nextLine();
		
		User user = new User(i++, name, Mob_no, mail_id, sex);
		
		// Room 
		int room_id = 0;
		
		System.out.println("please select type of Occupany");
		for(RoomType rt : RoomType.values()){
			System.out.println(rt);
		}
		String roomType = sc.nextLine();
		Room room = new Room(room_id++);
		System.out.println("plase enter the floor");
		int floor = sc.nextInt();
		room.isRoomAvailable(roomType,floor);
		
		//Booking
		
		int bookingId = 1;
		int userId = 1;
		int hotelId = 1;
		System.out.println("enter a amount");
		int amount = sc.nextInt();
		Booking bk = new Booking(bookingId, userId, hotelId,amount);
		
		//Address 
		System.out.println("enter city");
		String city = sc.nextLine();
		System.out.println("enter pincode");
		sc.nextLine();
		int pincode = sc.nextInt();
		System.out.println("enter state");
		String state = sc.nextLine();
		System.out.println("enter Street number");
		String StreetNo = sc.nextLine();
		Address add = new Address(city,pincode,state,StreetNo);
		
		//Hotel 
		int hotelId1 = 1;
		System.out.println("enter hotel name");
		String hotel_name = sc.nextLine();
		Hotel hotel = new Hotel(hotelId1++, add, hotel_name);
			
		
		
		
			
		
	}

}
