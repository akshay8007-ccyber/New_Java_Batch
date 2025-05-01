class Ticket {

	/* Ticket class 
	 * Constructor chaining
	 * First Constructor - When user doesn't provide anything
	 * name gets initialized to "Guest"
	 * Second Constructor - When user give name but doesn't give destination and seatType
	 * destination gets initialized to "Not Specified"
	 * Third Constructor - When user give name and destination 
	 * seatType gets initialized to "General"
	 * Fourth Constructor - It has all parameters which gets initialized to Ticket information
	 * All done through constructor chaining
	 * */
	
	private String name;
	private String destination;
	private String seatType;

	Ticket() {
		this("Guest");
	}

	Ticket(String name) {
		this(name, "Not specified");
	}

	Ticket(String name, String destination) {
		this(name, destination, "Genral");
	}

	Ticket(String name, String destination, String seatType) {
		super();
		this.name = name;
		this.destination = destination;
		this.seatType = seatType;
	}

	@Override
	public String toString() {
		return "Ticket [name=" + name + ", destination=" + destination + ", seatType=" + seatType + "]";
	}

}

public class ConstructorChaining {

	public static void main(String[] args) {

		Ticket t1 = new Ticket();
		System.out.println(t1);
		Ticket t2 = new Ticket("Ramesh");
		System.out.println(t2);
		Ticket t3 = new Ticket("Suresh", "Pune");
		System.out.println(t3);
		Ticket t4 = new Ticket("Ganesh", "Mumbai", "First AC");
		System.out.println(t4);

	}

}