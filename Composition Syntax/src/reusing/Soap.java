package reusing;

class Soap {
	public String s;
	Soap() {
		System.out.print("Soap()");
		s= "Constructed";
	}
	public String toString() {
		return s;
	}
}
