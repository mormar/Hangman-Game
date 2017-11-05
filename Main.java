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
			System.out.println("Chosen level easy.");
			break;
		case 2:
			System.out.println("Chosen level medium.");
			break;
		case 3:
			System.out.println("Chosen level advance.");
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
			System.out.println("Chosen one life :D.");
			break;
		case 2:
			System.out.println("Chosen two lifes :p.");
			break;
		case 3:
			System.out.println("Chosen three lifes :).");
			break;
		case 4:
			System.out.println("Chosen four lifes.");
			break;
		case 5:
			System.out.println("Chosen five lifes.");
			break;
		case 6:
			System.out.println("Chosen six lifes.");
			break;
		case 7:
			System.out.println("Chosen seven lifes.");
			break;
		case 8:
			System.out.println("Chosen eight lifes.");
			break;
		case 9:
			System.out.println("Chosen nein lifes.");
			break;

		default:
			break;
		}
		return life;
	}
}