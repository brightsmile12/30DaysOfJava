import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator world!");
		char operator;	
		do {
			System.out.println("Choose operators among these");
			System.out.println("+,-,*,/");
			System.out.println("To stop the calculator press $");
			Scanner scanner = new Scanner(System.in);
			operator = scanner.next().charAt(0);
			System.out.println("Enter the first number");
			double operand1 = scanner.nextDouble();
			System.out.println("Enter the next number");
			double operand2 = scanner.nextDouble();
			
			
			switch(operator) {
			case '+':
				double result = operand1+operand2;
				System.out.println(operand1+"+"+operand2+" equals to "+ result);
				System.out.println();
				break;
			case '-':
				result = operand1-operand2;
				System.out.println(operand1+"-"+operand2+" equals to "+ result);
				System.out.println();
				break;
			case'*':
				result = operand1*operand2;
				System.out.println(operand1+"*"+operand2+" equals to "+ result);
				System.out.println();
				break;
			case'/':
				result = operand1/operand2;
				System.out.println(operand1+"/"+operand2+" equals to "+ result);
				System.out.println("This number is rounded number.");
				System.out.println();
				break;
		
			}
			
		}while(operator!='$');

		
		
		
	}

}
