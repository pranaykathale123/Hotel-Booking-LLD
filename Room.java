
public class Room {
	private int room_id;
	//private RoomType roomtype;
	

	public Room(int room_id) {
		super();
		this.room_id = room_id;
		//this.roomtype = roomtype;
	}
	


	public int getRoom_id() {
		return room_id;
	}



	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}



//	public RoomType getRoomtype() {
//		return roomtype;
//	}
//
//
//
//	public void setRoomtype(RoomType roomtype) {
//		this.roomtype = roomtype;
//	}



	public void isRoomAvailable(String roomType, int floor) {
		// TODO Auto-generated method stub
		for(RoomType rt : RoomType.values()){
			if(rt.equals(roomType) || floor==1){
				System.out.println("Room number 101 is  Available");
				break;
			}
			else if(rt.equals(roomType) || floor==2){
				System.out.println("Room number 102 is  Available");
				break;
			}
			else{
				System.out.println("Room is not Available");
				break;
			}
		}
		
	}

}
