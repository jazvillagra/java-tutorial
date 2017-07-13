
class C extends A {
	C(int a){
		super(a);
		B b = new B(a);
		System.out.print("C constructor");
	}
}
