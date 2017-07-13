
public class Stem extends Root {

	Stem(int i) {
		super(i);
		Component1 n1 = new Component1(i);
		Component2 n2 = new Component2(i);
		Component3 n3 = new Component3(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem s = new Stem(10);
	}

}
