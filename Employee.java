package assingment2.java;


import java.util.Scanner;

public class Employee {
	
	
	private int id;
	 private String name;
	private String dept;
	 private double salary;
	 
 public Employee()
 {
	 id=0;
	 name=null;
	 dept=null;
	 salary=0.0;
 }
 public Employee(int id,String name,String dept,float sal)
	 {
	  this.id=id;
	  this.name=name;
	  this.dept=dept;
	  this.salary=sal;
	 }
	
	 public void acceptE()                   
	 {
		 Scanner s=new Scanner(System.in);
	  System.out.println("Enter id");
	 id=s.nextInt();
	  System.out.println("Enter Name");
	  name=s.next();
	  System.out.println("Enter Department name");
	  dept=s.next();
	  System.out.println("Enter sal");
salary=s.nextDouble();
	 }
	 public void displayE()
	 {
	  System.out.println("Id is:"+id);
	  System.out.println("Name of employee is:"+name);
	  System.out.println("Name of Department is:"+dept);
	  System.out.println("Sal is:"+salary);
	 }
	 public double salary()
	 {
		 return salary;
	 }
	}
	class Manager extends Employee
	{
	 private double bonus;
	 public void acceptM()
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter bonus : ");
		 bonus=s.nextDouble();
	 }
	 public void displayM()
	 {
		 System.out.println("Manager bonus : "+bonus);
	 }
	 public static int max(Manager m[],int n)
	 {
		 double max=0;
		 int t=0;
		 for(int i=0;i<n;i++)
		 {
			 if(max<(m[i].salary()+m[i].bonus))
			 {
				 max=m[i].salary()+m[i].bonus;
				 t=i;
			 }
			}
		 System.out.println("\nMax salaty : "+max);
		 return t;
	 }
	}
	class ex3setal
	{
		public static void main(String args[])
		{
			int n,i,ans;
			Scanner s=new Scanner(System.in);
			System.out.println("\n Enter how many records .\n");
			n=s.nextInt();
			Manager m[]=new Manager[n];
			for(i=0;i<n;i++)
			{
				m[i]=new Manager();
				m[i].acceptE();
				m[i].displayE();
				m[i].acceptM();
				m[i].displayM();
			}
			ans=Manager.max(m, n);
			m[ans].displayE();
			m[ans].displayM();
		}
	}
	  