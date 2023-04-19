package Arrays;
import java.util.Scanner;

/**
 * Java program that demonstrates how to work with arrays.
 *
 * @author Nyanjui
 */
public class TotalAndMeanScore
{

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        byte unit[] = new byte[5];
        int totalScore = 0;
        float meanScore;
//Prompt the user for the scores in the various units
        for (int n = 0; n < unit.length; n++)
        {
            System.out.println("Please enter the score for Unit " + (n + 1));
            unit[n] = userInput.nextByte();
            totalScore += unit[n];
        }
        meanScore = totalScore / unit.length;
//Display the outcome
        System.out.printf("%-7s\t%7s\n", "Unit", "Score");
        for (int n = 0; n < unit.length; n++)
        {
            System.out.printf("%-7s\t%7d\n", "Unit" + (n + 1), unit[n]);
        }
        System.out.println("-----------------------------------");
        System.out.printf("Total Score: %d\t Mean Score: %.2f\n",
                totalScore,meanScore);
    }

}