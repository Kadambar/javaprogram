package Assignment1.java;

public class Product {
int id;
String name;
float price;
Product(int pid,String n,float pr){
	id = pid;
	name=n;
	price=pr;
}
public void display()
{
    System.out.print("Product Id = " + id + "  "
                     + " Product Name = " +name+"Product Price = "+price);

    System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product[] obj = new Product[5];


obj[0] = new Product(101, "Oppo",25500);
obj[1] = new Product(102, "Redme",53700);
obj[2] = new Product(103, "Nokia",36300);
obj[3] = new Product(104, "Apple",56300);
obj[4] = new Product(105, "Samsung",44300);


System.out.println("Product object 1 : ");
obj[0].display();
System.out.println("Product object 2 : ");
obj[1].display();
System.out.println("Product object 3 : ");
obj[2].display();
System.out.println("Product object 4 : ");
obj[3].display();
System.out.println("Product object 5 : ");
obj[4].display();

}

}