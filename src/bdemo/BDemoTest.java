package bdemo;

public class BDemoTest {

	public static void main(String[] args) {
		System.out.println("Team 2");

		// Eric's comment
		int a = 3;
		int b = 5;
		System.out.println(a + b);

		// part2: Razia calling method
		getDiff(30, 20, 10);
		getDiff(100, 50, 30);
		getDiff(200, 100, 50);
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
		// Razia
		if (a == b) {
			System.out.println("I am lost");
		}

		// Shahed's
		int A = 10;
		int B = 20;

		if (A > B)
			System.out.println("Great");
	}

//*HOMEWORK ASSIGNMENT	
	// ERIC'S 1st Code

	public void subtract(int x, int y) {
		System.out.println(x - y);

	}

	// part1: Razia's code
	public static void getDiff(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	// Shahed's 1st Code

	public static void main1(String[] args) {
		int examOne = 85;
		int examTwo = 90;

		if (examOne > examTwo) {
			System.out.println("Exam One has a higher score than Exam Two.");
		} else if (examOne < examTwo) {
			System.out.println("Exam Two has a higher score than Exam One.");
		} else {
			System.out.println("Both exams have the same score.");
		}

	}
	
	/**
	 *  Hello Team, 
	 *  
	 *  	Adriana's 1st code
	 */
	
	public static int homwwork(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++)
			result = i;
		return result;
	}
	
	//Eric's Second Code
	
	public static String getNumber(int number) {
		String resultA = "";

		if (number > 0) {
			resultA = "POSITIVE";
		} else if (number < 0) {
			resultA = "negative";
		} else {
			resultA = "ZERO";
		}

		return resultA;
	}
		
		// Razia's second code
		public BDemoTest(int a ,int b) {
			System.out.println(a*b);
		}

	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

