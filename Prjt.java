import java.util.Scanner;

public class Prjt {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double num1, num2, result;
	char operator;
	
	System.out.println("type the first number: ");
	num1 = sc.nextDouble();
	System.out.println("what operation need to do ? " 
			+"\n+"
			+"\n-"
			+"\n*"
			+"\n/"
			+"\n^"
			);
	operator = sc.next( ).charAt(0);
	System.out.println("type the second number: ");
	num2 = sc.nextDouble();
	
	
	switch (operator) {
	
	case '+': 
	result = num1 + num2;
	break;
	
	case '-':
	result = num1 - num2;
	break;
	
	case '*':
	result = num1 * num2;
	break;
	
	case '/': 
	result = num1 / num2;
	break;
	
	case'^':
	result = Math.pow(num1, num2);
	break;
	
	default:
		System.out.println(" invaled operation");
		return;
	}

	System.out.println(+ num1 + " " + operator + " " + num2 + " = " + result + " ");	
			
	
	

	}

}
