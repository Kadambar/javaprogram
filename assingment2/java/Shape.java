package assingment2.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Shape {
	abstract public void calc_area();
	 abstract public void calc_volume();
	 final float pi=3.14f;
	}

	class Sphere extends Shape{
	 double r;
	 private double area;
	 private double volume;
	 public void accept() throws IOException{
	  System.out.println("Enter the radius of the Sphere: ");
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  r=Double.parseDouble(br.readLine());
	 }
	 public void calc_area(){
	  area=pi*r*r;
	 }
	 public void calc_volume(){
	  
	  volume=1.33333333334*pi*r*r*r;
	 }
	 public void display(){
	  calc_area();
	  calc_volume();
	  System.out.println("The area of sphere is: "+area);
	  System.out.println("The volume of sphere is: "+volume);
	 }
	}

	

	class Cylinder extends Shape{
	 double r,h,area,volume;
	 public void accept() throws IOException{
	  System.out.println("Enter radius and height of the Cylinder: ");
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  r=Double.parseDouble(br.readLine());
	  h=Double.parseDouble(br.readLine());
	 }
	 public void calc_area(){
	  area=(2*pi*r*h)+(2*pi*r*r);
	 }
	 public void calc_volume(){
	  volume=pi*r*r*h;
	 }
	 public void display(){
	  calc_area();
	  calc_volume();
	  System.out.println("The area of Cylinder is: "+area);
	  System.out.println("The volume of Cylinder is: "+volume);
	 }
	

	

	 
	 public static void main(String [] args)throws IOException{
	  Sphere s=new Sphere();
	  s.accept();
	  s.display();
	 
	  Cylinder cy=new Cylinder();
	  cy.accept();
	  cy.display();
	 
	 }
	}

