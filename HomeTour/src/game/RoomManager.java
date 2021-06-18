package game;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] allRooms;
	
	public void init() {
		Room kitchen = new Room("kitchen", "a small sized kitchen", "The kitchen of a small town house. A dining room is open to the east, where you can see a small table that seats 2 people and past the dining room you can see the living room");
		Room livingRoom = new Room("living room", "a small living room", "The living room has a small couch against the north wall, a wooden coffee table sits in the middle of the room, and there is a mdeium sized tv on the south wall and there is a staircase leading second floor towards the south. There is also a cat scrathing post next to the sliding door that leads to the outside to the east");
		Room diningRoom = new Room("Dining room", "a small dining room", "There is a small circular glass table with 2 chairs around it. You can see the kitchen to the west and the living room to the east ");
		Room downStairsBathroom = new Room("Down stairs bathroom", "A half sized bathroom", "There is a toilet, a sink, and some cabinets");
		Room stairs = new Room("Stairs", "A narrow staircase", "The staircase is very narrow and its leads from the living room to the upstairs hallway. There is posters of various games and movies on the wall of the stairs");
		Room masterBedroom = new Room("Master bedroom", "a medium sized bedroom", "There is a bed placed against the middle of the south wall. A closet is open on the north wall. And there is a full sized bathroom towards the south of the room");
		Room guestBedroom = new Room("Guest bedroom", "a medium sized bedroom", "There is a bed placed against the corner of the south wall. A closet is open on the north wall. And there is a full sized bathroom towards the south of the room");
		Room masterBathroom = new Room("Master bathroom", "a full sized bathroom", "There is a sink, a bathtub, and some cabinets");
		Room guestBathroom = new Room("Guest bathroom", "a full sized bathroom", "There is a sink, a bathtub, and some cabinets");
		Room upstairsHallway = new Room("Upstairs hallway", "a narrow hallway", "To the east you see the master bedroom, there is a linen closet in the hallway and to the west you see the guest bedroom");
		
		allRooms = new Room[10];
		allRooms[0] = kitchen;
		allRooms[1] = diningRoom;
		allRooms[2] = livingRoom;
		allRooms[3] = downStairsBathroom;
		allRooms[4] = stairs;
		allRooms[5] = masterBedroom;
		allRooms[6] = guestBedroom;
		allRooms[7] = masterBathroom;
		allRooms[8] = guestBathroom;
		allRooms[9] = upstairsHallway;
		
		startingRoom = kitchen;
		
		kitchen.SetNorthExit(null);
		kitchen.SetEastExit(diningRoom);
		kitchen.SetSouthExit(downStairsBathroom);
		kitchen.SetWestExit(null);
		
		diningRoom.SetNorthExit(null);
		diningRoom.SetEastExit(livingRoom);
		diningRoom.SetSouthExit(null);
		diningRoom.SetWestExit(kitchen);
		
		livingRoom.SetNorthExit(null);
		livingRoom.SetEastExit(null);
		livingRoom.SetSouthExit(stairs);
		livingRoom.SetWestExit(diningRoom);
		
		downStairsBathroom.SetNorthExit(kitchen);
		downStairsBathroom.SetEastExit(null);
		downStairsBathroom.SetSouthExit(null);
		downStairsBathroom.SetWestExit(null);
		
		stairs.SetNorthExit(livingRoom);
		stairs.SetEastExit(null);
		stairs.SetSouthExit(upstairsHallway);
		stairs.SetWestExit(null);
		
		upstairsHallway.SetNorthExit(stairs);
		upstairsHallway.SetEastExit(masterBedroom);
		upstairsHallway.SetSouthExit(null);
		upstairsHallway.SetWestExit(guestBedroom);
		
		masterBedroom.SetNorthExit(null);
		masterBedroom.SetEastExit(null);
		masterBedroom.SetSouthExit(masterBathroom);
		masterBedroom.SetWestExit(upstairsHallway);
		
		guestBedroom.SetNorthExit(null);
		guestBedroom.SetEastExit(upstairsHallway);
		guestBedroom.SetSouthExit(guestBathroom);
		guestBedroom.SetWestExit(null);
		
		masterBathroom.SetNorthExit(masterBedroom);
		masterBathroom.SetEastExit(null);
		masterBathroom.SetSouthExit(null);
		masterBathroom.SetWestExit(null);
		
		guestBathroom.SetNorthExit(guestBedroom);
		guestBathroom.SetEastExit(null);
		guestBathroom.SetSouthExit(null);
		guestBathroom.SetWestExit(null);
	}
}

