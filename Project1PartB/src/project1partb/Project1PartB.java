// James Zhang
package project1partb;
import java.util.Scanner;

public class Project1PartB
{
   public static void main(String[] args)
   {
      String sugarLabel = "Sugar",
             butterLabel = "Butter",
             flourLabel = "Flour";
      int cookies;
      final double SUGAR_CUPS_PER_COOKIE = 0.03125,
             BUTTER_CUPS_PER_COOKIE = 0.02083,
             FLOUR_CUPS_PER_COOKIE = 0.0573;
      double sugarCups,
             butterCups,
             flourCups;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many cookies did you eat? ");
      cookies = keyboard.nextInt();
      
      sugarCups = cookies * SUGAR_CUPS_PER_COOKIE;
      butterCups = cookies * BUTTER_CUPS_PER_COOKIE;
      flourCups = cookies * FLOUR_CUPS_PER_COOKIE;
      
      System.out.printf("To make %d cookies you need:\n", cookies);
      System.out.printf("%8s %8.2f Cups\n", sugarLabel, sugarCups);
      System.out.printf("%8s %8.2f Cups\n", butterLabel, butterCups);
      System.out.printf("%8s %8.2f Cups\n", flourLabel, flourCups);
      
   }
}