
public class SpaceShip extends SpaceShipControls {
	private String name;
	public SpaceShip(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String toString(){
		return name;
	}
	public static void main(String []args){
		SpaceShip protector = new SpaceShip("NSEA Protector");
		protector.forward(110);
	}
}
