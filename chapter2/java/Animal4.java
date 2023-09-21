package chapter2.java;

public class Animal4 {
	
		String color="white";
	}
	class Dog4 extends Animal4{
		String color="black";
		void printColor() {
			System.out.println(color);
			System.out.println(super.color);
		}
	}
	class TestSuper1 {
	public static void main(String[]args) {
		Dog4 d=new Dog4();
		d.printColor();
	}
}
