import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;
public class Main {
    public static String guess(String guess, String target)
    {
        Scanner scannerout = new Scanner(System.in);
        while (guess.length() != target.length())
        {
            guess = scannerout.nextLine().toUpperCase();
            if (guess.length() != target.length())
            {
                System.out.println("Invalid guess, try again ");
            }
        }
        return guess;
    }
    public static boolean equality(String target, String guess)
    {
        if (target.equals(guess))
        {
            System.out.println("Congrats, you won!");
            return true;
        }
        else
        {
            System.out.println("Not the word.");
            return false;
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        String targetword = "", guess = "";
        int guess_counter = 0;
        Scanner scannerin = new Scanner(new FileReader ("/Users/malihatasnim/Desktop/projects/Wordle/src" +
                "/valid-wordle-words.txt"));
        List<String> wordlist = new ArrayList<String>();
        while (scannerin.hasNext())
        {
            wordlist.add(scannerin.next());
        }
        targetword = "aahed";
        targetword = targetword.toUpperCase();
        int attempt = 1;
        while (attempt < 7)
        {
            System.out.println("Guess counter: " + attempt);
            attempt++;
            guess = " ";
            guess = guess(guess,targetword);
            if (equality(targetword, guess))
            {
                break;
            }
        }
        if (attempt >= 6)
        {
            System.out.println("No more guesses left. The word was: " + targetword);
        }
    }
}