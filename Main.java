package hangman;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("Please choose level: Easy[1] Medium[2] Advance[3]");
			int chosenLevel = Level.choose(chosenLevel = sc.nextInt());
			
			System.out.println("How many lives?[1-9]: ");
			int chosenLife =  Lives.howMany(chosenLife = sc.nextInt()); 
			
			System.out.println("Welcome to the Game Hangman :D");
			String password = "xxxxx";
			System.out.println("Password to win: " +Game.password(chosenLevel, password ));
			
			System.out.println("Select the character: ");
			char character = 'x';
			char chosenCharacter = Character.characterGame(character);
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

class Lives
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

class Game
{
	//public static String password;

	static String password(int level,String password) {
		if(level==1)
		{
			password = "Dog";
		}
		else if(level==2)
		{
			password = "Cat and Dog";
		}
		else if(level==3)
		{
			password = "The best game of the year";
		}
		return password;
	}
	
}
class Character 
{
	static char characterGame(char character)
	{
		Scanner sc = new Scanner(System.in);
		character  = sc.next().charAt(0);
		System.out.println(character );
		return character ;
	}	
}
