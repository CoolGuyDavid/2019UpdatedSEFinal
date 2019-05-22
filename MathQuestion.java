import java.util.Random;
import java.util.Scanner;

public class MathQuestion {
	
	public MathQuestion() {
		Random rand = new Random();
		int decision = rand.nextInt(3);
		
		int num1 = rand.nextInt(50);
		int num2 = rand.nextInt(50);
		char operator = 'f';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To continue, solve the following puzzle:");
		switch(decision) {
		case 0:
			operator = '+';
			break;
		case 1:
			operator = '-';
			break;
		case 2:
			operator = '*';
			break;
		}
		
		System.out.println(num1 + "" + operator + "" + num2 +"=\n>");
		int realAns = 0;
		if(decision == 0) {
			realAns = (num1+num2);
		}else if(decision == 1) {
			realAns = (num1-num2);
		}else if(decision == 2) {
			realAns = (num1*num2);
		}
		int userAns = sc.nextInt();
		for(int i=0; i<5; i++) {
			if(userAns==realAns) {
				System.out.println("Correct!");
				break;
			}else {
				System.out.println("Incorrect, try again.");
				userAns = sc.nextInt();
			}
		}
		
		System.out.println();
			
	}
	
}
