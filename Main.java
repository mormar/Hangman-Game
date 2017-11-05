package hangman;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("Pleas choose level: Easy[1] Medium[2] Advance[3]");
			int chosenLevel = Level.choose(chosenLevel = sc.nextInt());
			
			System.out.println("How many lifes?[1-9]: ");
			int chosenLife =  Lifes.howMany(chosenLife = sc.nextInt()); 
		}
		
	}
}
class Level
{
	static int choose(int level)
	{
		switch (level) {
		case 1:
			System.out.println("Difficulty level set to easy.");
			break;
		case 2:
			System.out.println("Difficulty level set to medium.");
			break;
		case 3:
			System.out.println("Difficulty level set to advance.");
			break;
		default:
			System.out.println("");
			break;
		}
		return level;
	}
}

class Lifes
{
	static int howMany(int life)
	{
		switch (life) {
		case 1:
			System.out.println("You have one life :D.");
			break;
		case 2:
			System.out.println("You have two lives :p.");
			break;
		case 3:
			System.out.println("You have three lives:).");
			break;
		case 4:
			System.out.println("You have four lives.");
			break;
		case 5:
			System.out.println("You have five lives.");
			break;
		case 6:
			System.out.println("You have six lives.");
			break;
		case 7:
			System.out.println("You have seven lives.");
			break;
		case 8:
			System.out.println("You have eight lives.");
			break;
		case 9:
			System.out.println("You have nine lives.");
			break;

		default:
			break;
		}
		return life;
	}
}