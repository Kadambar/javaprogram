package chapter2.java;

public class AnimalSuper2 {
void eat() {System.out.println("eating...");}
}
class Lion extends AnimalSuper2{
    void eat() {System.out.println("eating meat...");}
	void roar() {System.out.println("roaring...");}
	void work() {
		super.eat();
		roar();
	}
}
class TestSuper2{
	public static void main(String[]args) {
		Lion l=new Lion();
		l.work();
		l.eat();
	}
}