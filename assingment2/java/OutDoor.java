package assingment2.java;

public class OutDoor {
	String gamename;
	 String playername;
	 OutDoor(String g,String p){
		 gamename=g;
		 playername=p;
	 }
	 public void display()
	 {
	     System.out.print(" Game Name = " + gamename + "  "
	                      + "  Player Name = " +playername);

	     System.out.println();
	 }
	 public static void main(String[]args) {
		 OutDoor i=new OutDoor("Cricket","Virat Kohli");
		 OutDoor i1=new OutDoor("Soccer","Sunil Chetri");
		 OutDoor i2=new OutDoor("Tennis","Saina Nehval");
		 OutDoor i3=new OutDoor("Hockey","Dhyan chand");
		 System.out.println("Outdoor Games : ");
		 i.display();
		 i1.display();
		 i2.display();
		 i3.display();
	 }
}
