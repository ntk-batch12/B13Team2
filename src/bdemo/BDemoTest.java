package bdemo;

public class BDemoTest {

	public static void main(String[] args) {
		System.out.println("Team 2");

		// Eric's comment
		int a = 3;
		int b = 5;
		System.out.println(a + b);
		
		// part2: Razia calling method
		getDiff(30,20,10);
		getDiff(100,50,30);
		getDiff(200,100,50);
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
		if (a==b) {
			System.out.println("I am lost");
		}
        
		// Shahed's 
		int A = 10;
		int B = 20;
		 
		if ( A > B)
			System.out.println("Great");
	}
		
//*HOMEWORK ASSIGNMENT	
		//ERIC'S FIRST 
		
	public void subtract(int x, int y) {
			System.out.println(x - y);
		
	}
	// part1: Razia's code
	public static void getDiff(int a ,int b,int c) {
		System.out.println(a-b-c);
	}
}
