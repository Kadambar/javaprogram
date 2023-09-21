package assingment2.java;

import java.util.Scanner;

public class Student {
	
		static int rollno;
		static int count;
		String name;
		Scanner s=new Scanner(System.in);
		
		Student()
		{
		
		
		count++;
		System.out.println("Enter rno and Name ");
		  rollno = s.nextInt();
		 name = s.next();
		}
		Student(int rno,String name)
		{
		count++;
		this.rollno=rno;
		this.name=name;
		}
		public String toString()
		{
		return "Number of object create by user "+count;
		}
		void show()
		{
		
		System.out.println(rollno+" "+name);
		}
		};
		class Slip5_1
		{
		public static void main(String[] args)
		{
		Scanner s=new Scanner(System.in);
		int rno;
		Student s1=new Student();
		String name;
		System.out.println(s1);
		System.out.println("Enter rno and name");
		rno=s.nextInt();
		name=s.next();
		Student s2=new Student(rno,name);
		System.out.println(s2);
		s1.show();
		s2.show();
		}
		
}
