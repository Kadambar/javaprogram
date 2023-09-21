package chapter2.java;

public class Bird {
 Bird(){System.out.println("Bird is created");}
}
class Sparrow extends Bird{
	Sparrow(){
		super();
		System.out.println("Sparrow is created");
	}
}
class TestSuper3{
	public static void main(String[]args) {
		Sparrow s=new Sparrow();
	}
}