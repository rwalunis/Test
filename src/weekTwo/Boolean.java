package weekTwo;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//week two video:
		//equality operator is two equal signs ==
		System.out.println(2 == 2);
		//when ran, it will read true
		System.out.println(2 >5);
		System.out.println(3 <=5);
		System.out.println(5 < 5);
		// && and || or
		System.out.println(2 == 2 && 1<5);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(2 == 2 || 1 == 5);
		System.out.println(2 == 2 && 1 == 5);
		
		///Conditionals---If Statement
		String name = "Tom";
		
		if (name == "Sam") {
			//any code written within these curly braces will be executed if it is deemed true 
			//(if name equals sam)
			System.out.println("Hello, Sam!");
			//if the name equaled tom, nothing would print out in the console 
			//because it would then be false
		} else {
		    System.out.println("You are not Sam, " + name);
		}	
		 int age = 14;
		 
		 if (age >= 16) {
			System.out.println("You can get your liscense.");
		 } else {
			 System.out.println("Please wait " + (16 - age) + " year(s) to get your license.");
			 
		 }
		 
		 double costOfMilk = 2;
		 
		 if (costOfMilk <= 2) {
			 System.out.println("Buying 2");
		 } else if (costOfMilk <= 3) {
			 System.out.println("Buying 1");
		 } else {
			 System.out.println("Not buying any.");
			 
			 
		 }
		 
		 char grade = 'A';
		 
		 switch (grade) {
		 case 'A':
			 System.out.println("90%");
			 
		 case 'B':                                                     			 System.out.println("80%");
			
		 case 'C':
			 System.out.println("70%");
			 
			 default:
				 System.out.println("0%");
				 
		 }
		 
	}
		 
		 
	}


