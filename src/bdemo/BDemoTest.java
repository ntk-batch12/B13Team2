package bdemo;

public class BDemoTest {

	public static void main(String[] args) {

		System.out.println("Team 2");

		// Razia's Third code
		int num = 20;
		for (int j = 100; j >= 1; j--) {
			System.out.println(j);
			if (num == 10) {
				System.out.println("we are done with java");
			} else {
				System.out.println("we have deal with java forever");
			}	
			// Razia's calling constractor
			BDemoTest BD = new BDemoTest ();
			BD.BDemoTest(22,11);

		// Eric's comment
		int a = 3;
		int b = 5;
		System.out.println(a + b);

		// part2: Razia's calling method
		getDiff(30, 20, 10);
		getDiff(100, 50, 30); // THIS IS PRINTING
		getDiff(200, 100, 50);
		
		// part2: Razia's calling method
		BDemoTest DB = new BDemoTest();
		 int r1= DB.checkNP(-22,-22);
		 int r2= DB.checkNP(10,10);
		 int r3= DB.checkNP(22,6);
		 int r4= DB.checkNP(-1,1);
		 int r5= DB.checkNP(0,0);
		// Ivan's first code calling method to print
		nbaChamp(122, 121);
		nbaChamp(121, 122);

		// Shahed's 1st Code

		int examOne = 85;
		int examTwo = 90;
		// Fixed
		if (examOne > examTwo) {
			System.out.println("Exam One has a higher score than Exam Two.");
		} else if (examOne < examTwo) {
			System.out.println("Exam Two has a higher score than Exam One.");
		} else {
			System.out.println("Both exams have the same score.");
		}

		// Shahed's 2nd code

		int[] exams = { 85, 90 }; // THIS IS NOT PRINTING - Fixed - Shahed

		for (int i = 0; i < exams.length; i++) {
			System.out.println("Exam " + (i + 1) + " score: " + exams[i]);
		}
		}
	}

	private void BDemoTest(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	// implemented a new method called add()
	// Adriana

	public void add(int a, int b) {
		System.out.println(a + b);

		// If statement
		// Ivan

		int team2 = 1000;
		int otherTeams = 0;

		if (team2 > otherTeams) {
			System.out.println("WE THE BEST");
		}
		// Razia's
		if (a == b) {
			System.out.println("I am lost");
		}

		// Shahed's
		int A = 10;
		int B = 20;

		if (A > B)
			System.out.println("Great");
	}

	// *HOMEWORK ASSIGNMENT
	// ERIC'S 1st Code

	public void subtract(int x, int y) {
		// THIS IS NOT PRINTING
		// we have to call it directly from the main method. Shahed
		System.out.println(x - y);

	}

	// part1: Razia's code
	public static void getDiff(int a, int b, int c) { // THIS IS PRINTING
		System.out.println(a - b - c);
	}

	/**
	 * Hello Team,
	 * 
	 * Adriana's 1st code
	 */

	public static int homework(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) // THIS IS NOT PRINTING
			result = i;
		return result;
	}

	// Eric's Second Code

	public static String getNumber(int number) {
		String resultA = "";

		if (number > 0) {
			resultA = "POSITIVE";
		} else if (number < 0) { // THIS IS NOT PRINTING
			resultA = "negative";
		} else {
			resultA = "ZERO";
		}

		return resultA;
	}

	// Razia's second code
	public  BDemoTest(int a,int b) {
		System.out.println(a*b); // THIS IS NOT PRINTING
	}                           // I fixed it 

	public BDemoTest() {
		// TODO Auto-generated constructor stub
	}

	// ERIC'S Third Code
	public void doWhileLoop() {
		int i = 1;

		do {
			System.out.println(i); // THIS IS NOT PRINTING
			i++;

		} while (i <= 5);
	}

	// Adriana's 2nd code
	// Coffee method()

	public static void drinkCoffee(String mood) {

		if (mood.equals("sad") || mood.equals("tired") || mood.equals("sleepy") || mood.equals("off")) {

			System.out.println("Have some coffee!!!...");
			// THIS IS NOT PRINTING
		} else {

			System.out.println("Wake up and start coding!!!.....");
		}

	}

	// Ivan's first code
	public static int nbaChamp(int lakers, int celtics) {
		int result = 0;

		if (lakers > celtics) {
			System.out.println("NBA Champion is the LOS ANGELES LAKERS");
		} else {
			System.out.println("NBA Champion is BOSTON CELTICS ");

		}

		return result;
	}

	// Hello team, we need to figure out why the certain codes are not running
	// I believe is that some of them are are not called at the main method
	// Remember if you are doing a method you need to call it in the main

	
	
	
	
	// Adriana's 3rd code
	// my life cycle

	int time = 8;
	{

		if (time < 8) {
			System.out.println("give me coffee");
		} else {
			System.out.println("Hey how are you?");

		}

	}
	//Eric's fourth and final code
	public void withdraw() {
		int balance = 4;
		int withdrawAmount = 2;
		if (withdrawAmount <= balance) {
			balance = balance - withdrawAmount;
			System.out.println(balance);
		} else {
			System.out.println("You Cannot Withdraw More than your Current Balance");
		}
	}
	// Part 1: Razia's fourth code 
	public int checkNP(int a,int b) {
		int result=0;
		if (a < 0 || b<0) {
			System.out.println("Negaitve number");
		}else if (a>=0 || b>=0) {
			System.out.println("positive number");
		}
		
		
		
		return result;
	}
	
	
}
