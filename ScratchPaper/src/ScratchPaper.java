ximport java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner; //a package, where contains classes
	
public class ScratchPaper {//public(access modifier) class
	//MySweetProgram(class)
	
	double PI = 3.1459;

	public static void main(String[] args) {//this is where we define "main" manually
		//public(access modifier) static(enable run w/o creating
		//instances) main(method)
		//
		System.out.println("What is your name?");// Class. method. method(arguments)
		//Structure when creating an object(instance of a class)
		//class identifier = new class();
		
		
		//type identifier = type class ()
		Scanner scanner = new Scanner(System.in);// data type scanner= new data type(class.method)
		String name = scanner.nextLine();
		System.out.println("Hello " + name +"!");
		
		int x = 7;//primitive type... primtive type DOES NOT REQUIRE A CLASS
		//There are 8: boolean , byte , char , short , int , long , float and double  
		
		
		//however you can define int in a 'reference type'meaning using class by following
		//This enables "Integer"in this case considered a class, to create an object,y.
		
		Integer y = 8; // This "reference type" and conversion to an object(y) is called
						//"autoboxing"
		
		// it will look like this in a regular reference type
		//Integer y = new Intger() but this is not how it acutally looks because it is an integer

		//Java is statically typed(meaning every variable has date type when delcaring)
		//javascript is dynamically type(variables dont have types)
		
		//primtive types(dont have a class),byte,int,boolean
		//reference types
		
		
		
		int z;// declaration
		
		z=6;//assigning value called "initialization"
		
		
		// what about sometihng that cannot vary or change
		
		
		//This is called "Constant" and when we declare constant we always use a CAPITAL Letter		
		
		final int Y;
		Y=7;
		
		
		ScratchPaper myScratchPaper = new ScratchPaper();
		double t = myScratchPaper.PI;
		System.out.println(t);
		
		
		//String Object
		String a = new String("hi");  // creating a particular object of 'a'
		String b = new String("hi");  // creating a particular object of 'b'
		
		System.out.println(a==b);
		
		//String Literal(interning, the new reference var will be poiting to the already existing literal)
		String c = "hi"; // creating an object but its not specifically assigned
		String d = "hi"; //this uses an interning process where assigning value is on the same memory.
						// therefore c==d "location" is equal(true).
		// "hi" string is already interned b the complier
		
		System.out.println(c==d);
		
		
		System.out.println("How old are you?");
		Scanner scanner = new Scanner(System.in);
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("dogs or cats");
		String animal = scanner.nextLine();
		
		if(age>12 && !animal.equals("dogs")) {
			System.out.println("Welcome!");
		}
		
		//  binary operator (+,-), two operands
		//  unary operator (!),  one operand
		//  ternary operator (), three opearnds, this is also known as "conditional operator"
		
		String name = "Clare";
		boolean welcome = name.equals("Clare") ? true : false;
		
		
		
		
		
		//
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int date = scanner.nextInt();
		String dayString;
		
		switch(date) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday"; //String literal
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid number";
			break;
			
		}
		System.out.println(dayString);
		
		
		
		//
		
		
		
		/*while loops has
		 * 
		 * icu
		 * 
		 * initalization --iterator
		 * condition
		 * upadate -- iteration
		 * 
		 * */
		
		System.out.println("Guess the password");
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		String password = "iphoneisthebest";
		
		while(!password.equals(guess)) {
			System.out.println("Guess the password");
			guess = scanner.nextLine();
		}
		System.out.println("Congrats!");
		
		
		
		
		
		//
		String password = "iphoneisthebest";
		Scanner scanner = new Scanner(System.in);
		String guess;
		
		
		//"while" loop is
		//as long as this,  do this
		
		//"do while" is
		//"do" this as long as it meets the conditions
		do {
			System.out.println("Guess the passord");
			guess = scanner.nextLine();
			
		}while(!guess.equals(password));
		
		System.out.println("Congrats bro!!");
		scanner.close();
		
		
		
		
		
		
		
		// for loops
		
		
		
		//for(statement1, statement2, statement 3)
		//statement1: initalization
		//statement2: condition
		//statement3: update and will be executed when function has been executed
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		
		
		
		
		for(int i=0;i<10;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
			
		}
		
		
		//
		int i = 0;
		for(;i<10;i++) {
			System.out.println(i);
		}
		
		
		
		//while loop
		
