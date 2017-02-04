class C {
	C(){

	}
	void test(){
		System.out.println("test() in class C");
	}
	
}

class B extends C
{	
	B(){
	
	}
	void test(){
		System.out.println("test() in class B");
	}
	void show(){
		super.test();
	}
}


class A extends B
{
	A(){

	}
	void test(){
		System.out.println("test() in class A");
	}
	
	public static void main(String s[])
	{
		B b = new B();
		b.show();
	}
}