package assingment2.java;

public class IndoorGame {
	 String gamename;
	 String playername;
	 IndoorGame(String g,String p){
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
		 IndoorGame i=new IndoorGame("Chess","Rameshbabu Praggnanandhaa");
		 IndoorGame i1=new IndoorGame("Carrom","Rashmi Kumari");
		 IndoorGame i2=new IndoorGame("Table Tennis","Manika Batra");
		 IndoorGame i3=new IndoorGame("Snooker","Pankaj Advani");
		 System.out.println("Indoor Games : ");
		 i.display();
		 i1.display();
		 i2.display();
		 i3.display();
	 }
	 
}