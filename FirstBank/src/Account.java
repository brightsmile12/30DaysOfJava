import java.util.Scanner;

public class Account {
	
	int balance;
	int previousTransaction;

	String customername;
	String customerid;
	

	public Account(String name, String id) {
		customername = name;
		customerid = id;
	}

	
	void deposit(int amount) {
		previousTransaction = amount;
		balance = balance + amount;
	
		
	}
	
	void withdraw(int amount) {
		previousTransaction = - amount;
		balance = balance - amount;
	}
	

	

	
	void calculateInterest() {
		System.out.println("Here are the options");
		System.out.println("qq: check current interest based on my balance");
		System.out.println("zz: quick interest calculator");
		Scanner scanner = new Scanner(System.in);
		String interestoption = scanner.nextLine();
		switch(interestoption) {
		case"qq":
			//current interest rate is 1.58%
			double interest = balance + balance*0.158; 
			if(balance>0) {
				System.out.println("Your balance with an interest is " +"$"+ interest +". "+"Bank of America offers 1.58% as of now.");
				System.out.println("Thank you for doing business with us! Have a great day!!");
				System.out.println();
			}
			else {
				System.out.println("Youc current balance is zero");
				System.out.println();
			}
			break;
		case"zz":
			System.out.println("Enter the balance you want");
			int calculateBalance = scanner.nextInt();
			System.out.println("Enter the interest rate");
			double calculateInterest = scanner.nextDouble();
			
			double calculatebalance = calculateBalance + calculateBalance*calculateInterest; 
			
			System.out.println("Congrats!! You will be earning total "+"$"+calculatebalance);
			System.out.println();
			break;
		default:
			break;
		
		}


	}
	
	void showOptions() {

		String option;
		do {
			
			System.out.println("Welcome to Bank of America"+" "+ customername+"!");
			System.out.println("We are fortunate to have you and want you experience an amazing,smooth,seamless service!");
			System.out.println();
			System.out.println("Here are options you can check");
			System.out.println("aa: Check balance");
			System.out.println("bb: Make a deposit");
			System.out.println("cc: Make a withdrawl");
			System.out.println("dd: View previous transaction");
			System.out.println("ee: Calculate interest");
			System.out.println("ff: Exit");
			Scanner scanner1 = new Scanner(System.in);
			option = scanner1.nextLine();

			switch(option) {
			case "aa"://check balance
				System.out.println("Hi, you current balnce is "+"$"+ balance);
				System.out.println("Thank you for choosing, Bank of America!");
				System.out.println();
				break;
				
			case "bb"://make a deposit
				System.out.println("How much would you like to deposit?");
				Scanner scanner = new Scanner(System.in);
				int deposit = scanner.nextInt();
				deposit(deposit);
				System.out.println("You have succesufully deposited "+"$" +deposit);
				System.out.println("Your current balance is "+"$" +balance);
				System.out.println();
			
				break;
				
			case "cc": //make a withdrawl
		
				if(balance>0) {
					
					System.out.println("How much would you like to withdraw?");
					Scanner scanner11 = new Scanner(System.in);
					int withdrawl = scanner11.nextInt();
					if(balance-withdrawl>0) {
						withdraw(withdrawl);
						System.out.println("You have been succesufully withdraw "+"$" +withdrawl);
						System.out.println("Your current balance is "+"$" +balance);
						System.out.println();
					}
					else {
						System.out.println("We are not able to process the withdrawl more than current balance.");
						System.out.println();
					}

				}
				else {
					System.out.println("Unfortunately, you cant make any withdraw. Your current balance is zero.");
					System.out.println();
				}

				
				break;
				
			case "dd"://view previous transaction
				if(previousTransaction>0) {
					System.out.println("--previous transaction--");
					System.out.println("You had deposited " +"$"+previousTransaction);
					System.out.println();
				}
				else if(previousTransaction<0){
					System.out.println("Your previous transaction:");
					System.out.println("Your had withdrawn " +"$"+ previousTransaction);
					System.out.println();
				}
				break;
			case "ee"://calculate interest
				calculateInterest();
				
				break;
			case "ff"://exit
	
				break;
				
			default:
				System.out.println("Re-enter your option again!");
				break;
			}
			
			
			
		}while(!option.equals("ff"));
		
	}
	
	

}
