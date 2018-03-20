//Hangman game, that randomly generates a word and prompts the user to guess one letter at a time.

import java.util.*;
public class GameHangman{
public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	char iterate;	
	
	String words[] = {"program", "write", "that", "application", "guess", "random", "add", "anything" };
	
	System.out.println("GUESS THE WORD");
	System.out.println("---------------------------------------------------------------------------------------");
	System.out.println("For hint the possible words are- program, write, that, application, guess, random, add, anything");
	do
	{
		int count=0;
		int rand = (int)( 0 + Math.random()*words.length);

		// To show the word, incase if you feel difficulty in guessing the word
		//	System.out.println("Guess the word :- " +words[rand]);
	
		String guess = "";
		for(int i=0; i<words[rand].length();i++)
			guess += "*";
			
	
	
		while(guess.indexOf('*')!=-1)
		{
			System.out.print("\n(Guess) Enter a letter (single character) in word "+guess+" >\t");
			int flag=0;
			String l = in.next();
			l=l.toLowerCase();
			char[] guess1 = guess.toCharArray();
			for(int i=0; i<words[rand].length();i++)
			{
				if( words[rand].charAt(i) == l.charAt(0))
				{
					guess1[i]=l.charAt(0);
					flag=1;
				}
					
			}
			if(flag == 1)
			{
				guess = String.valueOf(guess1);
				System.out.println("Yeah! Correct");
			}
			else
			{
				System.out.println("Wrong! "+l+" is not in word");
				count++;
			}
		}
	
		if(guess.indexOf('*')==-1)
			System.out.println("The word is "+guess);
		if( count != 0)
			System.out.println("You missed "+ count +" time.\n");
		System.out.println("Do you wanna continue (Y/N)");
		String choice=in.next();
		iterate = choice.charAt(0);
		
		
	}while(iterate == 'Y' || iterate == 'y');		

	System.exit(0);

}

}

