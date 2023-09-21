package Assignment1.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyNumber{
	int a;
	int b;
MyNumber(){
	a=0;
}
MyNumber(int b){
	this.b=b;
}
static void ispositive(int b) {
	 if(b>0){
		    System.out.println("Positive");
		    
		    }
		    else
		    {
		    	 System.out.println("Negative");
		    }
	//	if(b>0) 
//		return true;
//	else 
//		return false;
//		
}
static void iseven(int b) {
	if(b%2==0) {
		System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}
}
  public static void main(String[]args) throws NumberFormatException, IOException {
	
	  System.out.println("a = "+0);
	    BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter a number : ");
	    int b=Integer.parseInt(br.readLine());
	    MyNumber m=new MyNumber();
	    m.ispositive(b);
	    m.iseven(b);
	    
	    //	    if(m.ispositive(b)) {
//	    System.out.println("Positive");
//	    
//	    }
//	    else
//	    {
//	    	 System.out.println("n");
//	    }
	    	
	  
 }
  
	  
	  
	  }
		