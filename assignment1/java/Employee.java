package Assignment1.java;

public class Employee {
int id;
String name;
float salary;
Employee(int pid,String n,float sl){
	id=pid;
	name=n;
	salary=sl;
}
public void display()
{
    System.out.print("Employee Id = " + id + " Employee Name = " + name + "Employee salary = "+ salary);

    System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee[] obj=new Employee[5];

obj[0]=new Employee(1,"Arjun",45000);
obj[1]=new Employee(2,"Asmita",35000);
obj[2]=new Employee(3,"Atharv",40000);
obj[3]=new Employee(4,"Anuja",50000);
obj[4]=new Employee(5,"Avinash",30000);

for(int i=0;i<=5;i++){
obj[i].display();
	}
}
}
