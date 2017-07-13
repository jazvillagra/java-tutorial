
public class Water extends Detergent{

	public void scrub(){
		append(" water overrides Detergent scrubbing () \n");
		super.scrub();
	}
	
	public void sterilize(){
		append("\n sterilize()");
	}
	
	public static void main(String [] args){
		Water x = new Water();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.sterilize();
		System.out.println(x);
		System.out.println("Tasting water");
		Detergent.main(args);
		
	}
}
