class A {
	String org = null;
	A(int a) {
		System.out.println("A constructor");
	}
	public void method(Object arg) {
	    if(org  == null) {
	    	System.out.println("Is null");
	        // do something
	    } else {
	        // do something
	    }
	}
	public void method() {
	    method(null);
	}
}