		int i=0;
		
		
		while(i<10) {
			
			int k=0;
			
			while(k<=i) {
				System.out.print(k);
				k++;
			}
			
			
		System.out.println();
		i++;
		}
		
		
		//break of for loop
		
		int i;
		for(i=10;i>=0;i--) {
			for(int k=i;k>=0;k--) {
			
				System.out.print(k);
			}
			System.out.println();
			if(i==6) break;
		}
		
		
		//
		
		int i;
		
		for(i=9;i>=0;i--) {
			if(i==8) continue; 
			for(int k=i;k>=0;k--) {
				System.out.print(k);
				
			}
			System.out.println();

			
		
		// creating an array
			
			int [] grades = new int[10];
			
			grades[2]=2;
			
			
		// another way of creating an array
			
			int [] grades = {2,4,6,8,10,12,14,16,18,20};
			System.out.println(Arrays.toString(grades));


			int[][] grades = {{2,4,6,8,10},{12,14,16,18,20}};
			
			System.out.println(Arrays.deepToString(grades));
			
			
			
			//
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int size =scanner.nextInt();
			int [] grades = new int[size];
			System.out.println("Enter the elements of an array based on the array size");
		

			
			for(int i=0;i<size;i++) {
				
				grades[i]=scanner.nextInt();
				
			}
			System.out.println("Here is your array created");
			System.out.println(Arrays.toString(grades));
			
			
			
			
			//
			int numbers [] = {123,21321,1,23,14,122};
			
			Arrays.sort(numbers);
			System.out.println(Arrays.toString(numbers));
			
			
			
			int numbers [] = {123,21321,1,23,14,122};
			
			Arrays.parallelSort(numbers);
			System.out.println(Arrays.toString(numbers));

			
			//
			
			
			int[] grades1 = {1,2,3,4,5,6};
			int[] grades2 = grades1;
			
			if(grades1==grades2) System.out.println("equal");
			
			
			if(grades1.equals(grades2)) System.out.println("equals");
			
			
			if(Arrays.equals(grades1, grades2)) System.out.println("finally equal!!");
			
			//
			String[] grades = new String[5];
			
			Arrays.fill(grades, "");
			
			System.out.println(Arrays.toString(grades));
			
			List<String> testing = Arrays.asList(grades);
			
			System.out.println(testing.getClass());
			
			
			//
			
			int[][] grades = {
					{2,4,51,12},
					{1,23,14,1,3,12},
					{213,4,5,134,23,2,3},
					{2},
					{},
					{3,12,213}
			};
			
			System.out.println(grades.length); //grades.length = a number of rows
			System.out.println(grades[2].length);
			
			for(int i=0;i<grades.length;i++) {
				for(int k=0;k<grades[i].length;k++) {
					System.out.print(grades[i][k]);
				}
				System.out.println();
			}
			
			
			// List 
			
			List<Integer> grades = new ArrayList<Integer>();
			//"List" is an interface    "ArrayList" is an interface implementation
			
			//Steering wheel, pedal,control switch for awd &breaks are "interfaces"(how we work with the car)
			
			//engine,break calipers,tires,awd system are implementation
			
			
			
			
			
			//
			
			int[] school = {99,98,97,96};
			System.out.println(Arrays.toString(school));
			System.out.println(school);
			
			List<Integer> grade = new ArrayList<Integer>();
			grade.add(10);
			System.out.println(grade.get(0));
			
			List<Integer> grades = Arrays.asList(2,4,6,8,10);
			System.out.println(Arrays.toString(grades.toArray()));
			System.out.println(grades);
			
			
			//
			//
			
			List<Integer> grades = Arrays.asList(2,4,6,8,10);
			for(int i=0;i<grades.size();i++) {
				grades.set(i,grades.get(i)*2);
				System.out.println(grades.get(i));
			}
			2
			
			
			
			
			
			//
			
			//for each loop
			for(int grade: grades) {
				System.out.println(grade);
				
			}
			
			
			//
			
			
			//Making a list of numerous lists that contains Integers.
			List<List<Integer>> allGrades = new ArrayList<List<Integer>>();

			allGrades.add(Arrays.asList(2,4,6,8,10,12));
			allGrades.add(Arrays.asList(21,13,41,13,30));
			allGrades.add(Arrays.asList(2131,21321,4513,1345));
			
			for(List<Integer>grades: allGrades) {
				for(int grade: grades) {
					System.out.print(grade);
				}
				System.out.println();
			}
			
			
			
			
			
			//
			
			
			List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
			allGrades.add(Arrays.asList(2,123,12,3213,2113));
			allGrades.add(Arrays.asList(21,31,24,56,44,63,76,98));
			allGrades.add(Arrays.asList(123,343,545,756,967));
			
		
			System.out.println(allGrades);
			System.out.println();
			System.out.println();
			
			for(List<Integer> grades: allGrades) {
				for(int grade: grades) {
					System.out.print(grade+" ");
				}
				System.out.println();
			}
			
			
			
			//
			
			List<Integer> allGrades = Arrays.asList(5,3,2,4,3);
			int [] grades = new int [allGrades.size()];
			for(int i=0;i<allGrades.size();i++) {
				grades[i] = allGrades.get(i);
			}
			System.out.println(Arrays.toString(grades));
			
			//
			
			
			List<Integer> grades = Arrays.asList(11,2,144,3,123,41,3);
			
			Collections.sort(grades);
			System.out.println(grades);
			
			Collections.reverse(grades);
			System.out.println(grades);
			for(int grade: grades) {
				System.out.println(grade);
				
			}
			
			
			
			
			//CUSTOME ArrayList
			
			User user1 = new User();
			user1.setFirstName("Stephen");
			user1.setLastName("Curry");
			
			User user2 = new User();
			user2.setFirstName("Chicago");
			user2.setLastName("Bull");
			
			
			List<User> users = new ArrayList<User>();
			users.add(user1);
			users.add(user2);
			
			System.out.println(users.get(0).getFirstName());
			System.out.println(users.get(1).getFullName());
			
			//
			
			
			String[] firstNames = {"Caleb","Sam","Collin","Jacob"};
			String[] lastNames = {"Smith","Kwon","Johnson","Qualin"};
			
			List<User> users = new ArrayList<User>();

					
			for(int i=0;i<firstNames.length;i++) {
				User us = new User();
				us.setFirstName(firstNames[i]);
				us.setLastName(lastNames[i]);
				users.add(us);			
			}
			
			for(int k=0;k<users.size();k++) {
				System.out.println(users.get(k).getFullName());}
				
			for(User u:users){
				System.out.println(u.getFullName());
			}
			
		
			
			
			
			// static method & instance method
			
			//static method
			String.valueOf(false);
			
			
			//instance method
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			
			
			
			//
			//MySweetProgram.java
			
			User user1 = new User();
			user1.setFirstName("Shaquille");
			user1.setLastName("O'Neal");
			
			User user2 = new User();
			user2.setFirstName("Ashelee");
			user2.setLastName("Lee");
			
			List<User> ai = new ArrayList<User>();
			ai.add(user1);
			ai.add(user2);

			User.printUser(ai);
			
			//User.java
			public static void printUser(List<User> ai) {
				for(User u:ai) {
					System.out.println(u.getFullName());
					
				}
			}
			
			
			//
			//Setting up classes and assigning values 
			
			User user1 = new User();
			user1.setFirstName("Kobe");
			user1.setLastName("Bryant");
			
			User user2 = new User();
			user2.setFirstName("Sam");
			user2.setLastName("Kwon");
			
			//You can only add "OBJECT" here	
			//bc it can only accept "User"class' objects
			List<User> US = new ArrayList<User>();
			US.add(user1);
			US.add(user2);
			

			
			User.printUser(US);
			
			//
			public static void printUser(List<User> ai) {
				for(User dummyobj: ai) {
					System.out.println(dummyobj.getFullName());
					}
				
			.
				
				
			//
			
			
			//Setting up classes and assigning values 
			
			User user1 = new User();
			user1.setFirstName("Kobe");
			user1.setLastName("Bryant");
			
			User user2 = new User();
			user2.setFirstName("Sam");
			user2.setLastName("Kwon");
			
			//You can only add "OBJECT" here	
			//bc it can only accept "User"class' objects
			List<User> US = new ArrayList<User>();
			US.add(user1);
			US.add(user2);
			

			
			User.printUser(US);
			System.out.println();
			
			
			System.out.println(user1.output(true));
			
			
			
			
			//
			
			
			//class has members- methods and properties
			private String firstName;
			private String lastName;
			
			
			
			public String getFullName() {
				return getFirstName() +" "+ getLastName(); 
			}
			
			
			public String output() {
				return "Hi, my name is "+getFullName()+"."; 
			}
			
			public String output(boolean nice) {
				if(nice) {
					return "You are a beautiful human"+","+getFullName()+".";
				}
				return"Freak";
				
			}
			
			//Encapsulation
			//Getter
			public String getFirstName() {
				return firstName.toUpperCase();
			}
			public String getLastName() {
				return lastName;
			}
			
			//Setter
			public void setFirstName(String fn) {
				firstName = fn;
			}
			public void setLastName(String ln) {
				lastName = ln;
			}
			
			public static void printUser(List<User> ai) {
				for(User dummyobj: ai) {
					System.out.println(dummyobj.getFullName());
				}
				
				
				
				
				
			//print out what is inside of "objects" of a List
				User user1 = new User();
				user1.setFirstName("Sam");
				user1.setLastName("Kwon");
				
				User user2 = new User();
				user2.setFirstName("Awesome");
				user2.setLastName("Day");
				
				
				List<User> allUsers = new ArrayList<User>();
				allUsers.add(user1);
				allUsers.add(user2);
				
				System.out.println(user1.getFirstName());
				
				for(int i=0;i<allUsers.size();i++) {
					System.out.println(allUsers.get(i).getFullName());
				}
			
				
			//make a dummy object inside of a for loop and put every object of a list by
			// saying "User dummy: 'List name'"
				
				User user1 = new User();
				user1.setFirstName("Sam");
				user1.setLastName("Kwon");
				
				User user2 = new User();
				user2.setFirstName("Awesome");
				user2.setLastName("Day");
				
				
				List<User> allUsers = new ArrayList<User>();
				allUsers.add(user1);
				allUsers.add(user2);
				
				System.out.println(user1.getFirstName());
				
				for(int i=0;i<allUsers.size();i++) {
					System.out.println(allUsers.get(i).getFullName());
				}
				
				
				for(User dummy:allUsers )//This means you put every object inside of a list and
					//assign em to the "dummy" object 
				{
					System.out.println(dummy.getFullName());
				}
				
				
				
				System.out.println();
				System.out.println(User.searchList(allUsers, "Sam", "Kwon"));
				
				
				//User.java
				//Searching a partiular object inside a list w/ overloading method
				
				public static int searchList(List<User> users,String fn,String ln) {
					return searchList(users,fn+" "+ln);

				}
				
				public static int searchList(List<User> users,String fullName) {
					for(int i=0;i<users.size();i++) {
						if(users.get(i).getFullName().equals(fullName)) {
							return i;
							
						}
						
					}
					return -1;
				}
				
				
				
				
//interface
				

					interface human {
					String hair = "Human's hair is smooth";
					void fight();
					void walk();
					void drive();
				}


				public class MySweetProgram implements human{
					
					public static void main(String[] args) {
						
						System.out.println(hair);
						MySweetProgram ex = new MySweetProgram();
						ex.fight();
						ex.walk();
						ex.drive();
						
						
						
						
					}

					@Override
					public void fight() {
						// TODO Auto-generated method stub
						System.out.println("Humans can fight against a tiger or a bear in the wild with the use of tools");
						
					}

					@Override
					public void walk() {
						// TODO Auto-generated method stub
						System.out.println("Humans can walk upto 40 miles by themselves but they use the help of horses which help them to go beyond their ability");
						
					}

					@Override
					public void drive() {
						// TODO Auto-generated method stub
						System.out.println("Humans start to drive a car since 1900");
						
					}
				}
				
				
				
				
				
	//"Polymorphism" Poly="many" morph="form"  - form many things
				

class Animal{
	void walk(){
		System.out.println("Walk with feet");
	}
}

class Dog extends Animal{
	void walk() {
		System.out.println("Walk with four feet");
	}
}

class Cat extends Animal{
	void walk() {
		System.out.println("Walk very cautiously without making sounds");
	}
	
}

class Bird extends Animal{
	void walk() {
		System.out.println("walk with the charpping sound");
	}
}


public class MySweetProgram {
	public static void main(String[] args) {
		Animal Animal = new Animal();
		Animal.walk();
		Animal dog = new Dog();
		dog.walk();
		Animal cat = new Cat();
		cat.walk();
		Animal bird = new Bird();
		bird.walk();
		
		
	}
}
				
		
				
		
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		

		


		
	}
	
}
