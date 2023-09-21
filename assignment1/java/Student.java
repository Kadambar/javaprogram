package Assignment1.java;

public class Student {
int Rollno;
String name;
float percentage;
Student(int Rn,String n,float per){
	this.Rollno=Rn;
	this.name=n;
	this.percentage=per;
}

void display()
{

    System.out.print("Student Rollno = " + Rollno + "  "
                     + " Student Name = " +name+ "  " +"Student Percentage = "+percentage);

    System.out.println();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(50,"Kadambari",80f);
Student s2=new Student(51,"Charushila",87f);
Student s3=new Student(52,"Shweta",90f);
Student s4=new Student(53,"Snehal",70f);
Student s5=new Student(54,"Toshita",88f);
	
s1.display();
s2.display();
s3.display();
s4.display();
s5.display();
	
	}
}