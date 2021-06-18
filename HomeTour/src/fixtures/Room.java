package fixtures;

public class Room extends Fixture{
	private Room[] exits = new Room[4];
	//{North exit, East exit, South exit, West Exit}

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	public String getShortDesc() {
		return shortDescription;
	}
	
	public String getLongDesc() {
		return longDescription;
	}
	
	public Room getNorthExit() {
		return exits[0];
	}
	
	public Room getEastExit() {
		return exits[1];
	}
	
	public Room getSouthExit() {
		return exits[2];
	}
	
	public Room getWestExit() {
		return exits[3];
	}
	
	public void SetNorthExit(Room exit) {
		exits[0] = exit;
	}
	
	public void SetEastExit(Room exit) {
		exits[1] = exit;
	}
	
	public void SetSouthExit(Room exit) {
		exits[2] = exit;
	}
	
	public void SetWestExit(Room exit) {
		exits[3] = exit;
	}
	
}
