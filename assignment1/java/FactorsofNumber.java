package Assignment1.java;

public class FactorsofNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=30;
		System.out.println("Factors of "+number+" are : ");
		for(int i=1;i<=number;i++) {
			if(number % i == 0) {
				System.out.println(i+"");
			}
}
}
}