package chapter2.java;

class Employee {
float salary=40000;
}
class Programmer extends Employee{
	int bonus=10000;
public static void main(String[] args) {
		// TODO Auto-generated method stub
Programmer p=new Programmer();
System.out.println("Programmer salary is : "+p.salary);
System.out.println("Bonus of Programmer is : "+p.bonus);
	}
}

