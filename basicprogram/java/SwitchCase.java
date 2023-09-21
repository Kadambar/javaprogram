package basicprogram.java;


public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char operator;
double number1;
double result;
double number2;
Scanner input=new Scanner();
System.out.println("Choose an operator:+,-,*,or/");
operator=(char) input.nextDouble();
System.out.println("Enter first number");
number1=(double) input.nextDouble();
System.out.println("Enter second number");
number2=(double) input.nextDouble();
switch(operator) {
case'+':
	result=number1 + number2;
	System.out.println(number1 + "+" + number2 + "=" +result);
	break;
case'-':
	result=number1 - number2;
	System.out.println(number1 + "-" +number2 + "=" +result);
	break;
default:
	System.out.println("Invalid operator!");
	break;
}
input.close();
	}

}
